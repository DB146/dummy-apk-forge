package G3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n implements com.bumptech.glide.load.data.e {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f4319d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4320a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4321b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4322c;

    public /* synthetic */ n(int i7, Object obj, Object obj2) {
        this.f4320a = i7;
        this.f4321b = obj;
        this.f4322c = obj2;
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
        int i7 = this.f4320a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        switch (this.f4320a) {
            case 0:
                return File.class;
            default:
                return ((C) this.f4322c).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i7 = this.f4320a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final A3.a d() {
        switch (this.f4320a) {
            case 0:
                return A3.a.f342a;
            default:
                return A3.a.f342a;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        Object wrap;
        switch (this.f4320a) {
            case 0:
                Cursor query = ((Context) this.f4321b).getContentResolver().query((Uri) this.f4322c, f4319d, null, null, null);
                if (query != null) {
                    try {
                        r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                    } finally {
                        query.close();
                    }
                }
                if (!TextUtils.isEmpty(r0)) {
                    dVar.e(new File(r0));
                    return;
                }
                dVar.c(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f4322c)));
                return;
            default:
                C c10 = (C) this.f4322c;
                byte[] bArr = (byte[]) this.f4321b;
                switch (c10.f4286a) {
                    case 1:
                        wrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        wrap = new ByteArrayInputStream(bArr);
                        break;
                }
                dVar.e(wrap);
                return;
        }
    }
}
