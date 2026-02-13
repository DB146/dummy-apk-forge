package cn.pedant.SweetAlert;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import com.pnikosis.materialishprogress.ProgressWheel;

/* loaded from: classes.dex */
public class SweetAlertDialog extends Dialog implements View.OnClickListener {
    public static final int BUTTON_CANCEL = -2;
    public static final int BUTTON_CONFIRM = -1;
    public static final int CUSTOM_IMAGE_TYPE = 4;
    public static boolean DARK_STYLE = false;
    public static final int ERROR_TYPE = 1;
    public static final int NORMAL_TYPE = 0;
    public static final int PROGRESS_TYPE = 5;
    public static final int SUCCESS_TYPE = 2;
    public static final int WARNING_TYPE = 3;
    private int contentTextSize;
    private int mAlertType;
    private LinearLayout mButtonsContainer;
    private Button mCancelButton;
    private OnSweetClickListener mCancelClickListener;
    private String mCancelText;
    private boolean mCloseFromCancel;
    private Button mConfirmButton;
    private OnSweetClickListener mConfirmClickListener;
    private String mConfirmText;
    private String mContentText;
    public TextView mContentTextView;
    private ImageView mCustomImage;
    private Drawable mCustomImgDrawable;
    private View mCustomView;
    private FrameLayout mCustomViewContainer;
    public int mDefaultTextColor;
    private View mDialogView;
    private FrameLayout mErrorFrame;
    private Animation mErrorInAnim;
    private ImageView mErrorX;
    private AnimationSet mErrorXInAnim;
    private boolean mHideConfirmButton;
    private AnimationSet mModalInAnim;
    private AnimationSet mModalOutAnim;
    private Button mNeutralButton;
    private OnSweetClickListener mNeutralClickListener;
    private String mNeutralText;
    private Animation mOverlayOutAnim;
    private FrameLayout mProgressFrame;
    private ProgressHelper mProgressHelper;
    private boolean mShowCancel;
    private boolean mShowContent;
    private Animation mSuccessBowAnim;
    private FrameLayout mSuccessFrame;
    private AnimationSet mSuccessLayoutAnimSet;
    private View mSuccessLeftMask;
    private View mSuccessRightMask;
    private SuccessTickView mSuccessTick;
    private int mTextColor;
    private String mTitleText;
    private TextView mTitleTextView;
    private FrameLayout mWarningFrame;

    /* loaded from: classes.dex */
    public interface OnSweetClickListener {
        void onClick(SweetAlertDialog sweetAlertDialog);
    }

    public SweetAlertDialog(Context context) {
        this(context, 0);
    }

