package G3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: G3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282d implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4298a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4299b;

    public /* synthetic */ C0282d(Object obj, int i7) {
        this.f4298a = i7;
        this.f4299b = obj;
    }

    private final void c() {
    }

    private final void e() {
    }

    private final void g() {
    }

    private final void h() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void a() {
        int i7 = this.f4298a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        switch (this.f4298a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f4299b.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i7 = this.f4298a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final A3.a d() {
        switch (this.f4298a) {
            case 0:
                return A3.a.f342a;
            default:
                return A3.a.f342a;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        switch (this.f4298a) {
            case 0:
                try {
                    dVar.e(W3.b.a((File) this.f4299b));
                    return;
                } catch (IOException e2) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                    }
                    dVar.c(e2);
                    return;
                }
            default:
                dVar.e(this.f4299b);
                return;
        }
    }
}
