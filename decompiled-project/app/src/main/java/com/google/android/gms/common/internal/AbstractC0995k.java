package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC0966g;
import com.google.android.gms.common.api.internal.InterfaceC0976q;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0995k extends AbstractC0990f implements com.google.android.gms.common.api.g {
    private static volatile Executor zaa;
    private final C0992h zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0995k(Context context, Looper looper, int i7, C0992h c0992h, InterfaceC0966g interfaceC0966g, InterfaceC0976q interfaceC0976q) {
        super(context, looper, r3, r4, i7, new r(interfaceC0966g), new r(interfaceC0976q), c0992h.f15065e);
        S a9 = AbstractC0996l.a(context);
        F5.e eVar = F5.e.f4098d;
        G.g(interfaceC0966g);
        G.g(interfaceC0976q);
        this.zab = c0992h;
        this.zad = null;
        Set<Scope> set = c0992h.f15062b;
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.zac = validateScopes;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public Executor getBindServiceExecutor() {
        return null;
    }

    public final C0992h getClientSettings() {
        return this.zab;
    }

    public F5.d[] getRequiredFeatures() {
        return new F5.d[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.g
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
