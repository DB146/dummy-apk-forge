package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AssetManager assetManager, String str, int i7) {
        super(0, str, assetManager);
        this.f14685e = i7;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        switch (this.f14685e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void g(Object obj) {
        switch (this.f14685e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object h(AssetManager assetManager, String str) {
        switch (this.f14685e) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
