package com.kt.apps.core.update.downloadmanager;

import Hb.d;
import cc.E;
import cc.F;
import fc.I;
import fc.K;
import fc.M;
import fc.P;
import fc.Q;
import java.io.File;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class ApkDownloadTask {
    private final String apkName;
    private final String apkUrl;
    private final OkHttpClient client;
    private final I downloadChannel;
    private final M downloadFlow;
    private int downloadProgress;
    private final E downloadScope;

    public ApkDownloadTask(String apkUrl, String apkName, OkHttpClient client, int i7, E downloadScope) {
        P a9;
        l.e(apkUrl, "apkUrl");
        l.e(apkName, "apkName");
        l.e(client, "client");
        l.e(downloadScope, "downloadScope");
        this.apkUrl = apkUrl;
        this.apkName = apkName;
        this.client = client;
        this.downloadProgress = i7;
        this.downloadScope = downloadScope;
        a9 = Q.a((r4 & 1) != 0 ? 0 : 1, (r4 & 2) == 0 ? 16 : 0, (r4 & 4) == 0 ? 2 : 1);
        this.downloadChannel = a9;
        this.downloadFlow = new K(a9);
    }

    public /* synthetic */ ApkDownloadTask(String str, String str2, OkHttpClient okHttpClient, int i7, E e2, int i10, f fVar) {
        this(str, str2, okHttpClient, (i10 & 8) != 0 ? 0 : i7, e2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startDownloadTask(d<? super File> dVar) {
        return F.K(cc.P.f14500c, new ApkDownloadTask$startDownloadTask$2(this, null), dVar);
    }

    public final M getDownloadFlow() {
        return this.downloadFlow;
    }

    public final void startDownload() {
        F.B(this.downloadScope, null, 0, new ApkDownloadTask$startDownload$1(this, null), 3);
    }
}
