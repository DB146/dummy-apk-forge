package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1281a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1284d f18024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1282b f18025b;

    public C1281a(C1282b c1282b, C1284d c1284d) {
        this.f18025b = c1282b;
        this.f18024a = c1284d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        C1282b c1282b = this.f18025b;
        DialogInterface.OnClickListener onClickListener = c1282b.f18035m;
        C1284d c1284d = this.f18024a;
        onClickListener.onClick(c1284d.f18046b, i7);
        if (c1282b.f18037o) {
            return;
        }
        c1284d.f18046b.dismiss();
    }
}
