package B3;

import G3.C;
import P1.g;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.i;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2037a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f2038b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2039c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2040d;

    public /* synthetic */ b(int i7, Comparable comparable, Object obj) {
        this.f2037a = i7;
        this.f2038b = comparable;
        this.f2039c = obj;
    }

    public static b c(Context context, Uri uri, c cVar) {
        return new b(0, uri, new d(com.bumptech.glide.b.a(context).f14601c.a().e(), cVar, com.bumptech.glide.b.a(context).f14602d, context.getContentResolver()));
    }

    private final void e() {
    }

    private final void g() {
    }

    private final void h() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void a() {
        switch (this.f2037a) {
            case 0:
                InputStream inputStream = (InputStream) this.f2040d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            case 1:
                try {
                    ((ByteArrayInputStream) this.f2040d).close();
                    return;
                } catch (IOException unused2) {
                    return;
                }
            default:
                Object obj = this.f2040d;
                if (obj != null) {
                    try {
                        switch (((C) this.f2039c).f4286a) {
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        return;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        switch (this.f2037a) {
            case 0:
                return InputStream.class;
            case 1:
                ((C) this.f2039c).getClass();
                return InputStream.class;
            default:
                return ((C) this.f2039c).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i7 = this.f2037a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final A3.a d() {
        switch (this.f2037a) {
            case 0:
                return A3.a.f342a;
            case 1:
                return A3.a.f342a;
            default:
                return A3.a.f342a;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        Object open;
        switch (this.f2037a) {
            case 0:
                try {
                    InputStream i7 = i();
                    this.f2040d = i7;
                    dVar.e(i7);
                    return;
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
                    }
                    dVar.c(e2);
                    return;
                }
            case 1:
                try {
                    ByteArrayInputStream a9 = C.a((String) this.f2038b);
                    this.f2040d = a9;
                    dVar.e(a9);
                    return;
                } catch (IllegalArgumentException e10) {
                    dVar.c(e10);
                    return;
                }
            default:
                try {
                    C c10 = (C) this.f2039c;
                    File file = (File) this.f2038b;
                    switch (c10.f4286a) {
                        case g.BYTES_FIELD_NUMBER /* 8 */:
                            open = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            open = new FileInputStream(file);
                            break;
                    }
                    this.f2040d = open;
                    dVar.e(open);
                    return;
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e11);
                    }
                    dVar.c(e11);
                    return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004c, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0026: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:68:0x0026 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream i() {
        Cursor cursor;
        ?? r62;
        InputStream openInputStream;
        int i7;
        Uri uri = (Uri) this.f2038b;
        d dVar = (d) this.f2039c;
        ?? r52 = 0;
        InputStream inputStream = null;
        try {
            try {
                cursor = dVar.f2041a.a(uri);
            } catch (Throwable th) {
                th = th;
                r52 = r62;
                if (r52 != 0) {
                    r52.close();
                }
                throw th;
            }
        } catch (SecurityException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r52 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            try {
            } catch (SecurityException e10) {
                e = e10;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                }
            }
            if (cursor.moveToFirst()) {
                String str = cursor.getString(0);
                cursor.close();
                boolean isEmpty = TextUtils.isEmpty(str);
                ContentResolver contentResolver = dVar.f2043c;
                if (!isEmpty) {
                    File file = new File(str);
                    if (file.exists() && 0 < file.length()) {
                        Uri fromFile = Uri.fromFile(file);
                        try {
                            openInputStream = contentResolver.openInputStream(fromFile);
                            if (openInputStream != null) {
                                try {
                                    try {
                                        inputStream = contentResolver.openInputStream(uri);
                                        i7 = E6.b.r(dVar.f2044d, inputStream, dVar.f2042b);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        if (0 != 0) {
                                            try {
                                                r52.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        throw th3;
                                    }
                                } catch (IOException | NullPointerException e11) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e11);
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                }
                                return i7 != -1 ? new i(openInputStream, i7) : openInputStream;
                            }
                            i7 = -1;
                            if (i7 != -1) {
                            }
                        } catch (NullPointerException e12) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e12));
                        }
                    }
                }
                openInputStream = null;
                if (openInputStream != null) {
                }
                i7 = -1;
                if (i7 != -1) {
                }
            }
        }
    }
}
