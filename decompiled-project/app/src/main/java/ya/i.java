package ya;

import Db.q;
import android.app.Application;
import android.content.Context;
import cc.E;
import com.kt.apps.core.update.AppUpdateRepository;
import com.kt.apps.core.update.downloadmanager.ApkDownloadTask;
import fc.M;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class i extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27564a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f27566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Hb.d dVar) {
        super(2, dVar);
        this.f27566c = jVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        i iVar = new i(this.f27566c, dVar);
        iVar.f27565b = obj;
        return iVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        E e2;
        M downloadFlow;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27564a;
        j jVar = this.f27566c;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            e2 = (E) this.f27565b;
            AppUpdateRepository.Companion companion = AppUpdateRepository.Companion;
            Context applicationContext = jVar.i0().getApplicationContext();
            l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            AppUpdateRepository companion2 = companion.getInstance((Application) applicationContext);
            this.f27565b = e2;
            this.f27564a = 1;
            obj = companion2.startDownload(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
                throw new Db.d(0);
            }
            e2 = (E) this.f27565b;
            com.bumptech.glide.c.c0(obj);
        }
        ApkDownloadTask apkDownloadTask = (ApkDownloadTask) obj;
        if (apkDownloadTask == null || (downloadFlow = apkDownloadTask.getDownloadFlow()) == null) {
            return q.f3365a;
        }
        h hVar = new h(jVar, e2);
        this.f27565b = null;
        this.f27564a = 2;
        if (downloadFlow.a(hVar, this) == aVar) {
            return aVar;
        }
        throw new Db.d(0);
    }
}
