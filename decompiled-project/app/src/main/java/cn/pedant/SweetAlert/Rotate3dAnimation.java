package cn.pedant.SweetAlert;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import h3.o;
import v3.AbstractC2139a;

/* loaded from: classes.dex */
public class Rotate3dAnimation extends Animation {
    public static final int ROLL_BY_X = 0;
    public static final int ROLL_BY_Y = 1;
    public static final int ROLL_BY_Z = 2;
    private Camera mCamera;
    private float mFromDegrees;
    private float mPivotX;
    private int mPivotXType;
    private float mPivotXValue;
    private float mPivotY;
    private int mPivotYType;
    private float mPivotYValue;
    private int mRollType;
    private float mToDegrees;

    /* loaded from: classes.dex */
    public static class Description {
        public int type;
        public float value;
    }

    public Rotate3dAnimation(int i7, float f4, float f10) {
        this.mPivotXType = 0;
        this.mPivotYType = 0;
        this.mPivotXValue = 0.0f;
        this.mPivotYValue = 0.0f;
        this.mRollType = i7;
        this.mFromDegrees = f4;
        this.mToDegrees = f10;
        this.mPivotX = 0.0f;
        this.mPivotY = 0.0f;
    }

    public Rotate3dAnimation(int i7, float f4, float f10, float f11, float f12) {
        this.mRollType = i7;
        this.mFromDegrees = f4;
        this.mToDegrees = f10;
        this.mPivotXType = 0;
        this.mPivotYType = 0;
        this.mPivotXValue = f11;
        this.mPivotYValue = f12;
        initializePivotPoint();
    }

    public Rotate3dAnimation(int i7, float f4, float f10, int i10, float f11, int i11, float f12) {
        this.mRollType = i7;
        this.mFromDegrees = f4;
        this.mToDegrees = f10;
        this.mPivotXValue = f11;
        this.mPivotXType = i10;
        this.mPivotYValue = f12;
        this.mPivotYType = i11;
        initializePivotPoint();
    }

    public Rotate3dAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPivotXType = 0;
        this.mPivotYType = 0;
        this.mPivotXValue = 0.0f;
        this.mPivotYValue = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2139a.f25047a);
        this.mFromDegrees = obtainStyledAttributes.getFloat(0, 0.0f);
        this.mToDegrees = obtainStyledAttributes.getFloat(4, 0.0f);
        this.mRollType = obtainStyledAttributes.getInt(3, 0);
        Description parseValue = parseValue(obtainStyledAttributes.peekValue(1));
        this.mPivotXType = parseValue.type;
        this.mPivotXValue = parseValue.value;
        Description parseValue2 = parseValue(obtainStyledAttributes.peekValue(2));
        this.mPivotYType = parseValue2.type;
        this.mPivotYValue = parseValue2.value;
        obtainStyledAttributes.recycle();
        initializePivotPoint();
    }

    private void initializePivotPoint() {
        if (this.mPivotXType == 0) {
            this.mPivotX = this.mPivotXValue;
        }
        if (this.mPivotYType == 0) {
            this.mPivotY = this.mPivotYValue;
        }
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f4, Transformation transformation) {
        float f10 = this.mFromDegrees;
        float d10 = o.d(this.mToDegrees, f10, f4, f10);
        Matrix matrix = transformation.getMatrix();
        this.mCamera.save();
        int i7 = this.mRollType;
        if (i7 == 0) {
            this.mCamera.rotateX(d10);
        } else if (i7 == 1) {
            this.mCamera.rotateY(d10);
        } else if (i7 == 2) {
            this.mCamera.rotateZ(d10);
        }
        this.mCamera.getMatrix(matrix);
        this.mCamera.restore();
        matrix.preTranslate(-this.mPivotX, -this.mPivotY);
        matrix.postTranslate(this.mPivotX, this.mPivotY);
    }

    @Override // android.view.animation.Animation
    public void initialize(int i7, int i10, int i11, int i12) {
        super.initialize(i7, i10, i11, i12);
        this.mCamera = new Camera();
        this.mPivotX = resolveSize(this.mPivotXType, this.mPivotXValue, i7, i11);
        this.mPivotY = resolveSize(this.mPivotYType, this.mPivotYValue, i10, i12);
    }

    public Description parseValue(TypedValue typedValue) {
        Description description = new Description();
        if (typedValue == null) {
            description.type = 0;
            description.value = 0.0f;
        } else {
            int i7 = typedValue.type;
            if (i7 == 6) {
                int i10 = typedValue.data;
                description.type = (i10 & 15) == 1 ? 2 : 1;
                description.value = TypedValue.complexToFloat(i10);
                return description;
            }
            if (i7 == 4) {
                description.type = 0;
                description.value = typedValue.getFloat();
                return description;
            }
            if (i7 >= 16 && i7 <= 31) {
                description.type = 0;
                description.value = typedValue.data;
                return description;
            }
        }
        description.type = 0;
        description.value = 0.0f;
        return description;
    }
}
