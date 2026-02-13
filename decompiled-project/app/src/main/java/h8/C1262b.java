package h8;

import Y6.i;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import p7.p;
import t8.C2033b;

/* renamed from: h8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1262b implements p7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17870b;

    public /* synthetic */ C1262b(p pVar, int i7) {
        this.f17869a = i7;
        this.f17870b = pVar;
    }

    @Override // p7.c
    public final Object g(T6.a aVar) {
        switch (this.f17869a) {
            case 0:
                return new d((Context) aVar.a(Context.class), ((i) aVar.a(i.class)).g(), aVar.b(p.a(e.class)), aVar.d(C2033b.class), (Executor) aVar.g(this.f17870b));
            case 1:
                return FirebaseMessagingRegistrar.a(this.f17870b, aVar);
            default:
                return RemoteConfigRegistrar.a(this.f17870b, aVar);
        }
    }
}
