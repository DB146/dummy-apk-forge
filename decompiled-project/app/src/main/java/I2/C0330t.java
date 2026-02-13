package I2;

import N6.y0;
import Y5.C0613f0;
import a3.C0723O;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import e8.InterfaceC1100c;
import hb.InterfaceC1269b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kb.C1436a;
import kb.EnumC1437b;
import m4.AbstractC1571h;
import m5.C1599C;
import m5.C1618o;
import m5.C1619p;
import m9.AbstractC1645b;
import m9.C1646c;
import m9.C1649f;
import n5.AbstractC1705a;
import o4.C1791e;
import r4.C1927F;
import r4.InterfaceC1926E;
import r7.C1948d;
import w3.C2209b;
import w3.C2210c;

/* renamed from: I2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330t implements W3.h, InterfaceC1926E, gb.l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5199a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5200b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5201c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5202d;

    public C0330t(int i7) {
        this.f5200b = new ReentrantLock();
        this.f5201c = new long[i7];
        this.f5202d = new boolean[i7];
    }

    public C0330t(int i7, boolean z8) {
        switch (i7) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                this.f5200b = new float[16];
                this.f5201c = new float[16];
                this.f5202d = new C6.l();
                return;
            default:
                this.f5200b = new Object();
                this.f5201c = new ArrayList();
                this.f5202d = new ArrayList();
                this.f5199a = true;
                return;
        }
    }

    public C0330t(B7.d dVar, boolean z8) {
        this.f5202d = dVar;
        this.f5201c = new AtomicReference(null);
        this.f5199a = z8;
        this.f5200b = new AtomicMarkableReference(new x7.e(z8 ? 8192 : 1024), false);
    }

    public C0330t(F5.i iVar, P3.n nVar) {
        this.f5202d = new P3.o(this, 0);
        this.f5201c = iVar;
        this.f5200b = nVar;
    }

    public C0330t(V8.b bVar) {
        int i7 = bVar.f10195b;
        if (i7 < 21 || (i7 & 3) != 1) {
            throw P8.f.a();
        }
        this.f5200b = bVar;
    }

    public C0330t(C0613f0 c0613f0, String str) {
        Objects.requireNonNull(c0613f0);
        this.f5202d = c0613f0;
        com.google.android.gms.common.internal.G.d(str);
        this.f5200b = str;
    }

    public C0330t(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.f5200b = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f5199a = immersiveAudioLevel != 0;
    }

    public C0330t(com.bumptech.glide.b bVar, List list, com.bumptech.glide.c cVar) {
        this.f5200b = bVar;
        this.f5201c = list;
        this.f5202d = cVar;
    }

    public C0330t(FirebaseMessaging firebaseMessaging, InterfaceC1100c interfaceC1100c) {
        this.f5202d = firebaseMessaging;
        this.f5200b = interfaceC1100c;
    }

    public C0330t(gb.l lVar, gb.k kVar) {
        this.f5200b = lVar;
        this.f5201c = kVar;
        this.f5199a = true;
        this.f5202d = new C1436a();
    }

    public C0330t(String str, boolean z8, C0723O c0723o) {
        AbstractC1705a.h((z8 && TextUtils.isEmpty(str)) ? false : true);
        this.f5200b = c0723o;
        this.f5201c = str;
        this.f5199a = z8;
        this.f5202d = new HashMap();
    }

    public C0330t(o5.t tVar, o5.i iVar) {
        this.f5200b = iVar;
        new ArrayDeque();
        new ArrayDeque();
        this.f5199a = true;
        o5.w wVar = o5.w.f22047e;
    }

    public C0330t(C2210c c2210c, C2209b c2209b) {
        this.f5201c = c2210c;
        this.f5200b = c2209b;
        this.f5202d = c2209b.f25757e ? null : new boolean[c2210c.f25767u];
    }

    public static void h(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f4 = fArr2[10];
        float f10 = fArr2[8];
        float sqrt = (float) Math.sqrt((f10 * f10) + (f4 * f4));
        float f11 = fArr2[10] / sqrt;
        fArr[0] = f11;
        float f12 = fArr2[8];
        fArr[2] = f12 / sqrt;
        fArr[8] = (-f12) / sqrt;
        fArr[10] = f11;
    }

    public static byte[] j(C0723O c0723o, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        m5.S s3 = new m5.S(c0723o.e());
        Collections.emptyMap();
        Uri parse = Uri.parse(str);
        AbstractC1705a.o(parse, "The uri must be set.");
        C1619p c1619p = new C1619p(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i7 = 0;
        C1619p c1619p2 = c1619p;
        int i10 = 0;
        while (true) {
            try {
                C1618o c1618o = new C1618o(s3, c1619p2);
                try {
                    try {
                        int i11 = n5.D.f21141a;
                        byte[] bArr2 = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = c1618o.read(bArr2);
                            if (read == -1) {
                                return byteArrayOutputStream.toByteArray();
                            }
                            byteArrayOutputStream.write(bArr2, i7, read);
                        }
                    } catch (C1599C e2) {
                        int i12 = e2.f20535d;
                        String str2 = null;
                        if ((i12 == 307 || i12 == 308) && i10 < 5 && (map2 = e2.f20536e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i7);
                        }
                        if (str2 == null) {
                            throw e2;
                        }
                        i10++;
                        D4.c a9 = c1619p2.a();
                        a9.f3215e = Uri.parse(str2);
                        c1619p2 = a9.d();
                    }
                } finally {
                    n5.D.g(c1618o);
                }
            } catch (Exception e10) {
                Uri uri = s3.f20581c;
                uri.getClass();
                throw new C1927F(c1619p, uri, s3.f20579a.n(), s3.f20580b, e10);
            }
        }
    }

    @Override // gb.l
    public void a() {
        if (!this.f5199a) {
            ((gb.l) this.f5200b).a();
        } else {
            this.f5199a = false;
            ((gb.k) this.f5201c).b(this);
        }
    }

    public void b() {
        C2210c.l((C2210c) this.f5201c, this, false);
    }

    @Override // gb.l
    public void c(InterfaceC1269b interfaceC1269b) {
        C1436a c1436a = (C1436a) this.f5202d;
        c1436a.getClass();
        EnumC1437b.i(c1436a, interfaceC1269b);
    }

    @Override // r4.InterfaceC1926E
    public byte[] d(UUID uuid, r4.w wVar) {
        String str = wVar.f23778b;
        if (this.f5199a || TextUtils.isEmpty(str)) {
            str = (String) this.f5201c;
        }
        if (TextUtils.isEmpty(str)) {
            Map emptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            AbstractC1705a.o(uri, "The uri must be set.");
            throw new C1927F(new C1619p(uri, 1, null, emptyMap, 0L, -1L, null, 0), uri, y0.f7368u, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = AbstractC1571h.f20386e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC1571h.f20384c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.f5202d)) {
            hashMap.putAll((HashMap) this.f5202d);
        }
        return j((C0723O) this.f5200b, str, wVar.f23777a, hashMap);
    }

    @Override // gb.l
    public void e(Object obj) {
        if (this.f5199a) {
            this.f5199a = false;
        }
        ((gb.l) this.f5200b).e(obj);
    }

    @Override // r4.InterfaceC1926E
    public byte[] f(r4.x xVar) {
        return j((C0723O) this.f5200b, xVar.f23780b + "&signedRequest=" + n5.D.o(xVar.f23779a), null, Collections.emptyMap());
    }

    public boolean g(m4.L l10, C1791e c1791e) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(l10.f20096z);
        int i7 = l10.f20075M;
        if (equals && i7 == 16) {
            i7 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(n5.D.p(i7));
        int i10 = l10.f20076N;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        canBeSpatialized = ((Spatializer) this.f5200b).canBeSpatialized((AudioAttributes) c1791e.a().f8929b, channelMask.build());
        return canBeSpatialized;
    }

    @Override // W3.h
    public Object get() {
        if (this.f5199a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection(vc.i.I("Glide registry"));
        this.f5199a = true;
        try {
            return com.bumptech.glide.d.e((com.bumptech.glide.b) this.f5200b, (List) this.f5201c, (com.bumptech.glide.c) this.f5202d);
        } finally {
            this.f5199a = false;
            Trace.endSection();
        }
    }

    public int i(int i7, int i10, int i11) {
        boolean z8 = this.f5199a;
        V8.b bVar = (V8.b) this.f5200b;
        return z8 ? bVar.b(i10, i7) : bVar.b(i7, i10) ? (i11 << 1) | 1 : i11 << 1;
    }

    public File k() {
        File file;
        synchronized (((C2210c) this.f5201c)) {
            try {
                C2209b c2209b = (C2209b) this.f5200b;
                if (c2209b.f25758f != this) {
                    throw new IllegalStateException();
                }
                if (!c2209b.f25757e) {
                    ((boolean[]) this.f5202d)[0] = true;
                }
                file = c2209b.f25756d[0];
                ((C2210c) this.f5201c).f25761a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public synchronized void l() {
        try {
            if (this.f5199a) {
                return;
            }
            Boolean p10 = p();
            this.f5201c = p10;
            if (p10 == null) {
                C1948d c1948d = new C1948d(3);
                p7.j jVar = (p7.j) ((InterfaceC1100c) this.f5200b);
                jVar.a(jVar.f23142c, c1948d);
            }
            this.f5199a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean m() {
        Boolean bool;
        try {
            l();
            bool = (Boolean) this.f5201c;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f5202d).f15864a.k();
    }

    public boolean n(int[] tableIds) {
        kotlin.jvm.internal.l.e(tableIds, "tableIds");
        ReentrantLock reentrantLock = (ReentrantLock) this.f5200b;
        reentrantLock.lock();
        try {
            boolean z8 = false;
            for (int i7 : tableIds) {
                long[] jArr = (long[]) this.f5201c;
                long j = jArr[i7];
                jArr[i7] = 1 + j;
                if (j == 0) {
                    z8 = true;
                    this.f5199a = true;
                }
            }
            return z8;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean o(int[] tableIds) {
        kotlin.jvm.internal.l.e(tableIds, "tableIds");
        ReentrantLock reentrantLock = (ReentrantLock) this.f5200b;
        reentrantLock.lock();
        try {
            boolean z8 = false;
            for (int i7 : tableIds) {
                long[] jArr = (long[]) this.f5201c;
                long j = jArr[i7];
                jArr[i7] = j - 1;
                if (j == 1) {
                    z8 = true;
                    this.f5199a = true;
                }
            }
            return z8;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // gb.l
    public void onError(Throwable th) {
        ((gb.l) this.f5200b).onError(th);
    }

    public Boolean p() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Y6.i iVar = ((FirebaseMessaging) this.f5202d).f15864a;
        iVar.b();
        Context context = iVar.f12041a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public C1646c q() {
        C1646c c1646c = (C1646c) this.f5202d;
        if (c1646c != null) {
            return c1646c;
        }
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 = i(i11, 8, i10);
        }
        int i12 = i(8, 7, i(8, 8, i(7, 8, i10)));
        for (int i13 = 5; i13 >= 0; i13--) {
            i12 = i(8, i13, i12);
        }
        int i14 = ((V8.b) this.f5200b).f10195b;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i7 = i(8, i16, i7);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i7 = i(i17, 8, i7);
        }
        C1646c a9 = C1646c.a(i12, i7);
        if (a9 == null) {
            a9 = C1646c.a(i12 ^ 21522, i7 ^ 21522);
        }
        this.f5202d = a9;
        if (a9 != null) {
            return a9;
        }
        throw P8.f.a();
    }

    public C1649f r() {
        C1649f c1649f = (C1649f) this.f5201c;
        if (c1649f != null) {
            return c1649f;
        }
        int i7 = ((V8.b) this.f5200b).f10195b;
        int i10 = (i7 - 17) / 4;
        if (i10 <= 6) {
            return C1649f.c(i10);
        }
        int i11 = i7 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i7 - 9; i15 >= i11; i15--) {
                i13 = i(i15, i14, i13);
            }
        }
        C1649f b2 = C1649f.b(i13);
        if (b2 != null && (b2.f20808a * 4) + 17 == i7) {
            this.f5201c = b2;
            return b2;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = i7 - 9; i17 >= i11; i17--) {
                i12 = i(i16, i17, i12);
            }
        }
        C1649f b10 = C1649f.b(i12);
        if (b10 == null || (b10.f20808a * 4) + 17 != i7) {
            throw P8.f.a();
        }
        this.f5201c = b10;
        return b10;
    }

    public void s() {
        if (((C1646c) this.f5202d) == null) {
            return;
        }
        int i7 = P.c.c(8)[((C1646c) this.f5202d).f20792b];
        V8.b bVar = (V8.b) this.f5200b;
        int i10 = bVar.f10195b;
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (AbstractC1645b.a(i7, i11, i12)) {
                    bVar.a(i12, i11);
                }
            }
        }
    }

    public String t() {
        if (!this.f5199a) {
            this.f5199a = true;
            this.f5201c = ((C0613f0) this.f5202d).N().getString((String) this.f5200b, null);
        }
        return (String) this.f5201c;
    }

    public void u(String str) {
        SharedPreferences.Editor edit = ((C0613f0) this.f5202d).N().edit();
        edit.putString((String) this.f5200b, str);
        edit.apply();
        this.f5201c = str;
    }
}
