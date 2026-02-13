package p9;

import android.content.Intent;
import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f23187b;

    public /* synthetic */ f(i iVar, int i7) {
        this.f23186a = i7;
        this.f23187b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f23187b;
        switch (this.f23186a) {
            case 0:
                iVar.getClass();
                Log.d("i", "Finishing due to inactivity");
                iVar.f23191a.finish();
                return;
            default:
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.putExtra("TIMEOUT", true);
                iVar.f23191a.setResult(0, intent);
                iVar.a();
                return;
        }
    }
}