    public SweetAlertDialog(Context context, int i7) {
        super(context, DARK_STYLE ? R.style.alert_dialog_dark : R.style.alert_dialog_light);
        this.mHideConfirmButton = false;
        this.contentTextSize = 0;
        this.mDefaultTextColor = -1;
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.mProgressHelper = new ProgressHelper(context);
        this.mAlertType = i7;
        this.mErrorInAnim = OptAnimationLoader.loadAnimation(getContext(), R.anim.error_frame_in);
        this.mErrorXInAnim = (AnimationSet) OptAnimationLoader.loadAnimation(getContext(), R.anim.error_x_in);
        this.mSuccessBowAnim = OptAnimationLoader.loadAnimation(getContext(), R.anim.success_bow_roate);
        this.mSuccessLayoutAnimSet = (AnimationSet) OptAnimationLoader.loadAnimation(getContext(), R.anim.success_mask_layout);
        this.mModalInAnim = (AnimationSet) OptAnimationLoader.loadAnimation(getContext(), R.anim.modal_in);
        AnimationSet animationSet = (AnimationSet) OptAnimationLoader.loadAnimation(getContext(), R.anim.modal_out);
        this.mModalOutAnim = animationSet;
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: cn.pedant.SweetAlert.SweetAlertDialog.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                SweetAlertDialog.this.mDialogView.setVisibility(8);
                SweetAlertDialog.this.mDialogView.post(new Runnable() { // from class: cn.pedant.SweetAlert.SweetAlertDialog.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (SweetAlertDialog.this.mCloseFromCancel) {
                            SweetAlertDialog.super.cancel();
                        } else {
                            SweetAlertDialog.super.dismiss();
                        }
                    }
                });
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        Animation animation = new Animation() { // from class: cn.pedant.SweetAlert.SweetAlertDialog.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f4, Transformation transformation) {
                WindowManager.LayoutParams attributes = SweetAlertDialog.this.getWindow().getAttributes();
                attributes.alpha = 1.0f - f4;
                SweetAlertDialog.this.getWindow().setAttributes(attributes);
            }
        };
        this.mOverlayOutAnim = animation;
        animation.setDuration(120L);
    }

    private void adjustButtonContainerVisibility() {
        boolean z8;
        int i7 = 0;
        while (true) {
            if (i7 >= this.mButtonsContainer.getChildCount()) {
                z8 = false;
                break;
            }
            View childAt = this.mButtonsContainer.getChildAt(i7);
            if ((childAt instanceof Button) && childAt.getVisibility() == 0) {
                z8 = true;
                break;
            }
            i7++;
        }
        this.mButtonsContainer.setVisibility(z8 ? 0 : 8);
    }

    private void changeAlertType(int i7, boolean z8) {
        this.mAlertType = i7;
        if (this.mDialogView != null) {
            if (!z8) {
                restore();
            }
            this.mConfirmButton.setVisibility(this.mHideConfirmButton ? 8 : 0);
            int i10 = this.mAlertType;
            if (i10 == 1) {
                this.mErrorFrame.setVisibility(0);
            } else if (i10 == 2) {
                this.mSuccessFrame.setVisibility(0);
                this.mSuccessLeftMask.startAnimation(this.mSuccessLayoutAnimSet.getAnimations().get(0));
                this.mSuccessRightMask.startAnimation(this.mSuccessLayoutAnimSet.getAnimations().get(1));
            } else if (i10 == 3) {
                this.mWarningFrame.setVisibility(0);
            } else if (i10 == 4) {
                setCustomImage(this.mCustomImgDrawable);
            } else if (i10 == 5) {
                this.mProgressFrame.setVisibility(0);
                this.mConfirmButton.setVisibility(8);
            }
            adjustButtonContainerVisibility();
            if (z8) {
                return;
            }
            playAnimation();
        }
    }

    private void dismissWithAnimation(boolean z8) {
        this.mCloseFromCancel = z8;
        ((ViewGroup) this.mDialogView).getChildAt(0).startAnimation(this.mOverlayOutAnim);
        this.mDialogView.startAnimation(this.mModalOutAnim);
    }

    private void playAnimation() {
        int i7 = this.mAlertType;
        if (i7 == 1) {
            this.mErrorFrame.startAnimation(this.mErrorInAnim);
            this.mErrorX.startAnimation(this.mErrorXInAnim);
        } else if (i7 == 2) {
            this.mSuccessTick.startTickAnim();
            this.mSuccessRightMask.startAnimation(this.mSuccessBowAnim);
        }
    }

    private void restore() {
        this.mCustomImage.setVisibility(8);
        this.mErrorFrame.setVisibility(8);
        this.mSuccessFrame.setVisibility(8);
        this.mWarningFrame.setVisibility(8);
        this.mProgressFrame.setVisibility(8);
        this.mConfirmButton.setVisibility(this.mHideConfirmButton ? 8 : 0);
        adjustButtonContainerVisibility();
        this.mErrorFrame.clearAnimation();
        this.mErrorX.clearAnimation();
        this.mSuccessTick.clearAnimation();
        this.mSuccessLeftMask.clearAnimation();
        this.mSuccessRightMask.clearAnimation();
    }

    public static int spToPx(float f4, Context context) {
        return (int) TypedValue.applyDimension(2, f4, context.getResources().getDisplayMetrics());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        dismissWithAnimation(true);
    }

    public void changeAlertType(int i7) {
        changeAlertType(i7, false);
    }

    public void dismissWithAnimation() {
        dismissWithAnimation(false);
    }

    public int getAlerType() {
        return this.mAlertType;
    }

    public Button getButton(int i7) {
        return i7 != -3 ? i7 != -2 ? this.mConfirmButton : this.mCancelButton : this.mNeutralButton;
    }

    public String getCancelText() {
        return this.mCancelText;
    }

    public String getConfirmText() {
        return this.mConfirmText;
    }

    public String getContentText() {
        return this.mContentText;
    }

    public int getContentTextSize() {
        return this.contentTextSize;
    }

    public ProgressHelper getProgressHelper() {
        return this.mProgressHelper;
    }

    public String getTitleText() {
        return this.mTitleText;
    }

    public SweetAlertDialog hideConfirmButton() {
        this.mHideConfirmButton = true;
        return this;
    }

    public boolean isShowCancelButton() {
        return this.mShowCancel;
    }

    public boolean isShowContentText() {
        return this.mShowContent;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.cancel_button) {
            OnSweetClickListener onSweetClickListener = this.mCancelClickListener;
            if (onSweetClickListener != null) {
                onSweetClickListener.onClick(this);
                return;
            } else {
                dismissWithAnimation();
                return;
            }
        }
        if (view.getId() == R.id.confirm_button) {
            OnSweetClickListener onSweetClickListener2 = this.mConfirmClickListener;
            if (onSweetClickListener2 != null) {
                onSweetClickListener2.onClick(this);
                return;
            } else {
                dismissWithAnimation();
                return;
            }
        }
        if (view.getId() == R.id.neutral_button) {
            OnSweetClickListener onSweetClickListener3 = this.mNeutralClickListener;
            if (onSweetClickListener3 != null) {
                onSweetClickListener3.onClick(this);
            } else {
                dismissWithAnimation();
            }
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.alert_dialog);
        this.mDialogView = getWindow().getDecorView().findViewById(android.R.id.content);
        this.mTitleTextView = (TextView) findViewById(R.id.title_text);
        this.mContentTextView = (TextView) findViewById(R.id.content_text);
        this.mCustomViewContainer = (FrameLayout) findViewById(R.id.custom_view_container);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.error_frame);
        this.mErrorFrame = frameLayout;
        this.mErrorX = (ImageView) frameLayout.findViewById(R.id.error_x);
        this.mSuccessFrame = (FrameLayout) findViewById(R.id.success_frame);
        this.mProgressFrame = (FrameLayout) findViewById(R.id.progress_dialog);
        this.mSuccessTick = (SuccessTickView) this.mSuccessFrame.findViewById(R.id.success_tick);
        this.mSuccessLeftMask = this.mSuccessFrame.findViewById(R.id.mask_left);
        this.mSuccessRightMask = this.mSuccessFrame.findViewById(R.id.mask_right);
        this.mCustomImage = (ImageView) findViewById(R.id.custom_image);
        this.mWarningFrame = (FrameLayout) findViewById(R.id.warning_frame);
        this.mButtonsContainer = (LinearLayout) findViewById(R.id.buttons_container);
        Button button = (Button) findViewById(R.id.confirm_button);
        this.mConfirmButton = button;
        button.setOnClickListener(this);
        Button button2 = this.mConfirmButton;
        View.OnTouchListener onTouchListener = Constants.FOCUS_TOUCH_LISTENER;
        button2.setOnTouchListener(onTouchListener);
        Button button3 = (Button) findViewById(R.id.cancel_button);
        this.mCancelButton = button3;
        button3.setOnClickListener(this);
        this.mCancelButton.setOnTouchListener(onTouchListener);
        Button button4 = (Button) findViewById(R.id.neutral_button);
        this.mNeutralButton = button4;
        button4.setOnClickListener(this);
        this.mNeutralButton.setOnTouchListener(onTouchListener);
        this.mProgressHelper.setProgressWheel((ProgressWheel) findViewById(R.id.progressWheel));
        setTitleText(this.mTitleText);
        setContentText(this.mContentText);
        setCustomView(this.mCustomView);
        setCancelText(this.mCancelText);
        setConfirmText(this.mConfirmText);
        setNeutralText(this.mNeutralText);
        changeAlertType(this.mAlertType, true);
    }

    @Override // android.app.Dialog
    public void onStart() {
        this.mDialogView.startAnimation(this.mModalInAnim);
        playAnimation();
    }

    public void setBackground(Drawable drawable) {
        if (getWindow() == null) {
            return;
        }
        getWindow().setBackgroundDrawable(drawable);
        getWindow().setLayout(-2, -2);
    }

    public SweetAlertDialog setCancelButton(int i7, OnSweetClickListener onSweetClickListener) {
        setCancelButton(getContext().getResources().getString(i7), onSweetClickListener);
        return this;
    }

    public SweetAlertDialog setCancelButton(String str, OnSweetClickListener onSweetClickListener) {
        setCancelText(str);
        setCancelClickListener(onSweetClickListener);
        return this;
    }

    public SweetAlertDialog setCancelClickListener(OnSweetClickListener onSweetClickListener) {
        this.mCancelClickListener = onSweetClickListener;
        return this;
    }

    public SweetAlertDialog setCancelText(String str) {
        this.mCancelText = str;
        if (this.mCancelButton != null && str != null) {
            showCancelButton(true);
            this.mCancelButton.setText(this.mCancelText);
        }
        return this;
    }

    public SweetAlertDialog setConfirmButton(int i7, OnSweetClickListener onSweetClickListener) {
        setConfirmButton(getContext().getResources().getString(i7), onSweetClickListener);
        return this;
    }

    public SweetAlertDialog setConfirmButton(String str, OnSweetClickListener onSweetClickListener) {
        setConfirmText(str);
        setConfirmClickListener(onSweetClickListener);
        return this;
    }

    public SweetAlertDialog setConfirmClickListener(OnSweetClickListener onSweetClickListener) {
        this.mConfirmClickListener = onSweetClickListener;
        return this;
    }

    public SweetAlertDialog setConfirmText(String str) {
        this.mConfirmText = str;
        Button button = this.mConfirmButton;
        if (button != null && str != null) {
            button.setText(str);
        }
        return this;
    }

    public SweetAlertDialog setContentText(String str) {
        this.mContentText = str;
        if (this.mContentTextView != null && str != null) {
            showContentText(true);
            if (this.contentTextSize != 0) {
                this.mContentTextView.setTextSize(0, spToPx(r0, getContext()));
            }
            this.mContentTextView.setText(this.mContentText);
            this.mContentTextView.setVisibility(0);
            if (this.mAlertType == 1) {
                this.mDefaultTextColor = getContext().getResources().getColor(R.color.error_stroke_color);
            }
            this.mContentTextView.setTextColor(this.mDefaultTextColor);
            this.mCustomViewContainer.setVisibility(8);
        }
        return this;
    }

    public SweetAlertDialog setContentTextSize(int i7) {
        this.contentTextSize = i7;
        return this;
    }

    public SweetAlertDialog setCustomImage(int i7) {
        return setCustomImage(getContext().getResources().getDrawable(i7));
    }

    public SweetAlertDialog setCustomImage(Drawable drawable) {
        this.mCustomImgDrawable = drawable;
        ImageView imageView = this.mCustomImage;
        if (imageView != null && drawable != null) {
            imageView.setVisibility(0);
            this.mCustomImage.setImageDrawable(this.mCustomImgDrawable);
        }
        return this;
    }

    public SweetAlertDialog setCustomView(View view) {
        FrameLayout frameLayout;
        this.mCustomView = view;
        if (view != null && (frameLayout = this.mCustomViewContainer) != null) {
            frameLayout.addView(view);
            this.mCustomViewContainer.setVisibility(0);
            this.mContentTextView.setVisibility(8);
        }
        return this;
    }

    public SweetAlertDialog setNeutralButton(int i7, OnSweetClickListener onSweetClickListener) {
        setNeutralButton(getContext().getResources().getString(i7), onSweetClickListener);
        return this;
    }

    public SweetAlertDialog setNeutralButton(String str, OnSweetClickListener onSweetClickListener) {
        setNeutralText(str);
        setNeutralClickListener(onSweetClickListener);
        return this;
    }

    public SweetAlertDialog setNeutralClickListener(OnSweetClickListener onSweetClickListener) {
        this.mNeutralClickListener = onSweetClickListener;
        return this;
    }

    public SweetAlertDialog setNeutralText(String str) {
        this.mNeutralText = str;
        if (this.mNeutralButton != null && str != null && !str.isEmpty()) {
            this.mNeutralButton.setVisibility(0);
            this.mNeutralButton.setText(this.mNeutralText);
        }
        return this;
    }

    @Override // android.app.Dialog
    public void setTitle(int i7) {
        setTitleText(getContext().getResources().getString(i7));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        setTitleText(charSequence.toString());
    }

    public SweetAlertDialog setTitleText(int i7) {
        return setTitleText(getContext().getResources().getString(i7));
    }

    public SweetAlertDialog setTitleText(String str) {
        this.mTitleText = str;
        if (this.mTitleTextView != null && str != null) {
            if (str.isEmpty()) {
                this.mTitleTextView.setVisibility(8);
            } else {
                this.mTitleTextView.setVisibility(0);
                this.mTitleTextView.setText(Html.fromHtml(this.mTitleText));
            }
        }
        return this;
    }

    public SweetAlertDialog showCancelButton(boolean z8) {
        this.mShowCancel = z8;
        Button button = this.mCancelButton;
        if (button != null) {
            button.setVisibility(z8 ? 0 : 8);
        }
        return this;
    }

    public SweetAlertDialog showContentText(boolean z8) {
        this.mShowContent = z8;
        TextView textView = this.mContentTextView;
        if (textView != null) {
            textView.setVisibility(z8 ? 0 : 8);
        }
        return this;
    }
}
