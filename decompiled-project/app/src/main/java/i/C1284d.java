package i;

import A8.c0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.kt.apps.media.xemtv.beta.R;
import h.AbstractC1213a;
import java.lang.ref.WeakReference;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1284d {

    /* renamed from: A, reason: collision with root package name */
    public final int f18039A;

    /* renamed from: B, reason: collision with root package name */
    public final int f18040B;

    /* renamed from: C, reason: collision with root package name */
    public final int f18041C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f18042D;

    /* renamed from: E, reason: collision with root package name */
    public final c0 f18043E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f18045a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC1286f f18046b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f18047c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f18048d;

    /* renamed from: e, reason: collision with root package name */
    public SpannableString f18049e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f18050f;
    public View g;

    /* renamed from: i, reason: collision with root package name */
    public Button f18052i;
    public CharSequence j;
    public Message k;

    /* renamed from: l, reason: collision with root package name */
    public Button f18053l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f18054m;

    /* renamed from: n, reason: collision with root package name */
    public Message f18055n;

    /* renamed from: o, reason: collision with root package name */
    public Button f18056o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f18057p;

    /* renamed from: q, reason: collision with root package name */
    public Message f18058q;

    /* renamed from: r, reason: collision with root package name */
    public NestedScrollView f18059r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f18060s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f18061t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f18062u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f18063v;

    /* renamed from: w, reason: collision with root package name */
    public View f18064w;

    /* renamed from: x, reason: collision with root package name */
    public ListAdapter f18065x;

    /* renamed from: z, reason: collision with root package name */
    public final int f18067z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18051h = false;

    /* renamed from: y, reason: collision with root package name */
    public int f18066y = -1;

    /* renamed from: F, reason: collision with root package name */
    public final com.google.android.material.datepicker.k f18044F = new com.google.android.material.datepicker.k(this, 1);

    public C1284d(Context context, DialogInterfaceC1286f dialogInterfaceC1286f, Window window) {
        this.f18045a = context;
        this.f18046b = dialogInterfaceC1286f;
        this.f18047c = window;
        c0 c0Var = new c0();
        c0Var.f640b = new WeakReference(dialogInterfaceC1286f);
        this.f18043E = c0Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1213a.f17570e, R.attr.alertDialogStyle, 0);
        this.f18067z = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f18039A = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f18040B = obtainStyledAttributes.getResourceId(7, 0);
        this.f18041C = obtainStyledAttributes.getResourceId(3, 0);
        this.f18042D = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC1286f.f().h(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f18043E.obtainMessage(i7, onClickListener) : null;
        if (i7 == -3) {
            this.f18057p = charSequence;
            this.f18058q = obtainMessage;
        } else if (i7 == -2) {
            this.f18054m = charSequence;
            this.f18055n = obtainMessage;
        } else {
            if (i7 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.j = charSequence;
            this.k = obtainMessage;
        }
    }
}
