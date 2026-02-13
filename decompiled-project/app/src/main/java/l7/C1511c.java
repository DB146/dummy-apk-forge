package l7;

import A9.O0;
import Y6.i;
import Y6.m;
import android.content.Context;
import com.google.android.gms.common.internal.G;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import g7.InterfaceC1200a;
import h7.C1259e;
import h7.g;
import j8.InterfaceC1387b;
import java.util.concurrent.Executor;

/* renamed from: l7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511c implements InterfaceC1200a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19588a;

    /* renamed from: b, reason: collision with root package name */
    public final IntegrityManager f19589b;

    /* renamed from: c, reason: collision with root package name */
    public final O0 f19590c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f19591d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f19592e;

    /* renamed from: f, reason: collision with root package name */
    public final g f19593f;

    /* JADX WARN: Type inference failed for: r2v0, types: [A9.O0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [h7.g, java.lang.Object] */
    public C1511c(i iVar, Executor executor, Executor executor2) {
        iVar.b();
        String str = iVar.f12043c.f12058e;
        iVar.b();
        IntegrityManager create = IntegrityManagerFactory.create(iVar.f12041a);
        iVar.b();
        iVar.b();
        InterfaceC1387b interfaceC1387b = ((C1259e) iVar.c(C1259e.class)).f17837b;
        ?? obj = new Object();
        Context context = iVar.f12041a;
        G.g(context);
        m mVar = iVar.f12043c;
        G.g(mVar);
        G.g(interfaceC1387b);
        obj.f922a = context;
        obj.f923b = mVar.f12054a;
        obj.f924c = mVar.f12055b;
        String str2 = mVar.g;
        obj.f925d = str2;
        if (str2 == null) {
            throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
        }
        obj.f926e = interfaceC1387b;
        ?? obj2 = new Object();
        obj2.f17852a = 0L;
        obj2.f17853b = -1L;
        this.f19588a = str;
        this.f19589b = create;
        this.f19590c = obj;
        this.f19591d = executor;
        this.f19592e = executor2;
        this.f19593f = obj2;
    }
}
