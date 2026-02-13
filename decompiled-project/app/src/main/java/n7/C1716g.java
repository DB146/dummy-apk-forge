package n7;

import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.firebase.auth.FirebaseAuth;
import o7.C1815e;

/* renamed from: n7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1716g implements o7.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f21289a;

    public C1716g(FirebaseAuth firebaseAuth) {
        this.f21289a = firebaseAuth;
    }

    @Override // o7.v
    public final void a(zzahn zzahnVar, l lVar) {
        com.google.android.gms.common.internal.G.g(zzahnVar);
        com.google.android.gms.common.internal.G.g(lVar);
        ((C1815e) lVar).f22069a = zzahnVar;
        FirebaseAuth firebaseAuth = this.f21289a;
        firebaseAuth.getClass();
        FirebaseAuth.d(firebaseAuth, lVar, zzahnVar, true, false);
    }
}
