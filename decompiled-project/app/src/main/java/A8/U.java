package A8;

import android.util.Log;
import java.util.Map;

/* loaded from: classes.dex */
public final class U extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public B f582a;

    /* renamed from: b, reason: collision with root package name */
    public W f583b;

    /* renamed from: c, reason: collision with root package name */
    public S f584c;

    /* renamed from: d, reason: collision with root package name */
    public Y6.i f585d;

    /* renamed from: e, reason: collision with root package name */
    public P f586e;

    /* renamed from: f, reason: collision with root package name */
    public E8.j f587f;

    /* renamed from: u, reason: collision with root package name */
    public int f588u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ W f589v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ P f590w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w10, P p10, Hb.d dVar) {
        super(2, dVar);
        this.f589v = w10;
        this.f590w = p10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new U(this.f589v, this.f590w, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ba  */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a9;
        Object a10;
        B b2;
        Y6.i firebaseApp;
        Object b10;
        S s3;
        P sessionDetails;
        E8.j sessionsSettings;
        v7.i iVar;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f588u;
        W w10 = this.f589v;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f588u = 1;
            a9 = W.a(w10, this);
            if (a9 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionsSettings = this.f587f;
                    sessionDetails = this.f586e;
                    Y6.i iVar2 = this.f585d;
                    S s10 = this.f584c;
                    W w11 = this.f583b;
                    b2 = this.f582a;
                    com.bumptech.glide.c.c0(obj);
                    firebaseApp = iVar2;
                    w10 = w11;
                    s3 = s10;
                    b10 = obj;
                    Map subscribers = (Map) b10;
                    String str = b2.f534a;
                    s3.getClass();
                    kotlin.jvm.internal.l.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.l.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.l.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.l.e(subscribers, "subscribers");
                    String firebaseAuthenticationToken = b2.f535b;
                    kotlin.jvm.internal.l.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
                    v7.i iVar3 = (v7.i) subscribers.get(B8.d.f2230b);
                    EnumC0046j enumC0046j = EnumC0046j.COLLECTION_DISABLED;
                    EnumC0046j enumC0046j2 = EnumC0046j.COLLECTION_ENABLED;
                    EnumC0046j enumC0046j3 = EnumC0046j.COLLECTION_SDK_NOT_INSTALLED;
                    EnumC0046j enumC0046j4 = iVar3 != null ? enumC0046j3 : iVar3.f25117a.b() ? enumC0046j2 : enumC0046j;
                    iVar = (v7.i) subscribers.get(B8.d.f2229a);
                    if (iVar != null) {
                        enumC0046j = enumC0046j3;
                    } else if (iVar.f25117a.b()) {
                        enumC0046j = enumC0046j2;
                    }
                    Q q10 = new Q(new a0(sessionDetails.f574a, sessionDetails.f575b, sessionDetails.f576c, sessionDetails.f577d, new C0047k(enumC0046j4, enumC0046j, sessionsSettings.a()), str, firebaseAuthenticationToken), S.a(firebaseApp));
                    int i10 = W.g;
                    w10.getClass();
                    try {
                        w10.f599d.a(q10);
                        Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
                    } catch (RuntimeException e2) {
                        Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e2);
                    }
                    return Db.q.f3365a;
                }
                com.bumptech.glide.c.c0(obj);
                a10 = obj;
                b2 = (B) a10;
                S s11 = S.f580a;
                B8.c cVar = B8.c.f2227a;
                this.f582a = b2;
                this.f583b = w10;
                this.f584c = s11;
                firebaseApp = w10.f596a;
                this.f585d = firebaseApp;
                P p10 = this.f590w;
                this.f586e = p10;
                E8.j jVar = w10.f598c;
                this.f587f = jVar;
                this.f588u = 3;
                b10 = cVar.b(this);
                if (b10 != aVar) {
                    return aVar;
                }
                s3 = s11;
                sessionDetails = p10;
                sessionsSettings = jVar;
                Map subscribers2 = (Map) b10;
                String str2 = b2.f534a;
                s3.getClass();
                kotlin.jvm.internal.l.e(firebaseApp, "firebaseApp");
                kotlin.jvm.internal.l.e(sessionDetails, "sessionDetails");
                kotlin.jvm.internal.l.e(sessionsSettings, "sessionsSettings");
                kotlin.jvm.internal.l.e(subscribers2, "subscribers");
                String firebaseAuthenticationToken2 = b2.f535b;
                kotlin.jvm.internal.l.e(firebaseAuthenticationToken2, "firebaseAuthenticationToken");
                v7.i iVar32 = (v7.i) subscribers2.get(B8.d.f2230b);
                EnumC0046j enumC0046j5 = EnumC0046j.COLLECTION_DISABLED;
                EnumC0046j enumC0046j22 = EnumC0046j.COLLECTION_ENABLED;
                EnumC0046j enumC0046j32 = EnumC0046j.COLLECTION_SDK_NOT_INSTALLED;
                if (iVar32 != null) {
                }
                iVar = (v7.i) subscribers2.get(B8.d.f2229a);
                if (iVar != null) {
                }
                Q q102 = new Q(new a0(sessionDetails.f574a, sessionDetails.f575b, sessionDetails.f576c, sessionDetails.f577d, new C0047k(enumC0046j4, enumC0046j5, sessionsSettings.a()), str2, firebaseAuthenticationToken2), S.a(firebaseApp));
                int i102 = W.g;
                w10.getClass();
                w10.f599d.a(q102);
                Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
                return Db.q.f3365a;
            }
            com.bumptech.glide.c.c0(obj);
            a9 = obj;
        }
        if (((Boolean) a9).booleanValue()) {
            A a11 = B.f533c;
            this.f588u = 2;
            a10 = a11.a(w10.f597b, this);
            if (a10 == aVar) {
                return aVar;
            }
            b2 = (B) a10;
            S s112 = S.f580a;
            B8.c cVar2 = B8.c.f2227a;
            this.f582a = b2;
            this.f583b = w10;
            this.f584c = s112;
            firebaseApp = w10.f596a;
            this.f585d = firebaseApp;
            P p102 = this.f590w;
            this.f586e = p102;
            E8.j jVar2 = w10.f598c;
            this.f587f = jVar2;
            this.f588u = 3;
            b10 = cVar2.b(this);
            if (b10 != aVar) {
            }
        }
        return Db.q.f3365a;
    }
}
