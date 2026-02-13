package v7;

import com.google.android.gms.common.api.internal.G;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final G f25117a;

    /* renamed from: b, reason: collision with root package name */
    public final h f25118b;

    public i(G g, B7.d dVar) {
        this.f25117a = g;
        this.f25118b = new h(dVar);
    }

    public final void a(String str) {
        h hVar = this.f25118b;
        synchronized (hVar) {
            if (!Objects.equals(hVar.f25115b, str)) {
                h.a(hVar.f25114a, str, hVar.f25116c);
                hVar.f25115b = str;
            }
        }
    }
}
