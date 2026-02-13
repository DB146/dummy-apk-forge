package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14670a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14671b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparable f14672c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14673d;

    public /* synthetic */ b(int i7, Comparable comparable, Object obj) {
        this.f14670a = i7;
        this.f14673d = obj;
        this.f14672c = comparable;
    }

    private final void c() {
    }

    private final void e() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void a() {
        switch (this.f14670a) {
            case 0:
                Object obj = this.f14671b;
                if (obj != null) {
                    try {
                        g(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            default:
                Object obj2 = this.f14671b;
                if (obj2 != null) {
                    try {
                        g(obj2);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i7 = this.f14670a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final A3.a d() {
        switch (this.f14670a) {
            case 0:
                return A3.a.f342a;
            default:
                return A3.a.f342a;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.g gVar, d dVar) {
        switch (this.f14670a) {
            case 0:
                try {
                    Object h10 = h((AssetManager) this.f14673d, (String) this.f14672c);
                    this.f14671b = h10;
                    dVar.e(h10);
                    return;
                } catch (IOException e2) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
                    }
                    dVar.c(e2);
                    return;
                }
            default:
                try {
                    Object i7 = i((Uri) this.f14672c, (ContentResolver) this.f14673d);
                    this.f14671b = i7;
                    dVar.e(i7);
                    return;
                } catch (FileNotFoundException e10) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e10);
                    }
                    dVar.c(e10);
                    return;
                }
        }
    }

    public abstract void g(Object obj);

    public abstract Object h(AssetManager assetManager, String str);

    public abstract Object i(Uri uri, ContentResolver contentResolver);
}
