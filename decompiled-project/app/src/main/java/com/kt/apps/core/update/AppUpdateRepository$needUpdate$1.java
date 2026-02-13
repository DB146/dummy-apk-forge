package com.kt.apps.core.update;

import Hb.d;
import Jb.c;
import Jb.e;

@e(c = "com.kt.apps.core.update.AppUpdateRepository", f = "AppUpdateRepository.kt", l = {101}, m = "needUpdate")
/* loaded from: classes2.dex */
public final class AppUpdateRepository$needUpdate$1 extends c {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppUpdateRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateRepository$needUpdate$1(AppUpdateRepository appUpdateRepository, d<? super AppUpdateRepository$needUpdate$1> dVar) {
        super(dVar);
        this.this$0 = appUpdateRepository;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.needUpdate(this);
    }
}
