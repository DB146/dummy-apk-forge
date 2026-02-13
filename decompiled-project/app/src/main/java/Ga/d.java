package Ga;

import Db.q;
import Eb.v;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.Handshake;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.a f4415b;

    public /* synthetic */ d(int i7, Rb.a aVar) {
        this.f4414a = i7;
        this.f4415b = aVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        Rb.a aVar = this.f4415b;
        switch (this.f4414a) {
            case 0:
                aVar.invoke();
                return q.f3365a;
            default:
                Handshake.Companion companion = Handshake.f22326e;
                try {
                    return (List) aVar.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return v.f3891a;
                }
        }
    }
}
