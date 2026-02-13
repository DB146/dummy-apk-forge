package o;

import android.content.Context;
import android.view.View;
import android.view.Window;
import n.C1667a;

/* loaded from: classes.dex */
public final class T0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C1667a f21433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f21434b;

    /* JADX WARN: Type inference failed for: r0v0, types: [n.a, java.lang.Object] */
    public T0(U0 u02) {
        this.f21434b = u02;
        Context context = u02.f21436a.getContext();
        CharSequence charSequence = u02.f21442h;
        ?? obj = new Object();
        obj.f20889e = 4096;
        obj.f20891u = 4096;
        obj.f20896z = null;
        obj.f20881A = null;
        obj.f20882B = false;
        obj.f20883C = false;
        obj.f20884D = 16;
        obj.f20893w = context;
        obj.f20885a = charSequence;
        this.f21433a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        U0 u02 = this.f21434b;
        Window.Callback callback = u02.k;
        if (callback == null || !u02.f21444l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f21433a);
    }
}
