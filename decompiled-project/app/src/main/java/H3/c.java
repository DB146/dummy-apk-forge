package H3;

import A3.l;
import G3.r;
import G3.s;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.e;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f4870y = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f4871a;

    /* renamed from: b, reason: collision with root package name */
    public final s f4872b;

    /* renamed from: c, reason: collision with root package name */
    public final s f4873c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f4874d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4875e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4876f;

    /* renamed from: u, reason: collision with root package name */
    public final l f4877u;

    /* renamed from: v, reason: collision with root package name */
    public final Class f4878v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f4879w;

    /* renamed from: x, reason: collision with root package name */
    public volatile e f4880x;

    public c(Context context, s sVar, s sVar2, Uri uri, int i7, int i10, l lVar, Class cls) {
        this.f4871a = context.getApplicationContext();
        this.f4872b = sVar;
        this.f4873c = sVar2;
        this.f4874d = uri;
        this.f4875e = i7;
        this.f4876f = i10;
        this.f4877u = lVar;
        this.f4878v = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void a() {
        e eVar = this.f4880x;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        return this.f4878v;
    }

    public final e c() {
        boolean isExternalStorageLegacy;
        r a9;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f4871a;
        l lVar = this.f4877u;
        int i7 = this.f4876f;
        int i10 = this.f4875e;
        if (isExternalStorageLegacy) {
            Uri uri = this.f4874d;
            try {
                Cursor query = context.getContentResolver().query(uri, f4870y, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            query.close();
                            a9 = this.f4872b.a(file, i10, i7, lVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri uri2 = this.f4874d;
            boolean G9 = com.bumptech.glide.c.G(uri2);
            s sVar = this.f4873c;
            if (G9 && uri2.getPathSegments().contains("picker")) {
                a9 = sVar.a(uri2, i10, i7, lVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                a9 = sVar.a(uri2, i10, i7, lVar);
            }
        }
        if (a9 != null) {
            return a9.f4329c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f4879w = true;
        e eVar = this.f4880x;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final A3.a d() {
        return A3.a.f342a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(g gVar, com.bumptech.glide.load.data.d dVar) {
        try {
            e c10 = c();
            if (c10 == null) {
                dVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f4874d));
            } else {
                this.f4880x = c10;
                if (this.f4879w) {
                    cancel();
                } else {
                    c10.f(gVar, dVar);
                }
            }
        } catch (FileNotFoundException e2) {
            dVar.c(e2);
        }
    }
}
