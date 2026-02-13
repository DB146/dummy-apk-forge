package oa;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.kt.apps.autoupdate.usecase.DownloadFileWorker;
import h3.y;

/* loaded from: classes2.dex */
public final class h implements Y1.b {
    @Override // Y1.b
    public final y a(Context context, WorkerParameters workerParameters) {
        return new DownloadFileWorker(context, workerParameters);
    }
}
