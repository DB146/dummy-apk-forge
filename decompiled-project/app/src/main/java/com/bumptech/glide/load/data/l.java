package com.bumptech.glide.load.data;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final D3.f f14691a;

    public l(D3.f fVar) {
        this.f14691a = fVar;
    }

    @Override // com.bumptech.glide.load.data.f
    public final g a(Object obj) {
        return new h((InputStream) obj, this.f14691a);
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class b() {
        return InputStream.class;
    }
}
