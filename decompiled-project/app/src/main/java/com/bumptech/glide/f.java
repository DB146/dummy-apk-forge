package com.bumptech.glide;

import I2.C0330t;
import Y5.C0656w;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import u.C2052e;

/* loaded from: classes.dex */
public final class f extends ContextWrapper {
    public static final a k;

    /* renamed from: a, reason: collision with root package name */
    public final D3.f f14625a;

    /* renamed from: b, reason: collision with root package name */
    public final F5.i f14626b;

    /* renamed from: c, reason: collision with root package name */
    public final U9.j f14627c;

    /* renamed from: d, reason: collision with root package name */
    public final C0656w f14628d;

    /* renamed from: e, reason: collision with root package name */
    public final List f14629e;

    /* renamed from: f, reason: collision with root package name */
    public final C2052e f14630f;
    public final C3.n g;

    /* renamed from: h, reason: collision with root package name */
    public final R7.a f14631h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14632i;
    public S3.f j;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bumptech.glide.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f14596a = U3.b.f9511a;
        k = obj;
    }

    public f(Context context, D3.f fVar, C0330t c0330t, U9.j jVar, C0656w c0656w, C2052e c2052e, List list, C3.n nVar, R7.a aVar, int i7) {
        super(context.getApplicationContext());
        this.f14625a = fVar;
        this.f14627c = jVar;
        this.f14628d = c0656w;
        this.f14629e = list;
        this.f14630f = c2052e;
        this.g = nVar;
        this.f14631h = aVar;
        this.f14632i = i7;
        this.f14626b = new F5.i(c0330t);
    }

    public final i a() {
        return (i) this.f14626b.get();
    }
}
