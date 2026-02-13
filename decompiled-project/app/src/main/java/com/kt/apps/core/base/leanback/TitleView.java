package com.kt.apps.core.base.leanback;

import A9.K2;
import A9.p3;
import A9.q3;
import A9.r3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public class TitleView extends FrameLayout implements q3 {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f16108a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f16109b;

    /* renamed from: c, reason: collision with root package name */
    public final SearchOrbView f16110c;

    /* renamed from: d, reason: collision with root package name */
    public int f16111d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16112e;

    /* renamed from: f, reason: collision with root package name */
    public final p3 f16113f;

    public TitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.browseTitleViewStyle);
        this.f16111d = 6;
        this.f16112e = false;
        this.f16113f = new p3(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.lb_title_view, this);
        this.f16108a = (ImageView) inflate.findViewById(R.id.title_badge);
        this.f16109b = (TextView) inflate.findViewById(R.id.title_text);
        this.f16110c = (SearchOrbView) inflate.findViewById(R.id.title_orb);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final void a() {
        ImageView imageView = this.f16108a;
        Drawable drawable = imageView.getDrawable();
        TextView textView = this.f16109b;
        if (drawable != null) {
            imageView.setVisibility(0);
            textView.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            textView.setVisibility(0);
        }
    }

    public Drawable getBadgeDrawable() {
        return this.f16108a.getDrawable();
    }

    public K2 getSearchAffordanceColors() {
        return this.f16110c.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.f16110c;
    }

    public CharSequence getTitle() {
        return this.f16109b.getText();
    }

    @Override // A9.q3
    public r3 getTitleViewAdapter() {
        return this.f16113f;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f16108a.setImageDrawable(drawable);
        a();
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        this.f16112e = onClickListener != null;
        this.f16110c.setOnOrbClickedListener(onClickListener);
        this.f16110c.setVisibility((this.f16112e && (this.f16111d & 4) == 4) ? 0 : 4);
    }

    public void setSearchAffordanceColors(K2 k22) {
        this.f16110c.setOrbColors(k22);
    }

    public void setTitle(CharSequence charSequence) {
        this.f16109b.setText(charSequence);
        a();
    }
}
