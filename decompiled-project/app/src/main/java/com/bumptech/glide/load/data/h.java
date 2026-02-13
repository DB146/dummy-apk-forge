package com.bumptech.glide.load.data;

import J3.x;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final K3.a f14678c = new K3.a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14679a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14680b;

    public h() {
        this.f14679a = 0;
        this.f14680b = new HashMap();
    }

    public h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f14679a = 1;
        this.f14680b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public h(InputStream inputStream, D3.f fVar) {
        this.f14679a = 3;
        x xVar = new x(inputStream, fVar);
        this.f14680b = xVar;
        xVar.mark(5242880);
    }

    public h(Object obj) {
        this.f14679a = 2;
        this.f14680b = obj;
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // com.bumptech.glide.load.data.g
    public void a() {
        switch (this.f14679a) {
            case 1:
            case 2:
                return;
            default:
                ((x) this.f14680b).n();
                return;
        }
    }

    public ParcelFileDescriptor d() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f14680b).rewind();
    }

    @Override // com.bumptech.glide.load.data.g
    public Object l() {
        switch (this.f14679a) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f14680b).rewind();
            case 2:
                return this.f14680b;
            default:
                x xVar = (x) this.f14680b;
                xVar.reset();
                return xVar;
        }
    }
}
