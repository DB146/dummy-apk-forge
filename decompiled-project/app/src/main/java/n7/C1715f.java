package n7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.firebase.auth.FirebaseAuth;
import o7.C1815e;
import o7.InterfaceC1819i;

/* renamed from: n7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1715f implements InterfaceC1819i, o7.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f21288b;

    public /* synthetic */ C1715f(FirebaseAuth firebaseAuth, int i7) {
        this.f21287a = i7;
        this.f21288b = firebaseAuth;
    }

    @Override // o7.v
    public final void a(zzahn zzahnVar, l lVar) {
        switch (this.f21287a) {
            case 0:
                com.google.android.gms.common.internal.G.g(zzahnVar);
                com.google.android.gms.common.internal.G.g(lVar);
                ((C1815e) lVar).f22069a = zzahnVar;
                FirebaseAuth firebaseAuth = this.f21288b;
                firebaseAuth.getClass();
                FirebaseAuth.d(firebaseAuth, lVar, zzahnVar, true, true);
                return;
            default:
                FirebaseAuth firebaseAuth2 = this.f21288b;
                firebaseAuth2.getClass();
                FirebaseAuth.d(firebaseAuth2, lVar, zzahnVar, true, true);
                return;
        }
    }

    @Override // o7.InterfaceC1819i
    public final void zza(Status status) {
        switch (this.f21287a) {
            case 0:
                int i7 = status.f14897a;
                if (i7 == 17011 || i7 == 17021 || i7 == 17005 || i7 == 17091) {
                    this.f21288b.b();
                    return;
                }
                return;
            default:
                int i10 = status.f14897a;
                if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
                    this.f21288b.b();
                    return;
                }
                return;
        }
    }
}
