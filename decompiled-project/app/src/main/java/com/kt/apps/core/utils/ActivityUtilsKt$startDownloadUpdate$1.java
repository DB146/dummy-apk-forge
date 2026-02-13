package com.kt.apps.core.utils;

import Db.m;
import Db.q;
import W1.G;
import android.app.Application;
import android.content.Context;
import android.widget.Toast;
import cc.E;
import com.kt.apps.core.update.AppUpdateRepository;
import com.kt.apps.core.update.downloadmanager.ApkDownloadTask;
import com.kt.apps.core.update.downloadmanager.ApkDownloader;
import com.kt.apps.core.update.downloadmanager.DownloadStatus;
import com.kt.apps.media.xemtv.beta.R;
import fc.InterfaceC1162i;
import fc.M;
import java.io.File;

@Jb.e(c = "com.kt.apps.core.utils.ActivityUtilsKt$startDownloadUpdate$1", f = "ActivityUtils.kt", l = {263, 265}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ActivityUtilsKt$startDownloadUpdate$1 extends Jb.i implements Rb.e {
    final /* synthetic */ G $this_startDownloadUpdate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityUtilsKt$startDownloadUpdate$1(G g, Hb.d<? super ActivityUtilsKt$startDownloadUpdate$1> dVar) {
        super(2, dVar);
        this.$this_startDownloadUpdate = g;
    }

    @Override // Jb.a
    public final Hb.d<q> create(Object obj, Hb.d<?> dVar) {
        ActivityUtilsKt$startDownloadUpdate$1 activityUtilsKt$startDownloadUpdate$1 = new ActivityUtilsKt$startDownloadUpdate$1(this.$this_startDownloadUpdate, dVar);
        activityUtilsKt$startDownloadUpdate$1.L$0 = obj;
        return activityUtilsKt$startDownloadUpdate$1;
    }

    @Override // Rb.e
    public final Object invoke(E e2, Hb.d<? super q> dVar) {
        return ((ActivityUtilsKt$startDownloadUpdate$1) create(e2, dVar)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        final E e2;
        M downloadFlow;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.label;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            e2 = (E) this.L$0;
            AppUpdateRepository.Companion companion = AppUpdateRepository.Companion;
            Context applicationContext = this.$this_startDownloadUpdate.getApplicationContext();
            kotlin.jvm.internal.l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            AppUpdateRepository companion2 = companion.getInstance((Application) applicationContext);
            this.L$0 = e2;
            this.label = 1;
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
            e2 = (E) this.L$0;
            com.bumptech.glide.c.c0(obj);
        }
        ApkDownloadTask apkDownloadTask = (ApkDownloadTask) obj;
        if (apkDownloadTask == null || (downloadFlow = apkDownloadTask.getDownloadFlow()) == null) {
            return q.f3365a;
        }
        final G g = this.$this_startDownloadUpdate;
        InterfaceC1162i interfaceC1162i = new InterfaceC1162i() { // from class: com.kt.apps.core.utils.ActivityUtilsKt$startDownloadUpdate$1.1
            public final Object emit(DownloadStatus downloadStatus, Hb.d<? super q> dVar) {
                Object n6;
                Object n8;
                Object n10;
                boolean z8 = downloadStatus instanceof DownloadStatus.Downloaded;
                q qVar = q.f3365a;
                if (z8) {
                    File file = ((DownloadStatus.Downloaded) downloadStatus).getFile();
                    G g2 = G.this;
                    if (ActivityUtilsKt.isSystemApps(g2)) {
                        try {
                            new ApkDownloader(g2).installSilenceIfSystem(file);
                            n6 = qVar;
                        } catch (Throwable th) {
                            n6 = com.bumptech.glide.c.n(th);
                        }
                        if (m.a(n6) != null) {
                            try {
                                new ApkDownloader(g2).installApkIfSystem(file);
                                n8 = qVar;
                            } catch (Throwable th2) {
                                n8 = com.bumptech.glide.c.n(th2);
                            }
                            if (m.a(n8) != null) {
                                Toast.makeText(g2, "Cài đặt không thành công", 1).show();
                            }
                        }
                    } else {
                        try {
                            new ApkDownloader(g2).installApk(file);
                            n10 = qVar;
                        } catch (Throwable th3) {
                            n10 = com.bumptech.glide.c.n(th3);
                        }
                        if (m.a(n10) != null) {
                            file.delete();
                            Toast.makeText(g2, R.string.install_failed, 1).show();
                        }
                    }
                }
                return qVar;
            }

            @Override // fc.InterfaceC1162i
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Hb.d dVar) {
                return emit((DownloadStatus) obj2, (Hb.d<? super q>) dVar);
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (downloadFlow.a(interfaceC1162i, this) == aVar) {
            return aVar;
        }
        throw new Db.d(0);
    }
}
