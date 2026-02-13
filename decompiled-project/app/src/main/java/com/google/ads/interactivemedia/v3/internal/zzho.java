package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class zzho implements Continuation {
    public final /* synthetic */ zzhu zza;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        List<Task> list = (List) task.getResult();
        ArrayList arrayList = new ArrayList(list.size());
        for (Task task2 : list) {
            if (task2.isSuccessful()) {
                arrayList.add(task2.getResult());
            }
        }
        return arrayList;
    }
}
