package A9;

import H2.AbstractC0303q;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class V0 extends H2.K {

    /* renamed from: d, reason: collision with root package name */
    public final VerticalGridView f977d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f978e;

    /* renamed from: f, reason: collision with root package name */
    public final U0 f979f;
    public final T0 g;

    /* renamed from: h, reason: collision with root package name */
    public final S0 f980h;

    /* renamed from: i, reason: collision with root package name */
    public final T f981i;
    public final ArrayList j;
    public final C0088g1 k;

    /* renamed from: l, reason: collision with root package name */
    public final C0084f1 f982l;

    /* renamed from: m, reason: collision with root package name */
    public P3.p f983m;

    /* renamed from: n, reason: collision with root package name */
    public final Y0 f984n;

    /* renamed from: o, reason: collision with root package name */
    public final Q0 f985o = new Q0(this, 0);

    public V0(ArrayList arrayList, C0088g1 c0088g1, C0092h1 c0092h1, C0084f1 c0084f1, boolean z8) {
        this.j = arrayList == null ? new ArrayList() : new ArrayList(arrayList);
        this.k = c0088g1;
        this.f982l = c0084f1;
        this.f979f = new U0(this);
        this.g = new T0(this, c0092h1);
        this.f980h = new S0(this, 0);
        this.f981i = new T(this);
        this.f978e = z8;
        if (!z8) {
            this.f984n = Y0.f1036c;
        }
        this.f977d = z8 ? c0084f1.f1141c : c0084f1.f1140b;
    }

    @Override // H2.K
    public final int a() {
        return this.j.size();
    }

    @Override // H2.K
    public final int c(int i7) {
        this.f982l.getClass();
        return 0;
    }

    @Override // H2.K
    public final void e(H2.i0 i0Var, int i7) {
        ArrayList arrayList = this.j;
        if (i7 >= arrayList.size()) {
            return;
        }
        C0080e1 c0080e1 = (C0080e1) i0Var;
        P0 p02 = (P0) arrayList.get(i7);
        C0084f1 c0084f1 = this.f982l;
        c0084f1.getClass();
        c0080e1.f1118u = p02;
        TextView textView = c0080e1.f1120w;
        if (textView != null) {
            textView.setInputType(p02.f931i);
            textView.setText(p02.f1101c);
            textView.setAlpha(p02.a() ? c0084f1.g : c0084f1.f1145h);
            textView.setFocusable(false);
            textView.setClickable(false);
            textView.setLongClickable(false);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                textView.setAutofillHints(null);
            } else if (i10 >= 26) {
                textView.setImportantForAutofill(2);
            }
        }
        TextView textView2 = c0080e1.f1121x;
        if (textView2 != null) {
            textView2.setInputType(p02.j);
            textView2.setText(p02.f1102d);
            textView2.setVisibility(TextUtils.isEmpty(p02.f1102d) ? 8 : 0);
            textView2.setAlpha(p02.a() ? c0084f1.f1146i : c0084f1.j);
            textView2.setFocusable(false);
            textView2.setClickable(false);
            textView2.setLongClickable(false);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                textView2.setAutofillHints(null);
            } else if (i11 >= 26) {
                textView.setImportantForAutofill(2);
            }
        }
        ImageView imageView = c0080e1.f1113A;
        if (imageView != null) {
            p02.getClass();
            imageView.setVisibility(8);
        }
        ImageView imageView2 = c0080e1.f1123z;
        if (imageView2 != null) {
            Drawable drawable = p02.f1100b;
            if (drawable != null) {
                imageView2.setImageLevel(drawable.getLevel());
                imageView2.setImageDrawable(drawable);
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
        if ((p02.f929f & 2) != 2) {
            if (textView != null) {
                int i12 = c0084f1.f1148m;
                if (i12 == 1) {
                    textView.setSingleLine(true);
                } else {
                    textView.setSingleLine(false);
                    textView.setMaxLines(i12);
                }
            }
            if (textView2 != null) {
                int i13 = c0084f1.f1150o;
                if (i13 == 1) {
                    textView2.setSingleLine(true);
                } else {
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(i13);
                }
            }
        } else if (textView != null) {
            int i14 = c0084f1.f1149n;
            if (i14 == 1) {
                textView.setSingleLine(true);
            } else {
                textView.setSingleLine(false);
                textView.setMaxLines(i14);
            }
            textView.setInputType(textView.getInputType() | 131072);
            if (textView2 != null) {
                textView2.setInputType(textView2.getInputType() | 131072);
                textView2.setMaxHeight((c0084f1.f1152q - (c0084f1.f1151p * 2)) - (textView.getLineHeight() * (c0084f1.f1149n * 2)));
            }
        }
        c0084f1.d(c0080e1, false, false);
        boolean z8 = (p02.f929f & 32) == 32;
        View view = c0080e1.f4707a;
        if (z8) {
            view.setFocusable(true);
            ((ViewGroup) view).setDescendantFocusability(131072);
        } else {
            view.setFocusable(false);
            ((ViewGroup) view).setDescendantFocusability(393216);
        }
        TextView textView3 = c0080e1.f1120w;
        EditText editText = textView3 instanceof EditText ? (EditText) textView3 : null;
        if (editText != null) {
            editText.setImeOptions(5);
        }
        TextView textView4 = c0080e1.f1121x;
        EditText editText2 = textView4 instanceof EditText ? (EditText) textView4 : null;
        if (editText2 != null) {
            editText2.setImeOptions(5);
        }
        c0084f1.f(c0080e1);
    }

    @Override // H2.K
    public final H2.i0 g(ViewGroup viewGroup, int i7) {
        C0080e1 c0080e1;
        C0084f1 c0084f1 = this.f982l;
        c0084f1.getClass();
        int i10 = R.layout.lb_guidedactions_item;
        if (i7 == 0) {
            c0080e1 = new C0080e1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_guidedactions_item, viewGroup, false), viewGroup == c0084f1.f1141c);
        } else {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new RuntimeException(A3.c.f(i7, "ViewType ", " not supported in GuidedActionsStylist"));
                }
                i10 = R.layout.lb_guidedactions_datepicker_item;
            }
            c0080e1 = new C0080e1(from.inflate(i10, viewGroup, false), viewGroup == c0084f1.f1141c);
        }
        View view = c0080e1.f4707a;
        view.setOnKeyListener(this.f979f);
        view.setOnClickListener(this.f985o);
        view.setOnFocusChangeListener(this.g);
        TextView textView = c0080e1.f1120w;
        o(textView instanceof EditText ? (EditText) textView : null);
        TextView textView2 = c0080e1.f1121x;
        o(textView2 instanceof EditText ? (EditText) textView2 : null);
        return c0080e1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View] */
    public final C0080e1 m(TextView textView) {
        VerticalGridView verticalGridView = this.f977d;
        if (!verticalGridView.f13625H) {
            return null;
        }
        ViewParent parent = textView.getParent();
        TextView textView2 = textView;
        while (parent != verticalGridView && parent != null) {
            ?? r42 = (View) parent;
            parent = parent.getParent();
            textView2 = r42;
        }
        if (parent != null) {
            return (C0080e1) verticalGridView.L(textView2);
        }
        return null;
    }

    public final void n(List list) {
        if (!this.f978e) {
            this.f982l.a(false);
        }
        T0 t02 = this.g;
        View view = t02.f966b;
        if (view != null) {
            V0 v02 = (V0) t02.f967c;
            VerticalGridView verticalGridView = v02.f977d;
            if (verticalGridView.f13625H) {
                H2.i0 L = verticalGridView.L(view);
                if (L != null) {
                    v02.f982l.getClass();
                } else {
                    Log.w("GuidedActionAdapter", "RecyclerView returned null view holder", new Throwable());
                }
            }
        }
        Y0 y02 = this.f984n;
        ArrayList arrayList = this.j;
        if (y02 == null) {
            arrayList.clear();
            arrayList.addAll(list);
            d();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(list);
            AbstractC0303q.c(new R0(this, arrayList2)).a(new D5.i(this, 13));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(EditText editText) {
        if (editText != 0) {
            editText.setPrivateImeOptions("escapeNorth");
            S0 s02 = this.f980h;
            editText.setOnEditorActionListener(s02);
            if (editText instanceof InterfaceC0104k1) {
                ((InterfaceC0104k1) editText).setImeKeyListener(s02);
            }
            if (editText instanceof X0) {
                ((X0) editText).setOnAutofillListener(this.f981i);
            }
        }
    }
}
