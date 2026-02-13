package com.kt.apps.core.update;

import Db.l;
import Db.q;
import G8.m;
import Hb.d;
import Ib.a;
import Jb.e;
import Jb.i;
import ac.g;
import android.content.SharedPreferences;
import android.util.Log;
import cc.E;
import cc.F;
import cc.I;
import cc.P;
import com.bumptech.glide.c;

@e(c = "com.kt.apps.core.update.AppUpdateRepository$loadUpdateConfig$2", f = "AppUpdateRepository.kt", l = {44, 88}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AppUpdateRepository$loadUpdateConfig$2 extends i implements Rb.e {
    final /* synthetic */ boolean $force;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppUpdateRepository this$0;

    @e(c = "com.kt.apps.core.update.AppUpdateRepository$loadUpdateConfig$2$1", f = "AppUpdateRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.kt.apps.core.update.AppUpdateRepository$loadUpdateConfig$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends i implements Rb.e {
        final /* synthetic */ boolean $force;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AppUpdateRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z8, AppUpdateRepository appUpdateRepository, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$force = z8;
            this.this$0 = appUpdateRepository;
        }

        @Override // Jb.a
        public final d<q> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$force, this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Rb.e
        public final Object invoke(E e2, d<? super UpdateDTO> dVar) {
            return ((AnonymousClass1) create(e2, dVar)).invokeSuspend(q.f3365a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [Db.l] */
        @Override // Jb.a
        public final Object invokeSuspend(Object obj) {
            UpdateDTO updateDTO;
            Object n6;
            a aVar = a.f5345a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.c0(obj);
            if (!this.$force) {
                if (System.currentTimeMillis() - this.this$0.getSharedPref().getLong(AppUpdateRepository.KEY_LAST_LOAD_CONFIG, 0L) < 3600000) {
                    if (this.this$0.getLastUpdateConfig() != null) {
                        return this.this$0.getLastUpdateConfig();
                    }
                    String string = this.this$0.getSharedPref().getString(AppUpdateRepository.KEY_LAST_CONFIG, null);
                    if (string != null && string.length() != 0) {
                        AppUpdateRepository appUpdateRepository = this.this$0;
                        try {
                            m gson = appUpdateRepository.getGson();
                            gson.getClass();
                            n6 = (UpdateDTO) gson.b(string, new N8.a(UpdateDTO.class));
                        } catch (Throwable th) {
                            n6 = c.n(th);
                        }
                        if (n6 instanceof l) {
                            n6 = null;
                        }
                        appUpdateRepository.lastUpdateConfig = (UpdateDTO) n6;
                        if (this.this$0.getLastUpdateConfig() != null) {
                            return this.this$0.getLastUpdateConfig();
                        }
                    }
                }
            }
            String obj2 = g.v0(this.this$0.getConfigLoader().g(this.this$0.getUpdateConfigKey())).toString();
            if (obj2.length() > 0) {
                try {
                    m gson2 = this.this$0.getGson();
                    gson2.getClass();
                    updateDTO = (UpdateDTO) gson2.b(obj2, new N8.a(UpdateDTO.class));
                } catch (Throwable th2) {
                    updateDTO = c.n(th2);
                }
                r3 = updateDTO instanceof l ? null : updateDTO;
                if (r3 != null) {
                    this.this$0.lastUpdateConfig = r3;
                    SharedPreferences.Editor edit = this.this$0.getSharedPref().edit();
                    edit.putString(AppUpdateRepository.KEY_LAST_CONFIG, obj2).putLong(AppUpdateRepository.KEY_LAST_LOAD_CONFIG, System.currentTimeMillis());
                    edit.commit();
                }
                Log.d("TuanDv", "needUpdate: " + r3);
            }
            return r3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateRepository$loadUpdateConfig$2(AppUpdateRepository appUpdateRepository, boolean z8, d<? super AppUpdateRepository$loadUpdateConfig$2> dVar) {
        super(2, dVar);
        this.this$0 = appUpdateRepository;
        this.$force = z8;
    }

    @Override // Jb.a
    public final d<q> create(Object obj, d<?> dVar) {
        AppUpdateRepository$loadUpdateConfig$2 appUpdateRepository$loadUpdateConfig$2 = new AppUpdateRepository$loadUpdateConfig$2(this.this$0, this.$force, dVar);
        appUpdateRepository$loadUpdateConfig$2.L$0 = obj;
        return appUpdateRepository$loadUpdateConfig$2;
    }

    @Override // Rb.e
    public final Object invoke(E e2, d<? super UpdateDTO> dVar) {
        return ((AppUpdateRepository$loadUpdateConfig$2) create(e2, dVar)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        I i7;
        UpdateDTO updateDTO;
        I i10;
        I i11;
        a aVar = a.f5345a;
        int i12 = this.label;
        if (i12 == 0) {
            c.c0(obj);
            E e2 = (E) this.L$0;
            if (this.this$0.isLoading()) {
                i10 = this.this$0.loadConfigDeferred;
                if (i10 != null) {
                    i11 = this.this$0.loadConfigDeferred;
                    if (i11 == null) {
                        return null;
                    }
                    this.label = 1;
                    obj = i11.await(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    return (UpdateDTO) obj;
                }
            }
            this.this$0.isLoading = true;
            AppUpdateRepository appUpdateRepository = this.this$0;
            appUpdateRepository.loadConfigDeferred = F.e(e2, P.f14500c, new AnonymousClass1(this.$force, appUpdateRepository, null), 2);
            i7 = this.this$0.loadConfigDeferred;
            if (i7 != null) {
                this.label = 2;
                obj = i7.await(this);
                if (obj == aVar) {
                    return aVar;
                }
                updateDTO = (UpdateDTO) obj;
            } else {
                updateDTO = null;
            }
        } else {
            if (i12 == 1) {
                c.c0(obj);
                return (UpdateDTO) obj;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.c0(obj);
            updateDTO = (UpdateDTO) obj;
        }
        this.this$0.loadConfigDeferred = null;
        this.this$0.isLoading = false;
        return updateDTO;
    }
}
