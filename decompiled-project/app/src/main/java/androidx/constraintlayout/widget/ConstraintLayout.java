package androidx.constraintlayout.widget;

import A4.h;
import P1.g;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import d1.C1038a;
import d1.d;
import d1.e;
import d1.j;
import e1.i;
import e1.k;
import e1.m;
import e1.o;
import ea.C1111f;
import g1.c;
import g1.f;
import g1.n;
import g1.q;
import g1.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: D, reason: collision with root package name */
    public static r f13218D;

    /* renamed from: A, reason: collision with root package name */
    public HashMap f13219A;

    /* renamed from: B, reason: collision with root package name */
    public final SparseArray f13220B;

    /* renamed from: C, reason: collision with root package name */
    public final f f13221C;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f13222a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13223b;

    /* renamed from: c, reason: collision with root package name */
    public final e f13224c;

    /* renamed from: d, reason: collision with root package name */
    public int f13225d;

    /* renamed from: e, reason: collision with root package name */
    public int f13226e;

    /* renamed from: f, reason: collision with root package name */
    public int f13227f;

    /* renamed from: u, reason: collision with root package name */
    public int f13228u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13229v;

    /* renamed from: w, reason: collision with root package name */
    public int f13230w;

    /* renamed from: x, reason: collision with root package name */
    public n f13231x;

    /* renamed from: y, reason: collision with root package name */
    public C1111f f13232y;

    /* renamed from: z, reason: collision with root package name */
    public int f13233z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13222a = new SparseArray();
        this.f13223b = new ArrayList(4);
        this.f13224c = new e();
        this.f13225d = 0;
        this.f13226e = 0;
        this.f13227f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f13228u = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f13229v = true;
        this.f13230w = 257;
        this.f13231x = null;
        this.f13232y = null;
        this.f13233z = -1;
        this.f13219A = new HashMap();
        this.f13220B = new SparseArray();
        this.f13221C = new f(this, this);
        f(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f13222a = new SparseArray();
        this.f13223b = new ArrayList(4);
        this.f13224c = new e();
        this.f13225d = 0;
        this.f13226e = 0;
        this.f13227f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f13228u = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f13229v = true;
        this.f13230w = 257;
        this.f13231x = null;
        this.f13232y = null;
        this.f13233z = -1;
        this.f13219A = new HashMap();
        this.f13220B = new SparseArray();
        this.f13221C = new f(this, this);
        f(attributeSet, i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, g1.e] */
    public static g1.e d() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f17263a = -1;
        marginLayoutParams.f17265b = -1;
        marginLayoutParams.f17267c = -1.0f;
        marginLayoutParams.f17269d = true;
        marginLayoutParams.f17271e = -1;
        marginLayoutParams.f17273f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.f17276h = -1;
        marginLayoutParams.f17278i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.f17282l = -1;
        marginLayoutParams.f17284m = -1;
        marginLayoutParams.f17286n = -1;
        marginLayoutParams.f17288o = -1;
        marginLayoutParams.f17290p = -1;
        marginLayoutParams.f17292q = 0;
        marginLayoutParams.f17293r = 0.0f;
        marginLayoutParams.f17294s = -1;
        marginLayoutParams.f17295t = -1;
        marginLayoutParams.f17296u = -1;
        marginLayoutParams.f17297v = -1;
        marginLayoutParams.f17298w = Integer.MIN_VALUE;
        marginLayoutParams.f17299x = Integer.MIN_VALUE;
        marginLayoutParams.f17300y = Integer.MIN_VALUE;
        marginLayoutParams.f17301z = Integer.MIN_VALUE;
        marginLayoutParams.f17238A = Integer.MIN_VALUE;
        marginLayoutParams.f17239B = Integer.MIN_VALUE;
        marginLayoutParams.f17240C = Integer.MIN_VALUE;
        marginLayoutParams.f17241D = 0;
        marginLayoutParams.f17242E = 0.5f;
        marginLayoutParams.f17243F = 0.5f;
        marginLayoutParams.f17244G = null;
        marginLayoutParams.f17245H = -1.0f;
        marginLayoutParams.f17246I = -1.0f;
        marginLayoutParams.f17247J = 0;
        marginLayoutParams.f17248K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.f17249M = 0;
        marginLayoutParams.f17250N = 0;
        marginLayoutParams.f17251O = 0;
        marginLayoutParams.f17252P = 0;
        marginLayoutParams.f17253Q = 0;
        marginLayoutParams.f17254R = 1.0f;
        marginLayoutParams.f17255S = 1.0f;
        marginLayoutParams.f17256T = -1;
        marginLayoutParams.f17257U = -1;
        marginLayoutParams.f17258V = -1;
        marginLayoutParams.f17259W = false;
        marginLayoutParams.f17260X = false;
        marginLayoutParams.f17261Y = null;
        marginLayoutParams.f17262Z = 0;
        marginLayoutParams.f17264a0 = true;
        marginLayoutParams.f17266b0 = true;
        marginLayoutParams.f17268c0 = false;
        marginLayoutParams.f17270d0 = false;
        marginLayoutParams.f17272e0 = false;
        marginLayoutParams.f17274f0 = -1;
        marginLayoutParams.f17275g0 = -1;
        marginLayoutParams.f17277h0 = -1;
        marginLayoutParams.f17279i0 = -1;
        marginLayoutParams.f17280j0 = Integer.MIN_VALUE;
        marginLayoutParams.f17281k0 = Integer.MIN_VALUE;
        marginLayoutParams.f17283l0 = 0.5f;
        marginLayoutParams.f17291p0 = new d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [g1.r, java.lang.Object] */
    public static r getSharedValues() {
        if (f13218D == null) {
            ?? obj = new Object();
            new SparseIntArray();
            new HashMap();
            f13218D = obj;
        }
        return f13218D;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g1.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f13223b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((c) arrayList.get(i7)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i11 = (int) ((parseInt / 1080.0f) * width);
                        int i12 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f4 = i11;
                        float f10 = i12;
                        float f11 = i11 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f4, f10, f11, f10, paint);
                        float parseInt4 = i12 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f4, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f4, f10, f11, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f11, f10, paint);
                    }
                }
            }
        }
    }

    public final d e(View view) {
        if (view == this) {
            return this.f13224c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof g1.e) {
            return ((g1.e) view.getLayoutParams()).f17291p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof g1.e) {
            return ((g1.e) view.getLayoutParams()).f17291p0;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i7) {
        e eVar = this.f13224c;
        eVar.f16376f0 = this;
        f fVar = this.f13221C;
        eVar.f16419u0 = fVar;
        eVar.f16417s0.f16677f = fVar;
        this.f13222a.put(getId(), this);
        this.f13231x = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f17423b, i7, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.f13225d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f13225d);
                } else if (index == 17) {
                    this.f13226e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f13226e);
                } else if (index == 14) {
                    this.f13227f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f13227f);
                } else if (index == 15) {
                    this.f13228u = obtainStyledAttributes.getDimensionPixelOffset(index, this.f13228u);
                } else if (index == 113) {
                    this.f13230w = obtainStyledAttributes.getInt(index, this.f13230w);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f13232y = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f13231x = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f13231x = null;
                    }
                    this.f13233z = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.f16406D0 = this.f13230w;
        b1.c.f13783q = eVar.W(512);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f13229v = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, g1.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f17263a = -1;
        marginLayoutParams.f17265b = -1;
        marginLayoutParams.f17267c = -1.0f;
        marginLayoutParams.f17269d = true;
        marginLayoutParams.f17271e = -1;
        marginLayoutParams.f17273f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.f17276h = -1;
        marginLayoutParams.f17278i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.f17282l = -1;
        marginLayoutParams.f17284m = -1;
        marginLayoutParams.f17286n = -1;
        marginLayoutParams.f17288o = -1;
        marginLayoutParams.f17290p = -1;
        marginLayoutParams.f17292q = 0;
        marginLayoutParams.f17293r = 0.0f;
        marginLayoutParams.f17294s = -1;
        marginLayoutParams.f17295t = -1;
        marginLayoutParams.f17296u = -1;
        marginLayoutParams.f17297v = -1;
        marginLayoutParams.f17298w = Integer.MIN_VALUE;
        marginLayoutParams.f17299x = Integer.MIN_VALUE;
        marginLayoutParams.f17300y = Integer.MIN_VALUE;
        marginLayoutParams.f17301z = Integer.MIN_VALUE;
        marginLayoutParams.f17238A = Integer.MIN_VALUE;
        marginLayoutParams.f17239B = Integer.MIN_VALUE;
        marginLayoutParams.f17240C = Integer.MIN_VALUE;
        marginLayoutParams.f17241D = 0;
        marginLayoutParams.f17242E = 0.5f;
        marginLayoutParams.f17243F = 0.5f;
        marginLayoutParams.f17244G = null;
        marginLayoutParams.f17245H = -1.0f;
        marginLayoutParams.f17246I = -1.0f;
        marginLayoutParams.f17247J = 0;
        marginLayoutParams.f17248K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.f17249M = 0;
        marginLayoutParams.f17250N = 0;
        marginLayoutParams.f17251O = 0;
        marginLayoutParams.f17252P = 0;
        marginLayoutParams.f17253Q = 0;
        marginLayoutParams.f17254R = 1.0f;
        marginLayoutParams.f17255S = 1.0f;
        marginLayoutParams.f17256T = -1;
        marginLayoutParams.f17257U = -1;
        marginLayoutParams.f17258V = -1;
        marginLayoutParams.f17259W = false;
        marginLayoutParams.f17260X = false;
        marginLayoutParams.f17261Y = null;
        marginLayoutParams.f17262Z = 0;
        marginLayoutParams.f17264a0 = true;
        marginLayoutParams.f17266b0 = true;
        marginLayoutParams.f17268c0 = false;
        marginLayoutParams.f17270d0 = false;
        marginLayoutParams.f17272e0 = false;
        marginLayoutParams.f17274f0 = -1;
        marginLayoutParams.f17275g0 = -1;
        marginLayoutParams.f17277h0 = -1;
        marginLayoutParams.f17279i0 = -1;
        marginLayoutParams.f17280j0 = Integer.MIN_VALUE;
        marginLayoutParams.f17281k0 = Integer.MIN_VALUE;
        marginLayoutParams.f17283l0 = 0.5f;
        marginLayoutParams.f17291p0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f17423b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            int i10 = g1.d.f17237a.get(index);
            switch (i10) {
                case 1:
                    marginLayoutParams.f17258V = obtainStyledAttributes.getInt(index, marginLayoutParams.f17258V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17290p);
                    marginLayoutParams.f17290p = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f17290p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.f17292q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17292q);
                    break;
                case 4:
                    float f4 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f17293r) % 360.0f;
                    marginLayoutParams.f17293r = f4;
                    if (f4 < 0.0f) {
                        marginLayoutParams.f17293r = (360.0f - f4) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.f17263a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f17263a);
                    break;
                case 6:
                    marginLayoutParams.f17265b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f17265b);
                    break;
                case 7:
                    marginLayoutParams.f17267c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f17267c);
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17271e);
                    marginLayoutParams.f17271e = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f17271e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17273f);
                    marginLayoutParams.f17273f = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f17273f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.g);
                    marginLayoutParams.g = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17276h);
                    marginLayoutParams.f17276h = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.f17276h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17278i);
                    marginLayoutParams.f17278i = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.f17278i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.j);
                    marginLayoutParams.j = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.k);
                    marginLayoutParams.k = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17282l);
                    marginLayoutParams.f17282l = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.f17282l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17284m);
                    marginLayoutParams.f17284m = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.f17284m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17294s);
                    marginLayoutParams.f17294s = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f17294s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17295t);
                    marginLayoutParams.f17295t = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f17295t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17296u);
                    marginLayoutParams.f17296u = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f17296u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17297v);
                    marginLayoutParams.f17297v = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f17297v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f17298w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17298w);
                    break;
                case 22:
                    marginLayoutParams.f17299x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17299x);
                    break;
                case 23:
                    marginLayoutParams.f17300y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17300y);
                    break;
                case 24:
                    marginLayoutParams.f17301z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17301z);
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    marginLayoutParams.f17238A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17238A);
                    break;
                case 26:
                    marginLayoutParams.f17239B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17239B);
                    break;
                case 27:
                    marginLayoutParams.f17259W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f17259W);
                    break;
                case 28:
                    marginLayoutParams.f17260X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f17260X);
                    break;
                case 29:
                    marginLayoutParams.f17242E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f17242E);
                    break;
                case 30:
                    marginLayoutParams.f17243F = obtainStyledAttributes.getFloat(index, marginLayoutParams.f17243F);
                    break;
                case 31:
                    int i11 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.L = i11;
                    if (i11 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i12 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f17249M = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.f17250N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17250N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f17250N) == -2) {
                            marginLayoutParams.f17250N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f17252P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17252P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f17252P) == -2) {
                            marginLayoutParams.f17252P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f17254R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f17254R));
                    marginLayoutParams.L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.f17251O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17251O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f17251O) == -2) {
                            marginLayoutParams.f17251O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f17253Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17253Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f17253Q) == -2) {
                            marginLayoutParams.f17253Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.f17255S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f17255S));
                    marginLayoutParams.f17249M = 2;
                    break;
                default:
                    switch (i10) {
                        case 44:
                            n.h(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.f17245H = obtainStyledAttributes.getFloat(index, marginLayoutParams.f17245H);
                            break;
                        case 46:
                            marginLayoutParams.f17246I = obtainStyledAttributes.getFloat(index, marginLayoutParams.f17246I);
                            break;
                        case 47:
                            marginLayoutParams.f17247J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.f17248K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.f17256T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f17256T);
                            break;
                        case 50:
                            marginLayoutParams.f17257U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f17257U);
                            break;
                        case 51:
                            marginLayoutParams.f17261Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17286n);
                            marginLayoutParams.f17286n = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.f17286n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f17288o);
                            marginLayoutParams.f17288o = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.f17288o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            marginLayoutParams.f17241D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17241D);
                            break;
                        case 55:
                            marginLayoutParams.f17240C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f17240C);
                            break;
                        default:
                            switch (i10) {
                                case 64:
                                    n.g(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.f17262Z = obtainStyledAttributes.getInt(index, marginLayoutParams.f17262Z);
                                    break;
                                case 67:
                                    marginLayoutParams.f17269d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f17269d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, g1.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f17263a = -1;
        marginLayoutParams.f17265b = -1;
        marginLayoutParams.f17267c = -1.0f;
        marginLayoutParams.f17269d = true;
        marginLayoutParams.f17271e = -1;
        marginLayoutParams.f17273f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.f17276h = -1;
        marginLayoutParams.f17278i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.f17282l = -1;
        marginLayoutParams.f17284m = -1;
        marginLayoutParams.f17286n = -1;
        marginLayoutParams.f17288o = -1;
        marginLayoutParams.f17290p = -1;
        marginLayoutParams.f17292q = 0;
        marginLayoutParams.f17293r = 0.0f;
        marginLayoutParams.f17294s = -1;
        marginLayoutParams.f17295t = -1;
        marginLayoutParams.f17296u = -1;
        marginLayoutParams.f17297v = -1;
        marginLayoutParams.f17298w = Integer.MIN_VALUE;
        marginLayoutParams.f17299x = Integer.MIN_VALUE;
        marginLayoutParams.f17300y = Integer.MIN_VALUE;
        marginLayoutParams.f17301z = Integer.MIN_VALUE;
        marginLayoutParams.f17238A = Integer.MIN_VALUE;
        marginLayoutParams.f17239B = Integer.MIN_VALUE;
        marginLayoutParams.f17240C = Integer.MIN_VALUE;
        marginLayoutParams.f17241D = 0;
        marginLayoutParams.f17242E = 0.5f;
        marginLayoutParams.f17243F = 0.5f;
        marginLayoutParams.f17244G = null;
        marginLayoutParams.f17245H = -1.0f;
        marginLayoutParams.f17246I = -1.0f;
        marginLayoutParams.f17247J = 0;
        marginLayoutParams.f17248K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.f17249M = 0;
        marginLayoutParams.f17250N = 0;
        marginLayoutParams.f17251O = 0;
        marginLayoutParams.f17252P = 0;
        marginLayoutParams.f17253Q = 0;
        marginLayoutParams.f17254R = 1.0f;
        marginLayoutParams.f17255S = 1.0f;
        marginLayoutParams.f17256T = -1;
        marginLayoutParams.f17257U = -1;
        marginLayoutParams.f17258V = -1;
        marginLayoutParams.f17259W = false;
        marginLayoutParams.f17260X = false;
        marginLayoutParams.f17261Y = null;
        marginLayoutParams.f17262Z = 0;
        marginLayoutParams.f17264a0 = true;
        marginLayoutParams.f17266b0 = true;
        marginLayoutParams.f17268c0 = false;
        marginLayoutParams.f17270d0 = false;
        marginLayoutParams.f17272e0 = false;
        marginLayoutParams.f17274f0 = -1;
        marginLayoutParams.f17275g0 = -1;
        marginLayoutParams.f17277h0 = -1;
        marginLayoutParams.f17279i0 = -1;
        marginLayoutParams.f17280j0 = Integer.MIN_VALUE;
        marginLayoutParams.f17281k0 = Integer.MIN_VALUE;
        marginLayoutParams.f17283l0 = 0.5f;
        marginLayoutParams.f17291p0 = new d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).leftMargin = marginLayoutParams2.leftMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).rightMargin = marginLayoutParams2.rightMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).topMargin = marginLayoutParams2.topMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
        if (layoutParams instanceof g1.e) {
            g1.e eVar = (g1.e) layoutParams;
            marginLayoutParams.f17263a = eVar.f17263a;
            marginLayoutParams.f17265b = eVar.f17265b;
            marginLayoutParams.f17267c = eVar.f17267c;
            marginLayoutParams.f17269d = eVar.f17269d;
            marginLayoutParams.f17271e = eVar.f17271e;
            marginLayoutParams.f17273f = eVar.f17273f;
            marginLayoutParams.g = eVar.g;
            marginLayoutParams.f17276h = eVar.f17276h;
            marginLayoutParams.f17278i = eVar.f17278i;
            marginLayoutParams.j = eVar.j;
            marginLayoutParams.k = eVar.k;
            marginLayoutParams.f17282l = eVar.f17282l;
            marginLayoutParams.f17284m = eVar.f17284m;
            marginLayoutParams.f17286n = eVar.f17286n;
            marginLayoutParams.f17288o = eVar.f17288o;
            marginLayoutParams.f17290p = eVar.f17290p;
            marginLayoutParams.f17292q = eVar.f17292q;
            marginLayoutParams.f17293r = eVar.f17293r;
            marginLayoutParams.f17294s = eVar.f17294s;
            marginLayoutParams.f17295t = eVar.f17295t;
            marginLayoutParams.f17296u = eVar.f17296u;
            marginLayoutParams.f17297v = eVar.f17297v;
            marginLayoutParams.f17298w = eVar.f17298w;
            marginLayoutParams.f17299x = eVar.f17299x;
            marginLayoutParams.f17300y = eVar.f17300y;
            marginLayoutParams.f17301z = eVar.f17301z;
            marginLayoutParams.f17238A = eVar.f17238A;
            marginLayoutParams.f17239B = eVar.f17239B;
            marginLayoutParams.f17240C = eVar.f17240C;
            marginLayoutParams.f17241D = eVar.f17241D;
            marginLayoutParams.f17242E = eVar.f17242E;
            marginLayoutParams.f17243F = eVar.f17243F;
            marginLayoutParams.f17244G = eVar.f17244G;
            marginLayoutParams.f17245H = eVar.f17245H;
            marginLayoutParams.f17246I = eVar.f17246I;
            marginLayoutParams.f17247J = eVar.f17247J;
            marginLayoutParams.f17248K = eVar.f17248K;
            marginLayoutParams.f17259W = eVar.f17259W;
            marginLayoutParams.f17260X = eVar.f17260X;
            marginLayoutParams.L = eVar.L;
            marginLayoutParams.f17249M = eVar.f17249M;
            marginLayoutParams.f17250N = eVar.f17250N;
            marginLayoutParams.f17252P = eVar.f17252P;
            marginLayoutParams.f17251O = eVar.f17251O;
            marginLayoutParams.f17253Q = eVar.f17253Q;
            marginLayoutParams.f17254R = eVar.f17254R;
            marginLayoutParams.f17255S = eVar.f17255S;
            marginLayoutParams.f17256T = eVar.f17256T;
            marginLayoutParams.f17257U = eVar.f17257U;
            marginLayoutParams.f17258V = eVar.f17258V;
            marginLayoutParams.f17264a0 = eVar.f17264a0;
            marginLayoutParams.f17266b0 = eVar.f17266b0;
            marginLayoutParams.f17268c0 = eVar.f17268c0;
            marginLayoutParams.f17270d0 = eVar.f17270d0;
            marginLayoutParams.f17274f0 = eVar.f17274f0;
            marginLayoutParams.f17275g0 = eVar.f17275g0;
            marginLayoutParams.f17277h0 = eVar.f17277h0;
            marginLayoutParams.f17279i0 = eVar.f17279i0;
            marginLayoutParams.f17280j0 = eVar.f17280j0;
            marginLayoutParams.f17281k0 = eVar.f17281k0;
            marginLayoutParams.f17283l0 = eVar.f17283l0;
            marginLayoutParams.f17261Y = eVar.f17261Y;
            marginLayoutParams.f17262Z = eVar.f17262Z;
            marginLayoutParams.f17291p0 = eVar.f17291p0;
        }
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.f13228u;
    }

    public int getMaxWidth() {
        return this.f13227f;
    }

    public int getMinHeight() {
        return this.f13226e;
    }

    public int getMinWidth() {
        return this.f13225d;
    }

    public int getOptimizationLevel() {
        return this.f13224c.f16406D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f13224c;
        if (eVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.j = "parent";
            }
        }
        if (eVar.f16379h0 == null) {
            eVar.f16379h0 = eVar.j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f16379h0);
        }
        Iterator it = eVar.f16415q0.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            View view = dVar.f16376f0;
            if (view != null) {
                if (dVar.j == null && (id = view.getId()) != -1) {
                    dVar.j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f16379h0 == null) {
                    dVar.f16379h0 = dVar.j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f16379h0);
                }
            }
        }
        eVar.n(sb2);
        return sb2.toString();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003b. Please report as an issue. */
    public final void j(int i7) {
        int eventType;
        h hVar;
        Context context = getContext();
        C1111f c1111f = new C1111f(2);
        c1111f.f16837b = new SparseArray();
        c1111f.f16838c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            eventType = xml.getEventType();
            hVar = null;
        } catch (IOException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i7, e2);
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i7, e10);
        }
        while (true) {
            char c10 = 1;
            if (eventType == 1) {
                this.f13232y = c1111f;
                return;
            }
            if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 80204913:
                        if (name.equals("State")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 == 2) {
                    h hVar2 = new h(context, xml);
                    ((SparseArray) c1111f.f16837b).put(hVar2.f385b, hVar2);
                    hVar = hVar2;
                } else if (c10 == 3) {
                    g1.g gVar = new g1.g(context, xml);
                    if (hVar != null) {
                        ((ArrayList) hVar.f387d).add(gVar);
                    }
                } else if (c10 == 4) {
                    c1111f.w(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(e eVar, int i7, int i10, int i11) {
        int i12;
        int max;
        int i13;
        int max2;
        int i14;
        int i15;
        boolean z8;
        f fVar;
        int i16;
        int i17;
        int i18;
        boolean z10;
        ArrayList arrayList;
        int i19;
        f fVar2;
        int i20;
        f fVar3;
        boolean z11;
        k kVar;
        m mVar;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z12;
        Iterator it;
        Iterator it2;
        boolean z13;
        e eVar2 = eVar;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i27 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        f fVar4 = this.f13221C;
        fVar4.f17303b = max3;
        fVar4.f17304c = max4;
        fVar4.f17305d = paddingWidth;
        fVar4.f17306e = i27;
        fVar4.f17307f = i10;
        fVar4.g = i11;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i28 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i29 = size - paddingWidth;
        int i30 = size2 - i27;
        int i31 = fVar4.f17306e;
        int i32 = fVar4.f17305d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i12 = 0;
                } else {
                    i12 = Math.min(this.f13227f - i32, i29);
                    i28 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f13225d);
                i12 = max;
                i28 = 2;
            } else {
                i12 = 0;
                i28 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f13225d);
            i12 = max;
            i28 = 2;
        } else {
            i12 = i29;
            i28 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i13 = mode2 != 1073741824 ? 0 : Math.min(this.f13228u - i31, i30);
                i14 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f13226e);
                i13 = max2;
                i14 = 2;
            } else {
                i13 = 0;
                i14 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f13226e);
            i13 = max2;
            i14 = 2;
        } else {
            i13 = i30;
            i14 = 2;
        }
        int q10 = eVar.q();
        e1.e eVar3 = eVar2.f16417s0;
        int i33 = i12;
        if (i33 != q10 || i13 != eVar.k()) {
            eVar3.f16674c = true;
        }
        eVar2.f16363Y = 0;
        eVar2.f16364Z = 0;
        int i34 = this.f13227f - i32;
        int[] iArr = eVar2.f16342C;
        iArr[0] = i34;
        iArr[1] = this.f13228u - i31;
        eVar2.f16368b0 = 0;
        eVar2.f16370c0 = 0;
        eVar2.M(i28);
        eVar2.O(i33);
        eVar2.N(i14);
        eVar2.L(i13);
        int i35 = this.f13225d - i32;
        if (i35 < 0) {
            eVar2.f16368b0 = 0;
        } else {
            eVar2.f16368b0 = i35;
        }
        int i36 = this.f13226e - i31;
        if (i36 < 0) {
            eVar2.f16370c0 = 0;
        } else {
            eVar2.f16370c0 = i36;
        }
        eVar2.f16422x0 = max5;
        eVar2.f16423y0 = max3;
        Q7.h hVar = eVar2.f16416r0;
        hVar.getClass();
        f fVar5 = eVar2.f16419u0;
        int size3 = eVar2.f16415q0.size();
        int q11 = eVar.q();
        int k = eVar.k();
        boolean c10 = j.c(i7, 128);
        boolean z14 = c10 || j.c(i7, 64);
        if (z14) {
            for (int i37 = 0; i37 < size3; i37++) {
                d dVar = (d) eVar2.f16415q0.get(i37);
                int[] iArr2 = dVar.f16393p0;
                boolean z15 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar.f16361W > 0.0f;
                if ((dVar.x() && z15) || ((dVar.y() && z15) || (dVar instanceof d1.g) || dVar.x() || dVar.y())) {
                    i15 = 1073741824;
                    z14 = false;
                    break;
                }
            }
        }
        i15 = 1073741824;
        boolean z16 = ((mode == i15 && mode2 == i15) || c10) & z14;
        if (z16) {
            int min = Math.min(iArr[0], i29);
            int min2 = Math.min(iArr[1], i30);
            if (mode == 1073741824 && eVar.q() != min) {
                eVar2.O(min);
                eVar2.f16417s0.f16673b = true;
            }
            if (mode2 == 1073741824 && eVar.k() != min2) {
                eVar2.L(min2);
                eVar2.f16417s0.f16673b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z17 = eVar3.f16673b;
                e eVar4 = eVar3.f16672a;
                if (z17 || eVar3.f16674c) {
                    Iterator it3 = eVar4.f16415q0.iterator();
                    while (it3.hasNext()) {
                        d dVar2 = (d) it3.next();
                        dVar2.h();
                        dVar2.f16365a = false;
                        dVar2.f16371d.n();
                        dVar2.f16373e.m();
                    }
                    i23 = 0;
                    eVar4.h();
                    eVar4.f16365a = false;
                    eVar4.f16371d.n();
                    eVar4.f16373e.m();
                    eVar3.f16674c = false;
                } else {
                    i23 = 0;
                }
                eVar3.b(eVar3.f16675d);
                eVar4.f16363Y = i23;
                eVar4.f16364Z = i23;
                int j = eVar4.j(i23);
                int j10 = eVar4.j(1);
                if (eVar3.f16673b) {
                    eVar3.c();
                }
                int r10 = eVar4.r();
                int s3 = eVar4.s();
                z8 = z16;
                eVar4.f16371d.f16705h.d(r10);
                eVar4.f16373e.f16705h.d(s3);
                eVar3.g();
                ArrayList arrayList2 = eVar3.f16676e;
                fVar = fVar5;
                if (j == 2 || j10 == 2) {
                    if (c10) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((o) it4.next()).k()) {
                                    c10 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c10 && j == 2) {
                        eVar4.M(1);
                        i16 = q11;
                        eVar4.O(eVar3.d(eVar4, 0));
                        eVar4.f16371d.f16703e.d(eVar4.q());
                    } else {
                        i16 = q11;
                    }
                    if (c10 && j10 == 2) {
                        i24 = 1;
                        eVar4.N(1);
                        eVar4.L(eVar3.d(eVar4, 1));
                        eVar4.f16373e.f16703e.d(eVar4.k());
                        int[] iArr3 = eVar4.f16393p0;
                        i17 = k;
                        i25 = iArr3[0];
                        if (i25 != i24 || i25 == 4) {
                            int q12 = eVar4.q() + r10;
                            eVar4.f16371d.f16706i.d(q12);
                            eVar4.f16371d.f16703e.d(q12 - r10);
                            eVar3.g();
                            i26 = iArr3[1];
                            if (i26 != 1 || i26 == 4) {
                                int k7 = eVar4.k() + s3;
                                eVar4.f16373e.f16706i.d(k7);
                                eVar4.f16373e.f16703e.d(k7 - s3);
                            }
                            eVar3.g();
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            o oVar = (o) it.next();
                            if (oVar.f16700b != eVar4 || oVar.g) {
                                oVar.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            o oVar2 = (o) it2.next();
                            if (z12 || oVar2.f16700b != eVar4) {
                                if (!oVar2.f16705h.j || ((!oVar2.f16706i.j && !(oVar2 instanceof i)) || (!oVar2.f16703e.j && !(oVar2 instanceof e1.c) && !(oVar2 instanceof i)))) {
                                    z13 = false;
                                    break;
                                }
                            }
                        }
                        z13 = true;
                        eVar4.M(j);
                        eVar4.N(j10);
                        z10 = z13;
                        i22 = 1073741824;
                        i18 = 2;
                    }
                } else {
                    i16 = q11;
                }
                i24 = 1;
                int[] iArr32 = eVar4.f16393p0;
                i17 = k;
                i25 = iArr32[0];
                if (i25 != i24) {
                }
                int q122 = eVar4.q() + r10;
                eVar4.f16371d.f16706i.d(q122);
                eVar4.f16371d.f16703e.d(q122 - r10);
                eVar3.g();
                i26 = iArr32[1];
                if (i26 != 1) {
                }
                int k72 = eVar4.k() + s3;
                eVar4.f16373e.f16706i.d(k72);
                eVar4.f16373e.f16703e.d(k72 - s3);
                eVar3.g();
                z12 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z13 = true;
                eVar4.M(j);
                eVar4.N(j10);
                z10 = z13;
                i22 = 1073741824;
                i18 = 2;
            } else {
                z8 = z16;
                fVar = fVar5;
                i16 = q11;
                i17 = k;
                boolean z18 = eVar3.f16673b;
                e eVar5 = eVar3.f16672a;
                if (z18) {
                    Iterator it5 = eVar5.f16415q0.iterator();
                    while (it5.hasNext()) {
                        d dVar3 = (d) it5.next();
                        dVar3.h();
                        dVar3.f16365a = false;
                        k kVar2 = dVar3.f16371d;
                        kVar2.f16703e.j = false;
                        kVar2.g = false;
                        kVar2.n();
                        m mVar2 = dVar3.f16373e;
                        mVar2.f16703e.j = false;
                        mVar2.g = false;
                        mVar2.m();
                    }
                    i21 = 0;
                    eVar5.h();
                    eVar5.f16365a = false;
                    k kVar3 = eVar5.f16371d;
                    kVar3.f16703e.j = false;
                    kVar3.g = false;
                    kVar3.n();
                    m mVar3 = eVar5.f16373e;
                    mVar3.f16703e.j = false;
                    mVar3.g = false;
                    mVar3.m();
                    eVar3.c();
                } else {
                    i21 = 0;
                }
                eVar3.b(eVar3.f16675d);
                eVar5.f16363Y = i21;
                eVar5.f16364Z = i21;
                eVar5.f16371d.f16705h.d(i21);
                eVar5.f16373e.f16705h.d(i21);
                i22 = 1073741824;
                if (mode == 1073741824) {
                    z10 = eVar2.T(i21, c10);
                    i18 = 1;
                } else {
                    i18 = 0;
                    z10 = true;
                }
                if (mode2 == 1073741824) {
                    z10 &= eVar2.T(1, c10);
                    i18++;
                }
            }
            if (z10) {
                eVar2.P(mode == i22, mode2 == i22);
            }
        } else {
            z8 = z16;
            fVar = fVar5;
            i16 = q11;
            i17 = k;
            i18 = 0;
            z10 = false;
        }
        if (z10 && i18 == 2) {
            return;
        }
        int i38 = eVar2.f16406D0;
        if (size3 > 0) {
            int size4 = eVar2.f16415q0.size();
            boolean W10 = eVar2.W(64);
            f fVar6 = eVar2.f16419u0;
            for (int i39 = 0; i39 < size4; i39++) {
                d dVar4 = (d) eVar2.f16415q0.get(i39);
                if (!(dVar4 instanceof d1.h) && !(dVar4 instanceof C1038a) && !dVar4.f16345F && (!W10 || (kVar = dVar4.f16371d) == null || (mVar = dVar4.f16373e) == null || !kVar.f16703e.j || !mVar.f16703e.j)) {
                    int j11 = dVar4.j(0);
                    int j12 = dVar4.j(1);
                    boolean z19 = j11 == 3 && dVar4.f16395r != 1 && j12 == 3 && dVar4.f16396s != 1;
                    if (!z19 && eVar2.W(1) && !(dVar4 instanceof d1.g)) {
                        if (j11 == 3 && dVar4.f16395r == 0 && j12 != 3 && !dVar4.x()) {
                            z19 = true;
                        }
                        if (j12 == 3 && dVar4.f16396s == 0 && j11 != 3 && !dVar4.x()) {
                            z19 = true;
                        }
                        if (j11 == 3 || j12 == 3) {
                            if (dVar4.f16361W > 0.0f) {
                                z19 = true;
                            }
                            if (z19) {
                                hVar.I(0, dVar4, fVar6);
                            }
                        }
                    }
                    if (z19) {
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar6.f17302a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i40 = 0; i40 < childCount2; i40++) {
                constraintLayout.getChildAt(i40);
            }
            ArrayList arrayList3 = constraintLayout.f13223b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i41 = 0; i41 < size5; i41++) {
                    ((c) arrayList3.get(i41)).getClass();
                }
            }
        }
        hVar.Y(eVar2);
        ArrayList arrayList4 = (ArrayList) hVar.f8695b;
        int size6 = arrayList4.size();
        int i42 = i16;
        int i43 = i17;
        if (size3 > 0) {
            hVar.V(eVar2, 0, i42, i43);
        }
        if (size6 > 0) {
            int[] iArr4 = eVar2.f16393p0;
            boolean z20 = iArr4[0] == 2;
            boolean z21 = iArr4[1] == 2;
            int q13 = eVar.q();
            e eVar6 = (e) hVar.f8697d;
            int max7 = Math.max(q13, eVar6.f16368b0);
            int max8 = Math.max(eVar.k(), eVar6.f16370c0);
            int i44 = 0;
            boolean z22 = false;
            while (i44 < size6) {
                d dVar5 = (d) arrayList4.get(i44);
                if (dVar5 instanceof d1.g) {
                    int q14 = dVar5.q();
                    int k10 = dVar5.k();
                    i20 = i38;
                    fVar3 = fVar;
                    boolean I6 = z22 | hVar.I(1, dVar5, fVar3);
                    int q15 = dVar5.q();
                    int k11 = dVar5.k();
                    if (q15 != q14) {
                        dVar5.O(q15);
                        if (z20 && dVar5.r() + dVar5.f16359U > max7) {
                            max7 = Math.max(max7, dVar5.i(4).e() + dVar5.r() + dVar5.f16359U);
                        }
                        z11 = true;
                    } else {
                        z11 = I6;
                    }
                    if (k11 != k10) {
                        dVar5.L(k11);
                        if (z21 && dVar5.s() + dVar5.f16360V > max8) {
                            max8 = Math.max(max8, dVar5.i(5).e() + dVar5.s() + dVar5.f16360V);
                        }
                        z11 = true;
                    }
                    z22 = ((d1.g) dVar5).f16473y0 | z11;
                } else {
                    i20 = i38;
                    fVar3 = fVar;
                }
                i44++;
                fVar = fVar3;
                i38 = i20;
            }
            int i45 = i38;
            f fVar7 = fVar;
            int i46 = 0;
            while (i46 < 2) {
                int i47 = 0;
                while (i47 < size6) {
                    d dVar6 = (d) arrayList4.get(i47);
                    if (((dVar6 instanceof d1.i) && !(dVar6 instanceof d1.g)) || (dVar6 instanceof d1.h) || dVar6.f16377g0 == 8 || ((z8 && dVar6.f16371d.f16703e.j && dVar6.f16373e.f16703e.j) || (dVar6 instanceof d1.g))) {
                        fVar2 = fVar7;
                        arrayList = arrayList4;
                        i19 = size6;
                    } else {
                        int q16 = dVar6.q();
                        int k12 = dVar6.k();
                        arrayList = arrayList4;
                        int i48 = dVar6.f16366a0;
                        i19 = size6;
                        boolean I10 = hVar.I(i46 == 1 ? 2 : 1, dVar6, fVar7) | z22;
                        int q17 = dVar6.q();
                        fVar2 = fVar7;
                        int k13 = dVar6.k();
                        if (q17 != q16) {
                            dVar6.O(q17);
                            if (z20 && dVar6.r() + dVar6.f16359U > max7) {
                                max7 = Math.max(max7, dVar6.i(4).e() + dVar6.r() + dVar6.f16359U);
                            }
                            I10 = true;
                        }
                        if (k13 != k12) {
                            dVar6.L(k13);
                            if (z21 && dVar6.s() + dVar6.f16360V > max8) {
                                max8 = Math.max(max8, dVar6.i(5).e() + dVar6.s() + dVar6.f16360V);
                            }
                            I10 = true;
                        }
                        z22 = (!dVar6.f16344E || i48 == dVar6.f16366a0) ? I10 : true;
                    }
                    i47++;
                    arrayList4 = arrayList;
                    size6 = i19;
                    fVar7 = fVar2;
                }
                f fVar8 = fVar7;
                ArrayList arrayList5 = arrayList4;
                int i49 = size6;
                if (!z22) {
                    break;
                }
                i46++;
                hVar.V(eVar, i46, i42, i43);
                fVar7 = fVar8;
                arrayList4 = arrayList5;
                size6 = i49;
                z22 = false;
            }
            eVar2 = eVar;
            i38 = i45;
        }
        eVar2.f16406D0 = i38;
        b1.c.f13783q = eVar2.W(512);
    }

    public final void l(d dVar, g1.e eVar, SparseArray sparseArray, int i7, int i10) {
        View view = (View) this.f13222a.get(i7);
        d dVar2 = (d) sparseArray.get(i7);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof g1.e)) {
            return;
        }
        eVar.f17268c0 = true;
        if (i10 == 6) {
            g1.e eVar2 = (g1.e) view.getLayoutParams();
            eVar2.f17268c0 = true;
            eVar2.f17291p0.f16344E = true;
        }
        dVar.i(6).b(dVar2.i(i10), eVar.f17241D, eVar.f17240C, true);
        dVar.f16344E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            g1.e eVar = (g1.e) childAt.getLayoutParams();
            d dVar = eVar.f17291p0;
            if (childAt.getVisibility() != 8 || eVar.f17270d0 || eVar.f17272e0 || isInEditMode) {
                int r10 = dVar.r();
                int s3 = dVar.s();
                childAt.layout(r10, s3, dVar.q() + r10, dVar.k() + s3);
            }
        }
        ArrayList arrayList = this.f13223b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((c) arrayList.get(i14)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:273:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0308  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i7, int i10) {
        boolean z8;
        int i11;
        int i12;
        d dVar;
        int i13;
        d dVar2;
        int i14;
        d dVar3;
        int i15;
        g1.e eVar;
        float f4;
        int i16;
        int i17;
        int i18;
        float parseFloat;
        int i19;
        ArrayList arrayList;
        ArrayList arrayList2;
        String resourceName;
        int id;
        d dVar4;
        ConstraintLayout constraintLayout = this;
        boolean z10 = constraintLayout.f13229v;
        constraintLayout.f13229v = z10;
        int i20 = 0;
        if (!z10) {
            int childCount = getChildCount();
            int i21 = 0;
            while (true) {
                if (i21 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i21).isLayoutRequested()) {
                    constraintLayout.f13229v = true;
                    break;
                }
                i21++;
            }
        }
        boolean z11 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        e eVar2 = constraintLayout.f13224c;
        eVar2.f16420v0 = z11;
        if (constraintLayout.f13229v) {
            constraintLayout.f13229v = false;
            int childCount2 = getChildCount();
            int i22 = 0;
            while (true) {
                if (i22 >= childCount2) {
                    z8 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i22).isLayoutRequested()) {
                        z8 = true;
                        break;
                    }
                    i22++;
                }
            }
            if (z8) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i23 = 0; i23 < childCount3; i23++) {
                    d e2 = constraintLayout.e(constraintLayout.getChildAt(i23));
                    if (e2 != null) {
                        e2.C();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    for (int i24 = 0; i24 < childCount3; i24++) {
                        View childAt = constraintLayout.getChildAt(i24);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.f13219A == null) {
                                    constraintLayout.f13219A = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f13219A.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f13222a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                dVar4 = view == null ? null : ((g1.e) view.getLayoutParams()).f17291p0;
                                dVar4.f16379h0 = resourceName;
                            }
                        }
                        dVar4 = eVar2;
                        dVar4.f16379h0 = resourceName;
                    }
                }
                if (constraintLayout.f13233z != -1) {
                    for (int i25 = 0; i25 < childCount3; i25++) {
                        constraintLayout.getChildAt(i25).getId();
                    }
                }
                n nVar = constraintLayout.f13231x;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                eVar2.f16415q0.clear();
                ArrayList arrayList3 = constraintLayout.f13223b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i26 = 0;
                    while (i26 < size) {
                        c cVar = (c) arrayList3.get(i26);
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f17234e);
                        }
                        d1.i iVar = cVar.f17233d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f16482r0 = i20;
                            Arrays.fill(iVar.f16481q0, obj);
                            int i27 = i20;
                            while (i27 < cVar.f17231b) {
                                int i28 = cVar.f17230a[i27];
                                View view2 = (View) constraintLayout.f13222a.get(i28);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i28);
                                    HashMap hashMap = cVar.f17236u;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f10 = cVar.f(constraintLayout, str);
                                    if (f10 != 0) {
                                        cVar.f17230a[i27] = f10;
                                        hashMap.put(Integer.valueOf(f10), str);
                                        view2 = (View) constraintLayout.f13222a.get(f10);
                                    }
                                }
                                if (view2 != null) {
                                    d1.i iVar2 = cVar.f17233d;
                                    d e10 = constraintLayout.e(view2);
                                    iVar2.getClass();
                                    if (e10 != iVar2 && e10 != null) {
                                        int i29 = iVar2.f16482r0 + 1;
                                        d[] dVarArr = iVar2.f16481q0;
                                        arrayList2 = arrayList3;
                                        if (i29 > dVarArr.length) {
                                            iVar2.f16481q0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.f16481q0;
                                        int i30 = iVar2.f16482r0;
                                        dVarArr2[i30] = e10;
                                        iVar2.f16482r0 = i30 + 1;
                                        i27++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i27++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            cVar.f17233d.S();
                        }
                        i26++;
                        arrayList3 = arrayList;
                        obj = null;
                        i20 = 0;
                    }
                }
                for (int i31 = 0; i31 < childCount3; i31++) {
                    constraintLayout.getChildAt(i31);
                }
                SparseArray sparseArray = constraintLayout.f13220B;
                sparseArray.clear();
                sparseArray.put(0, eVar2);
                sparseArray.put(getId(), eVar2);
                for (int i32 = 0; i32 < childCount3; i32++) {
                    View childAt2 = constraintLayout.getChildAt(i32);
                    sparseArray.put(childAt2.getId(), constraintLayout.e(childAt2));
                }
                int i33 = 0;
                while (i33 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i33);
                    d e11 = constraintLayout.e(childAt3);
                    if (e11 != null) {
                        g1.e eVar3 = (g1.e) childAt3.getLayoutParams();
                        eVar2.f16415q0.add(e11);
                        d dVar5 = e11.f16358T;
                        if (dVar5 != null) {
                            ((e) dVar5).f16415q0.remove(e11);
                            e11.C();
                        }
                        e11.f16358T = eVar2;
                        eVar3.a();
                        e11.f16377g0 = childAt3.getVisibility();
                        e11.f16376f0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(e11, eVar2.f16420v0);
                        }
                        if (eVar3.f17270d0) {
                            d1.h hVar = (d1.h) e11;
                            int i34 = eVar3.f17285m0;
                            int i35 = eVar3.f17287n0;
                            float f11 = eVar3.f17289o0;
                            if (f11 != -1.0f) {
                                if (f11 > -1.0f) {
                                    hVar.f16475q0 = f11;
                                    hVar.f16476r0 = -1;
                                    hVar.f16477s0 = -1;
                                }
                            } else if (i34 != -1) {
                                if (i34 > -1) {
                                    hVar.f16475q0 = -1.0f;
                                    hVar.f16476r0 = i34;
                                    hVar.f16477s0 = -1;
                                }
                            } else if (i35 != -1 && i35 > -1) {
                                hVar.f16475q0 = -1.0f;
                                hVar.f16476r0 = -1;
                                hVar.f16477s0 = i35;
                            }
                        } else {
                            int i36 = eVar3.f17274f0;
                            int i37 = eVar3.f17275g0;
                            int i38 = eVar3.f17277h0;
                            int i39 = eVar3.f17279i0;
                            int i40 = eVar3.f17280j0;
                            i11 = childCount3;
                            int i41 = eVar3.f17281k0;
                            float f12 = eVar3.f17283l0;
                            int i42 = eVar3.f17290p;
                            if (i42 != -1) {
                                d dVar6 = (d) sparseArray.get(i42);
                                if (dVar6 != null) {
                                    float f13 = eVar3.f17293r;
                                    e11.v(7, 7, eVar3.f17292q, 0, dVar6);
                                    e11.f16343D = f13;
                                }
                                eVar = eVar3;
                            } else {
                                if (i36 != -1) {
                                    d dVar7 = (d) sparseArray.get(i36);
                                    if (dVar7 != null) {
                                        e11.v(2, 2, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i40, dVar7);
                                    }
                                } else {
                                    i12 = -1;
                                    if (i37 != -1) {
                                        d dVar8 = (d) sparseArray.get(i37);
                                        if (dVar8 != null) {
                                            e11.v(2, 4, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i40, dVar8);
                                        }
                                    }
                                    if (i38 == i12) {
                                        d dVar9 = (d) sparseArray.get(i38);
                                        if (dVar9 != null) {
                                            e11.v(4, 2, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i41, dVar9);
                                        }
                                    } else if (i39 != i12 && (dVar = (d) sparseArray.get(i39)) != null) {
                                        e11.v(4, 4, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i41, dVar);
                                    }
                                    i13 = eVar3.f17278i;
                                    if (i13 == -1) {
                                        d dVar10 = (d) sparseArray.get(i13);
                                        if (dVar10 != null) {
                                            e11.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f17299x, dVar10);
                                        }
                                    } else {
                                        int i43 = eVar3.j;
                                        if (i43 != -1 && (dVar2 = (d) sparseArray.get(i43)) != null) {
                                            e11.v(3, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f17299x, dVar2);
                                        }
                                    }
                                    i14 = eVar3.k;
                                    if (i14 == -1) {
                                        d dVar11 = (d) sparseArray.get(i14);
                                        if (dVar11 != null) {
                                            e11.v(5, 3, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f17301z, dVar11);
                                        }
                                    } else {
                                        int i44 = eVar3.f17282l;
                                        if (i44 != -1 && (dVar3 = (d) sparseArray.get(i44)) != null) {
                                            e11.v(5, 5, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f17301z, dVar3);
                                        }
                                    }
                                    i15 = eVar3.f17284m;
                                    if (i15 == -1) {
                                        eVar = eVar3;
                                        l(e11, eVar3, sparseArray, i15, 6);
                                    } else {
                                        eVar = eVar3;
                                        int i45 = eVar.f17286n;
                                        if (i45 != -1) {
                                            l(e11, eVar, sparseArray, i45, 3);
                                        } else {
                                            int i46 = eVar.f17288o;
                                            if (i46 != -1) {
                                                l(e11, eVar, sparseArray, i46, 5);
                                            }
                                        }
                                    }
                                    if (f12 >= 0.0f) {
                                        e11.f16372d0 = f12;
                                    }
                                    f4 = eVar.f17243F;
                                    if (f4 >= 0.0f) {
                                        e11.f16374e0 = f4;
                                    }
                                }
                                i12 = -1;
                                if (i38 == i12) {
                                }
                                i13 = eVar3.f17278i;
                                if (i13 == -1) {
                                }
                                i14 = eVar3.k;
                                if (i14 == -1) {
                                }
                                i15 = eVar3.f17284m;
                                if (i15 == -1) {
                                }
                                if (f12 >= 0.0f) {
                                }
                                f4 = eVar.f17243F;
                                if (f4 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i19 = eVar.f17256T) != -1 || eVar.f17257U != -1)) {
                                int i47 = eVar.f17257U;
                                e11.f16363Y = i19;
                                e11.f16364Z = i47;
                            }
                            if (eVar.f17264a0) {
                                e11.M(1);
                                e11.O(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    e11.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.f17259W) {
                                    e11.M(3);
                                } else {
                                    e11.M(4);
                                }
                                e11.i(2).g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                e11.i(4).g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                e11.M(3);
                                e11.O(0);
                            }
                            if (eVar.f17266b0) {
                                i16 = -1;
                                e11.N(1);
                                e11.L(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    e11.N(2);
                                }
                            } else {
                                i16 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.f17260X) {
                                        e11.N(3);
                                    } else {
                                        e11.N(4);
                                    }
                                    e11.i(3).g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    e11.i(5).g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                                } else {
                                    e11.N(3);
                                    e11.L(0);
                                }
                            }
                            String str2 = eVar.f17244G;
                            if (str2 == null || str2.length() == 0) {
                                e11.f16361W = 0.0f;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i17 = i16;
                                    i18 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i17 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i16;
                                    i18 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i18);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i18, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i17 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    e11.f16361W = parseFloat;
                                    e11.f16362X = i17;
                                }
                            }
                            float f14 = eVar.f17245H;
                            float[] fArr = e11.f16383k0;
                            fArr[0] = f14;
                            fArr[1] = eVar.f17246I;
                            e11.f16381i0 = eVar.f17247J;
                            e11.f16382j0 = eVar.f17248K;
                            int i48 = eVar.f17262Z;
                            if (i48 >= 0 && i48 <= 3) {
                                e11.f16394q = i48;
                            }
                            int i49 = eVar.L;
                            int i50 = eVar.f17250N;
                            int i51 = eVar.f17252P;
                            float f15 = eVar.f17254R;
                            e11.f16395r = i49;
                            e11.f16398u = i50;
                            if (i51 == Integer.MAX_VALUE) {
                                i51 = 0;
                            }
                            e11.f16399v = i51;
                            e11.f16400w = f15;
                            if (f15 > 0.0f && f15 < 1.0f && i49 == 0) {
                                e11.f16395r = 2;
                            }
                            int i52 = eVar.f17249M;
                            int i53 = eVar.f17251O;
                            int i54 = eVar.f17253Q;
                            float f16 = eVar.f17255S;
                            e11.f16396s = i52;
                            e11.f16401x = i53;
                            if (i54 == Integer.MAX_VALUE) {
                                i54 = 0;
                            }
                            e11.f16402y = i54;
                            e11.f16403z = f16;
                            if (f16 > 0.0f && f16 < 1.0f && i52 == 0) {
                                e11.f16396s = 2;
                            }
                            i33++;
                            constraintLayout = this;
                            childCount3 = i11;
                        }
                    }
                    i11 = childCount3;
                    i33++;
                    constraintLayout = this;
                    childCount3 = i11;
                }
            }
            if (z8) {
                eVar2.f16416r0.Y(eVar2);
            }
        }
        eVar2.f16421w0.getClass();
        k(eVar2, this.f13230w, i7, i10);
        int q10 = eVar2.q();
        int k = eVar2.k();
        boolean z12 = eVar2.f16407E0;
        boolean z13 = eVar2.f16408F0;
        f fVar = this.f13221C;
        int i55 = fVar.f17306e;
        int resolveSizeAndState = View.resolveSizeAndState(q10 + fVar.f17305d, i7, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k + i55, i10, 0) & 16777215;
        int min = Math.min(this.f13227f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f13228u, resolveSizeAndState2);
        if (z12) {
            min |= 16777216;
        }
        if (z13) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d e2 = e(view);
        if ((view instanceof Guideline) && !(e2 instanceof d1.h)) {
            g1.e eVar = (g1.e) view.getLayoutParams();
            d1.h hVar = new d1.h();
            eVar.f17291p0 = hVar;
            eVar.f17270d0 = true;
            hVar.S(eVar.f17258V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((g1.e) view.getLayoutParams()).f17272e0 = true;
            ArrayList arrayList = this.f13223b;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f13222a.put(view.getId(), view);
        this.f13229v = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f13222a.remove(view.getId());
        d e2 = e(view);
        this.f13224c.f16415q0.remove(e2);
        e2.C();
        this.f13223b.remove(view);
        this.f13229v = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f13229v = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f13231x = nVar;
    }

    @Override // android.view.View
    public void setId(int i7) {
        int id = getId();
        SparseArray sparseArray = this.f13222a;
        sparseArray.remove(id);
        super.setId(i7);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i7) {
        if (i7 == this.f13228u) {
            return;
        }
        this.f13228u = i7;
        requestLayout();
    }

    public void setMaxWidth(int i7) {
        if (i7 == this.f13227f) {
            return;
        }
        this.f13227f = i7;
        requestLayout();
    }

    public void setMinHeight(int i7) {
        if (i7 == this.f13226e) {
            return;
        }
        this.f13226e = i7;
        requestLayout();
    }

    public void setMinWidth(int i7) {
        if (i7 == this.f13225d) {
            return;
        }
        this.f13225d = i7;
        requestLayout();
    }

    public void setOnConstraintsChanged(g1.o oVar) {
        C1111f c1111f = this.f13232y;
        if (c1111f != null) {
            c1111f.getClass();
        }
    }

    public void setOptimizationLevel(int i7) {
        this.f13230w = i7;
        e eVar = this.f13224c;
        eVar.f16406D0 = i7;
        b1.c.f13783q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
