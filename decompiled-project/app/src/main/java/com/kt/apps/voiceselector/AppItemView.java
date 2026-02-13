package com.kt.apps.voiceselector;

import Db.o;
import La.c;
import Rb.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.voiceselector.AppItemView;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class AppItemView extends ConstraintLayout {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f16245H = 0;

    /* renamed from: E, reason: collision with root package name */
    public final o f16246E;

    /* renamed from: F, reason: collision with root package name */
    public final o f16247F;

    /* renamed from: G, reason: collision with root package name */
    public final o f16248G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        MaterialTextView materialTextView;
        MaterialTextView materialTextView2;
        l.e(context, "context");
        l.e(attrs, "attrs");
        final int i7 = 0;
        this.f16246E = b.z(new a(this) { // from class: La.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppItemView f6430b;

            {
                this.f6430b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                AppItemView appItemView = this.f6430b;
                switch (i7) {
                    case 0:
                        int i10 = AppItemView.f16245H;
                        return (ShapeableImageView) appItemView.findViewById(R.id.app_icon);
                    case 1:
                        int i11 = AppItemView.f16245H;
                        return (MaterialTextView) appItemView.findViewById(R.id.title);
                    default:
                        int i12 = AppItemView.f16245H;
                        return (MaterialTextView) appItemView.findViewById(R.id.description);
                }
            }
        });
        final int i10 = 1;
        this.f16247F = b.z(new a(this) { // from class: La.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppItemView f6430b;

            {
                this.f6430b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                AppItemView appItemView = this.f6430b;
                switch (i10) {
                    case 0:
                        int i102 = AppItemView.f16245H;
                        return (ShapeableImageView) appItemView.findViewById(R.id.app_icon);
                    case 1:
                        int i11 = AppItemView.f16245H;
                        return (MaterialTextView) appItemView.findViewById(R.id.title);
                    default:
                        int i12 = AppItemView.f16245H;
                        return (MaterialTextView) appItemView.findViewById(R.id.description);
                }
            }
        });
        final int i11 = 2;
        this.f16248G = b.z(new a(this) { // from class: La.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppItemView f6430b;

            {
                this.f6430b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                AppItemView appItemView = this.f6430b;
                switch (i11) {
                    case 0:
                        int i102 = AppItemView.f16245H;
                        return (ShapeableImageView) appItemView.findViewById(R.id.app_icon);
                    case 1:
                        int i112 = AppItemView.f16245H;
                        return (MaterialTextView) appItemView.findViewById(R.id.title);
                    default:
                        int i12 = AppItemView.f16245H;
                        return (MaterialTextView) appItemView.findViewById(R.id.description);
                }
            }
        });
        View.inflate(getContext(), R.layout.app_item, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, c.f6432a, 0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            ((ShapeableImageView) findViewById(R.id.app_icon)).setImageDrawable(drawable);
        }
        String string = obtainStyledAttributes.getString(2);
        if (string != null && (materialTextView2 = (MaterialTextView) findViewById(R.id.title)) != null) {
            materialTextView2.setText(string);
        }
        String string2 = obtainStyledAttributes.getString(0);
        if (string2 != null && (materialTextView = (MaterialTextView) findViewById(R.id.description)) != null) {
            materialTextView.setText(string2);
        }
        obtainStyledAttributes.recycle();
    }

    private final MaterialTextView getDescriptionTextView() {
        return (MaterialTextView) this.f16248G.getValue();
    }

    private final ShapeableImageView getLogoIcon() {
        return (ShapeableImageView) this.f16246E.getValue();
    }

    private final MaterialTextView getTitleTextView() {
        return (MaterialTextView) this.f16247F.getValue();
    }

    public final Drawable getAppIcon() {
        return getLogoIcon().getDrawable();
    }

    public final String getDescriptionValue() {
        return getDescriptionTextView().getText().toString();
    }

    public final String getTitle() {
        return getTitleTextView().getText().toString();
    }

    public final void setAppIcon(Drawable drawable) {
        getLogoIcon().setImageDrawable(drawable);
    }

    public final void setDescriptionValue(String value) {
        l.e(value, "value");
        getDescriptionTextView().setText(value);
    }

    public final void setTitle(String value) {
        l.e(value, "value");
        getTitleTextView().setText(value);
    }
}
