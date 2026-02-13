package C6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f2977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2978c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f2979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f2980e;

    public o(p pVar, int i7, TextView textView, int i10, TextView textView2) {
        this.f2980e = pVar;
        this.f2976a = i7;
        this.f2977b = textView;
        this.f2978c = i10;
        this.f2979d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i7 = this.f2976a;
        p pVar = this.f2980e;
        pVar.f2993n = i7;
        pVar.f2991l = null;
        TextView textView = this.f2977b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f2978c == 1 && (appCompatTextView = pVar.f2997r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f2979d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f2979d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
