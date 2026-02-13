package E6;

import G3.C0280b;
import G3.InterfaceC0285g;
import G3.o;
import G3.s;
import G3.t;
import G3.y;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.tv.TvContract;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import b3.AbstractC0829d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.l;
import tss.r.core.ads.ui.leanback.ShopeeProductDetailsActivity;

/* loaded from: classes.dex */
public final class e implements t, InterfaceC0285g, Lc.f, W3.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3733a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3734b;

    public /* synthetic */ e(Context context, int i7) {
        this.f3733a = i7;
        this.f3734b = context;
    }

    @Override // Lc.f
    public void a(Jc.a ad) {
        l.e(ad, "ad");
        int i7 = ShopeeProductDetailsActivity.f24555R;
        Y6.b.x(this.f3734b, ad);
    }

    @Override // G3.InterfaceC0285g
    public Class b() {
        return Drawable.class;
    }

    @Override // G3.InterfaceC0285g
    public Object c(int i7, Resources.Theme theme, Resources resources) {
        Context context = this.f3734b;
        return android.support.v4.media.session.b.o(context, context, i7, theme);
    }

    @Override // G3.InterfaceC0285g
    public /* bridge */ /* synthetic */ void d(Object obj) {
    }

    @Override // Lc.f
    public void e(Jc.a ad) {
        l.e(ad, "ad");
        int i7 = ShopeeProductDetailsActivity.f24555R;
        Y6.b.x(this.f3734b, ad);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(long j, b3.e eVar) {
        InputStream inputStream;
        InputStream openInputStream;
        Bitmap decodeStream;
        boolean z8 = false;
        if (!eVar.f13823d) {
            return false;
        }
        Context context = this.f3734b;
        if (!eVar.f13824e && eVar.f13821b == null) {
            try {
                eVar.f13821b = BitmapFactory.decodeStream(context.getContentResolver().openInputStream(TvContract.buildChannelLogoUri(eVar.b())));
            } catch (SQLiteException | FileNotFoundException e2) {
                Log.e("PreviewChannel", "Logo for preview channel (ID:" + eVar.b() + ") not found.", e2);
            }
            eVar.f13824e = true;
        }
        Bitmap bitmap = eVar.f13821b;
        if (bitmap == null) {
            Uri uri = eVar.f13822c;
            String scheme = uri.normalizeScheme().getScheme();
            InputStream inputStream2 = null;
            try {
                try {
                    if (!"android.resource".equals(scheme) && !"file".equals(scheme) && !"content".equals(scheme)) {
                        decodeStream = g(uri);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        bitmap = decodeStream;
                    }
                    decodeStream = BitmapFactory.decodeStream(openInputStream);
                    inputStream2 = openInputStream;
                    if (inputStream2 != null) {
                    }
                    bitmap = decodeStream;
                } catch (IOException e10) {
                    inputStream = openInputStream;
                    e = e10;
                    try {
                        Log.e("PreviewChannelHelper", "Failed to get logo from the URI: " + uri, e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        bitmap = null;
                        OutputStream openOutputStream = this.f3734b.getContentResolver().openOutputStream(TvContract.buildChannelLogoUri(j));
                        try {
                            z8 = bitmap.compress(Bitmap.CompressFormat.PNG, 100, openOutputStream);
                            openOutputStream.flush();
                            openOutputStream.close();
                            return z8;
                        } finally {
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = openInputStream;
                    if (inputStream2 != null) {
                    }
                    throw th;
                }
                openInputStream = this.f3734b.getContentResolver().openInputStream(uri);
            } catch (IOException e11) {
                e = e11;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        try {
            OutputStream openOutputStream2 = this.f3734b.getContentResolver().openOutputStream(TvContract.buildChannelLogoUri(j));
            z8 = bitmap.compress(Bitmap.CompressFormat.PNG, 100, openOutputStream2);
            openOutputStream2.flush();
            openOutputStream2.close();
        } catch (SQLiteException | IOException | NullPointerException e12) {
            Log.i("PreviewChannelHelper", "Failed to add logo to the published channel (ID= " + j + ")", e12);
        }
        return z8;
    }

    public Bitmap g(Uri uri) {
        URLConnection uRLConnection;
        InputStream inputStream = null;
        try {
            uRLConnection = new URL(uri.toString()).openConnection();
        } catch (Throwable th) {
            th = th;
            uRLConnection = null;
        }
        try {
            uRLConnection.setConnectTimeout(3000);
            uRLConnection.setReadTimeout(10000);
            inputStream = uRLConnection.getInputStream();
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).disconnect();
            }
            return decodeStream;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            if (!(uRLConnection instanceof HttpURLConnection)) {
                throw th;
            }
            ((HttpURLConnection) uRLConnection).disconnect();
            throw th;
        }
    }

    @Override // W3.h
    public Object get() {
        return (ConnectivityManager) this.f3734b.getSystemService("connectivity");
    }

    public long h(b3.e eVar) {
        Context context = this.f3734b;
        if (Build.VERSION.SDK_INT < 26) {
            return -1L;
        }
        try {
            Uri insert = context.getContentResolver().insert(b3.h.f13826a, new ContentValues(eVar.f13820a));
            if (insert == null || insert.equals(Uri.EMPTY)) {
                throw new NullPointerException("Channel insertion failed");
            }
            long parseId = ContentUris.parseId(insert);
            if (f(parseId, eVar)) {
                return parseId;
            }
            context.getContentResolver().delete(TvContract.buildChannelUri(parseId), null, null);
            throw new IOException("Failed to add logo, so channel (ID=" + parseId + ") was not created");
        } catch (SecurityException e2) {
            Log.e("PreviewChannelHelper", "Your app's ability to insert data into the TvProvider may have been revoked.", e2);
            return -1L;
        }
    }

    public void i(b3.g gVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            ContentUris.parseId(this.f3734b.getContentResolver().insert(b3.i.f13827a, gVar.e()));
        } catch (SecurityException e2) {
            Log.e("PreviewChannelHelper", "Your app's ability to insert data into the TvProvider may have been revoked.", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(long j, b3.e eVar) {
        b3.e a9;
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f3734b;
        if (i7 < 26) {
            a9 = null;
        } else {
            Cursor query = context.getContentResolver().query(TvContract.buildChannelUri(j), AbstractC0829d.f13818a, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        a9 = b3.e.a(query);
                        if (query != null) {
                            query.close();
                        }
                    }
                } catch (Throwable th) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            a9 = null;
            if (query != null) {
            }
        }
        if (a9 != null) {
            Iterator<String> it = eVar.f13820a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (!Objects.deepEquals(eVar.f13820a.get(next), a9.f13820a.get(next))) {
                    context.getContentResolver().update(TvContract.buildChannelUri(j), new ContentValues(eVar.f13820a), null, null);
                    break;
                }
            }
        }
        if (!eVar.f13823d || f(j, eVar)) {
            return;
        }
        throw new IOException("Fail to update channel (ID=" + j + ") logo.");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(long j, b3.g gVar) {
        b3.g d10;
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f3734b;
        if (i7 < 26) {
            d10 = null;
        } else {
            Cursor query = context.getContentResolver().query(ContentUris.withAppendedId(b3.i.f13827a, j), null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        d10 = b3.g.d(query);
                        if (query != null) {
                            query.close();
                        }
                    }
                } catch (Throwable th) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            d10 = null;
            if (query != null) {
            }
        }
        if (d10 != null) {
            for (String str : gVar.f13817a.keySet()) {
                if (!Objects.deepEquals(gVar.f13817a.get(str), d10.f13817a.get(str))) {
                    context.getContentResolver().update(ContentUris.withAppendedId(b3.i.f13827a, j), gVar.e(), null, null);
                    return;
                }
            }
        }
    }

    @Override // G3.t
    public s m(y yVar) {
        switch (this.f3733a) {
            case 1:
                return new C0280b(this.f3734b, this);
            case 2:
                return new C0280b(this.f3734b, yVar.a(Integer.class, InputStream.class));
            default:
                return new o(this.f3734b, 1);
        }
    }
}
