package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import i.C1282b;
import i.C1285e;
import i.DialogInterfaceC1286f;

/* loaded from: classes.dex */
public final class F implements K, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC1286f f21368a;

    /* renamed from: b, reason: collision with root package name */
    public G f21369b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f21370c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f21371d;

    public F(L l10) {
        this.f21371d = l10;
    }

    @Override // o.K
    public final int a() {
        return 0;
    }

    @Override // o.K
    public final boolean b() {
        DialogInterfaceC1286f dialogInterfaceC1286f = this.f21368a;
        if (dialogInterfaceC1286f != null) {
            return dialogInterfaceC1286f.isShowing();
        }
        return false;
    }

    @Override // o.K
    public final Drawable d() {
        return null;
    }

    @Override // o.K
    public final void dismiss() {
        DialogInterfaceC1286f dialogInterfaceC1286f = this.f21368a;
        if (dialogInterfaceC1286f != null) {
            dialogInterfaceC1286f.dismiss();
            this.f21368a = null;
        }
    }

    @Override // o.K
    public final void g(CharSequence charSequence) {
        this.f21370c = charSequence;
    }

    @Override // o.K
    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // o.K
    public final void i(int i7) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // o.K
    public final void j(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // o.K
    public final void k(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // o.K
    public final void l(int i7, int i10) {
        if (this.f21369b == null) {
            return;
        }
        L l10 = this.f21371d;
        C1285e c1285e = new C1285e(l10.getPopupContext());
        CharSequence charSequence = this.f21370c;
        if (charSequence != null) {
            c1285e.setTitle(charSequence);
        }
        G g = this.f21369b;
        int selectedItemPosition = l10.getSelectedItemPosition();
        C1282b c1282b = c1285e.f18068a;
        c1282b.f18034l = g;
        c1282b.f18035m = this;
        c1282b.f18038p = selectedItemPosition;
        c1282b.f18037o = true;
        DialogInterfaceC1286f create = c1285e.create();
        this.f21368a = create;
        AlertController$RecycleListView alertController$RecycleListView = create.f18070f.f18050f;
        alertController$RecycleListView.setTextDirection(i7);
        alertController$RecycleListView.setTextAlignment(i10);
        this.f21368a.show();
    }

    @Override // o.K
    public final int m() {
        return 0;
    }

    @Override // o.K
    public final CharSequence o() {
        return this.f21370c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        L l10 = this.f21371d;
        l10.setSelection(i7);
        if (l10.getOnItemClickListener() != null) {
            l10.performItemClick(null, i7, this.f21369b.getItemId(i7));
        }
        dismiss();
    }

    @Override // o.K
    public final void p(ListAdapter listAdapter) {
        this.f21369b = (G) listAdapter;
    }
}
