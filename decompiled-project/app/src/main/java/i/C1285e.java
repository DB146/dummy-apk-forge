package i;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import n.DialogInterfaceOnKeyListenerC1679m;

/* renamed from: i.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1285e {

    /* renamed from: a, reason: collision with root package name */
    public final C1282b f18068a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18069b;

    public C1285e(Context context) {
        this(context, DialogInterfaceC1286f.h(context, 0));
    }

    public C1285e(Context context, int i7) {
        this.f18068a = new C1282b(new ContextThemeWrapper(context, DialogInterfaceC1286f.h(context, i7)));
        this.f18069b = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public DialogInterfaceC1286f create() {
        C1282b c1282b = this.f18068a;
        DialogInterfaceC1286f dialogInterfaceC1286f = new DialogInterfaceC1286f(c1282b.f18026a, this.f18069b);
        View view = c1282b.f18030e;
        C1284d c1284d = dialogInterfaceC1286f.f18070f;
        if (view != null) {
            c1284d.f18064w = view;
        } else {
            CharSequence charSequence = c1282b.f18029d;
            if (charSequence != null) {
                c1284d.f18048d = charSequence;
                TextView textView = c1284d.f18062u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c1282b.f18028c;
            if (drawable != null) {
                c1284d.f18060s = drawable;
                ImageView imageView = c1284d.f18061t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c1284d.f18061t.setImageDrawable(drawable);
                }
            }
        }
        SpannableString spannableString = c1282b.f18031f;
        if (spannableString != null) {
            c1284d.f18049e = spannableString;
            TextView textView2 = c1284d.f18063v;
            if (textView2 != null) {
                textView2.setText(spannableString);
            }
        }
        CharSequence charSequence2 = c1282b.g;
        if (charSequence2 != null) {
            c1284d.c(-1, charSequence2, c1282b.f18032h);
        }
        CharSequence charSequence3 = c1282b.f18033i;
        if (charSequence3 != null) {
            c1284d.c(-2, charSequence3, c1282b.j);
        }
        if (c1282b.f18034l != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c1282b.f18027b.inflate(c1284d.f18039A, (ViewGroup) null);
            int i7 = c1282b.f18037o ? c1284d.f18040B : c1284d.f18041C;
            Object obj = c1282b.f18034l;
            ?? r82 = obj;
            if (obj == null) {
                r82 = new ArrayAdapter(c1282b.f18026a, i7, R.id.text1, (Object[]) null);
            }
            c1284d.f18065x = r82;
            c1284d.f18066y = c1282b.f18038p;
            if (c1282b.f18035m != null) {
                alertController$RecycleListView.setOnItemClickListener(new C1281a(c1282b, c1284d));
            }
            if (c1282b.f18037o) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c1284d.f18050f = alertController$RecycleListView;
        }
        View view2 = c1282b.f18036n;
        if (view2 != null) {
            c1284d.g = view2;
            c1284d.f18051h = false;
        }
        dialogInterfaceC1286f.setCancelable(true);
        dialogInterfaceC1286f.setCanceledOnTouchOutside(true);
        dialogInterfaceC1286f.setOnCancelListener(null);
        dialogInterfaceC1286f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC1679m dialogInterfaceOnKeyListenerC1679m = c1282b.k;
        if (dialogInterfaceOnKeyListenerC1679m != null) {
            dialogInterfaceC1286f.setOnKeyListener(dialogInterfaceOnKeyListenerC1679m);
        }
        return dialogInterfaceC1286f;
    }

    public Context getContext() {
        return this.f18068a.f18026a;
    }

    public C1285e setNegativeButton(int i7, DialogInterface.OnClickListener onClickListener) {
        C1282b c1282b = this.f18068a;
        c1282b.f18033i = c1282b.f18026a.getText(i7);
        c1282b.j = onClickListener;
        return this;
    }

    public C1285e setPositiveButton(int i7, DialogInterface.OnClickListener onClickListener) {
        C1282b c1282b = this.f18068a;
        c1282b.g = c1282b.f18026a.getText(i7);
        c1282b.f18032h = onClickListener;
        return this;
    }

    public C1285e setTitle(CharSequence charSequence) {
        this.f18068a.f18029d = charSequence;
        return this;
    }

    public C1285e setView(View view) {
        this.f18068a.f18036n = view;
        return this;
    }
}
