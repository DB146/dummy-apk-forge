package Y5;

import G3.C0283e;
import P4.C0463k;
import android.app.BroadcastOptions;
import android.app.Service;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzca;
import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgx;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhd;
import com.google.android.gms.internal.measurement.zzhe;
import com.google.android.gms.internal.measurement.zzhh;
import com.google.android.gms.internal.measurement.zzhk;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzka;
import com.google.android.gms.internal.measurement.zzmq;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzqu;
import i2.C1332t;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import u.C2052e;

/* loaded from: classes.dex */
public final class I1 implements InterfaceC0661y0 {

    /* renamed from: Y, reason: collision with root package name */
    public static volatile I1 f11379Y;

    /* renamed from: B, reason: collision with root package name */
    public boolean f11381B;

    /* renamed from: C, reason: collision with root package name */
    public long f11382C;

    /* renamed from: D, reason: collision with root package name */
    public ArrayList f11383D;

    /* renamed from: F, reason: collision with root package name */
    public int f11385F;

    /* renamed from: G, reason: collision with root package name */
    public int f11386G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f11387H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f11388I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f11389J;

    /* renamed from: K, reason: collision with root package name */
    public FileLock f11390K;
    public FileChannel L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f11391M;

    /* renamed from: N, reason: collision with root package name */
    public ArrayList f11392N;

    /* renamed from: P, reason: collision with root package name */
    public final HashMap f11394P;

    /* renamed from: Q, reason: collision with root package name */
    public final HashMap f11395Q;

    /* renamed from: R, reason: collision with root package name */
    public final HashMap f11396R;

    /* renamed from: T, reason: collision with root package name */
    public Z0 f11398T;

    /* renamed from: U, reason: collision with root package name */
    public String f11399U;

    /* renamed from: V, reason: collision with root package name */
    public s1 f11400V;

    /* renamed from: W, reason: collision with root package name */
    public long f11401W;

    /* renamed from: a, reason: collision with root package name */
    public final C0628k0 f11403a;

    /* renamed from: b, reason: collision with root package name */
    public final C0598a0 f11404b;

    /* renamed from: c, reason: collision with root package name */
    public C0633m f11405c;

    /* renamed from: d, reason: collision with root package name */
    public C0604c0 f11406d;

    /* renamed from: e, reason: collision with root package name */
    public y1 f11407e;

    /* renamed from: f, reason: collision with root package name */
    public C0603c f11408f;

    /* renamed from: u, reason: collision with root package name */
    public final C0598a0 f11409u;

    /* renamed from: v, reason: collision with root package name */
    public C0598a0 f11410v;

    /* renamed from: w, reason: collision with root package name */
    public C0638n1 f11411w;

    /* renamed from: y, reason: collision with root package name */
    public C0619h0 f11413y;

    /* renamed from: z, reason: collision with root package name */
    public final C0646q0 f11414z;

    /* renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f11380A = new AtomicBoolean(false);

    /* renamed from: E, reason: collision with root package name */
    public final LinkedList f11384E = new LinkedList();

    /* renamed from: S, reason: collision with root package name */
    public final HashMap f11397S = new HashMap();

    /* renamed from: X, reason: collision with root package name */
    public final R7.b f11402X = new R7.b(this);

    /* renamed from: O, reason: collision with root package name */
    public long f11393O = -1;

    /* renamed from: x, reason: collision with root package name */
    public final F1 f11412x = new z1(this);

    /* JADX WARN: Type inference failed for: r0v7, types: [Y5.F1, Y5.z1] */
    public I1(C0283e c0283e) {
        this.f11414z = C0646q0.r(c0283e.f4301b, null, null);
        C0598a0 c0598a0 = new C0598a0(this, 2);
        c0598a0.L();
        this.f11409u = c0598a0;
        C0598a0 c0598a02 = new C0598a0(this, 0);
        c0598a02.L();
        this.f11404b = c0598a02;
        C0628k0 c0628k0 = new C0628k0(this);
        c0628k0.L();
        this.f11403a = c0628k0;
        this.f11394P = new HashMap();
        this.f11395Q = new HashMap();
        this.f11396R = new HashMap();
        c().S(new B0.C(this, c0283e));
    }

    public static I1 B(Service service) {
        com.google.android.gms.common.internal.G.g(service);
        com.google.android.gms.common.internal.G.g(service.getApplicationContext());
        if (f11379Y == null) {
            synchronized (I1.class) {
                try {
                    if (f11379Y == null) {
                        f11379Y = new I1(new C0283e(service));
                    }
                } finally {
                }
            }
        }
        return f11379Y;
    }

    public static final void C(zzhr zzhrVar, String str) {
        List zza = zzhrVar.zza();
        for (int i7 = 0; i7 < zza.size(); i7++) {
            if (str.equals(((zzhw) zza.get(i7)).zzb())) {
                zzhrVar.zzj(i7);
                return;
            }
        }
    }

    public static String K(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final boolean Q(O1 o12) {
        return !TextUtils.isEmpty(o12.f11507b);
    }

    public static final void R(zzic zzicVar) {
        zzicVar.zzv(Long.MAX_VALUE);
        zzicVar.zzx(Long.MIN_VALUE);
        for (int i7 = 0; i7 < zzicVar.zzc(); i7++) {
            zzhs zzd = zzicVar.zzd(i7);
            if (zzd.zzf() < zzicVar.zzu()) {
                zzicVar.zzv(zzd.zzf());
            }
            if (zzd.zzf() > zzicVar.zzw()) {
                zzicVar.zzx(zzd.zzf());
            }
        }
    }

    public static final void S(D1 d12) {
        if (d12 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!d12.f11243c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(d12.getClass())));
        }
    }

    public static final Boolean T(O1 o12) {
        Boolean bool = o12.f11491D;
        String str = o12.f11503Q;
        if (!TextUtils.isEmpty(str)) {
            int ordinal = ((EnumC0663z0) R7.b.z(str).f8929b).ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static final void c0(zzhr zzhrVar, int i7, String str) {
        List zza = zzhrVar.zza();
        for (int i10 = 0; i10 < zza.size(); i10++) {
            if ("_err".equals(((zzhw) zza.get(i10)).zzb())) {
                return;
            }
        }
        zzhv zzn = zzhw.zzn();
        zzn.zzb("_err");
        zzn.zzf(i7);
        zzhw zzhwVar = (zzhw) zzn.zzbc();
        zzhv zzn2 = zzhw.zzn();
        zzn2.zzb("_ev");
        zzn2.zzd(str);
        zzhw zzhwVar2 = (zzhw) zzn2.zzbc();
        zzhrVar.zzf(zzhwVar);
        zzhrVar.zzf(zzhwVar2);
    }

    public final void A() {
        c().J();
        k0();
        if (this.f11381B) {
            return;
        }
        this.f11381B = true;
        c().J();
        FileLock fileLock = this.f11390K;
        C0646q0 c0646q0 = this.f11414z;
        if (fileLock == null || !fileLock.isValid()) {
            ((C0646q0) this.f11405c.f3094a).getClass();
            File filesDir = c0646q0.f11907a.getFilesDir();
            zzbv.zza();
            int i7 = zzca.zzb;
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
                this.L = channel;
                FileLock tryLock = channel.tryLock();
                this.f11390K = tryLock;
                if (tryLock == null) {
                    b().f11577f.a("Storage concurrent data access panic");
                    return;
                }
                b().f11573B.a("Storage concurrent access okay");
            } catch (FileNotFoundException e2) {
                b().f11577f.b(e2, "Failed to acquire storage lock");
                return;
            } catch (IOException e10) {
                b().f11577f.b(e10, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e11) {
                b().f11580w.b(e11, "Storage lock already acquired");
                return;
            }
        } else {
            b().f11573B.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.L;
        c().J();
        int i10 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            b().f11577f.a("Bad channel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i10 = allocate.getInt();
                } else if (read != -1) {
                    b().f11580w.b(Integer.valueOf(read), "Unexpected data length. Bytes read");
                }
            } catch (IOException e12) {
                b().f11577f.b(e12, "Failed to read from channel");
            }
        }
        N q10 = c0646q0.q();
        q10.K();
        int i11 = q10.f11469e;
        c().J();
        if (i10 > i11) {
            W b2 = b();
            b2.f11577f.c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10), Integer.valueOf(i11));
            return;
        }
        if (i10 < i11) {
            FileChannel fileChannel2 = this.L;
            c().J();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                b().f11577f.a("Bad channel to read from");
            } else {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(i11);
                allocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(allocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        b().f11577f.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    W b10 = b();
                    b10.f11573B.c("Storage version upgraded. Previous, current version", Integer.valueOf(i10), Integer.valueOf(i11));
                    return;
                } catch (IOException e13) {
                    b().f11577f.b(e13, "Failed to write to channel");
                }
            }
            W b11 = b();
            b11.f11577f.c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public final int D(String str, R7.a aVar) {
        EnumC0663z0 N10;
        C0628k0 c0628k0 = this.f11403a;
        zzgf e02 = c0628k0.e0(str);
        B0 b02 = B0.AD_PERSONALIZATION;
        if (e02 == null) {
            aVar.M(b02, EnumC0618h.FAILSAFE);
            return 1;
        }
        C0633m c0633m = this.f11405c;
        S(c0633m);
        C0601b0 N02 = c0633m.N0(str);
        if (N02 != null) {
            if (((EnumC0663z0) R7.b.z(N02.s()).f8929b) == EnumC0663z0.POLICY && (N10 = c0628k0.N(str, b02)) != EnumC0663z0.UNINITIALIZED) {
                aVar.M(b02, EnumC0618h.REMOTE_ENFORCED_DEFAULT);
                return N10 == EnumC0663z0.GRANTED ? 0 : 1;
            }
        }
        aVar.M(b02, EnumC0618h.REMOTE_DEFAULT);
        return c0628k0.d0(str, b02) ? 0 : 1;
    }

    public final HashMap E(zzhs zzhsVar) {
        Serializable Y2;
        HashMap hashMap = new HashMap();
        i0();
        HashMap hashMap2 = new HashMap();
        for (zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().startsWith("gad_") && (Y2 = C0598a0.Y(zzhwVar)) != null) {
                hashMap2.put(zzhwVar.zzb(), Y2);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public final void F() {
        c().J();
        if (this.f11384E.isEmpty()) {
            return;
        }
        if (this.f11400V == null) {
            this.f11400V = new s1(this, this.f11414z);
        }
        if (this.f11400V.f11845c != 0) {
            return;
        }
        ((M5.b) e()).getClass();
        long max = Math.max(0L, ((Integer) F.f11257B0.a(null)).intValue() - (SystemClock.elapsedRealtime() - this.f11401W));
        b().f11573B.b(Long.valueOf(max), "Scheduling notify next app runnable, delay in ms");
        if (this.f11400V == null) {
            this.f11400V = new s1(this, this.f11414z);
        }
        this.f11400V.b(max);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x056d A[Catch: all -> 0x0114, TryCatch #3 {all -> 0x0114, blocks: (B:3:0x0011, B:5:0x002a, B:7:0x0033, B:8:0x004a, B:11:0x006a, B:14:0x0094, B:16:0x00d1, B:19:0x00ea, B:21:0x00f4, B:24:0x06a9, B:25:0x012d, B:28:0x013f, B:30:0x0145, B:32:0x0182, B:34:0x0194, B:37:0x01b4, B:39:0x01ba, B:41:0x01ca, B:43:0x01d8, B:45:0x01e8, B:47:0x01f3, B:52:0x01f6, B:54:0x020c, B:61:0x0405, B:62:0x0411, B:65:0x041b, B:69:0x0440, B:70:0x042e, B:77:0x0447, B:79:0x0453, B:81:0x045f, B:85:0x04a2, B:86:0x047a, B:89:0x048c, B:91:0x0492, B:93:0x049c, B:96:0x04b8, B:98:0x04c4, B:101:0x04d7, B:103:0x04e8, B:105:0x04f4, B:107:0x0567, B:109:0x056d, B:110:0x0579, B:112:0x057f, B:114:0x058f, B:116:0x0599, B:117:0x05ac, B:119:0x05b2, B:120:0x05cd, B:122:0x05d3, B:124:0x05f1, B:126:0x0600, B:128:0x062d, B:129:0x0609, B:131:0x0617, B:133:0x0636, B:134:0x0650, B:136:0x0656, B:139:0x0669, B:144:0x0676, B:145:0x067a, B:147:0x0680, B:149:0x0690, B:156:0x0515, B:158:0x0525, B:161:0x0538, B:163:0x0549, B:165:0x0555, B:168:0x023b, B:171:0x0245, B:173:0x0253, B:175:0x02a0, B:176:0x0272, B:178:0x0284, B:186:0x02b0, B:188:0x02da, B:189:0x0302, B:191:0x0337, B:192:0x033e, B:195:0x034a, B:197:0x037f, B:198:0x039c, B:200:0x03a2, B:202:0x03b0, B:204:0x03c5, B:205:0x03b9, B:211:0x03cb, B:214:0x03d2, B:215:0x03ea, B:217:0x014b, B:219:0x0156, B:221:0x0164, B:223:0x016a, B:226:0x0175, B:231:0x06c0, B:233:0x06ce, B:235:0x06d7, B:237:0x070c, B:238:0x06df, B:240:0x06e9, B:242:0x06ef, B:244:0x06fb, B:246:0x0705, B:249:0x070e, B:250:0x071a, B:253:0x0722, B:256:0x0734, B:257:0x073f, B:259:0x0747, B:260:0x076e, B:262:0x078a, B:263:0x079f, B:265:0x07bb, B:266:0x07d0, B:268:0x081d, B:270:0x0823, B:271:0x084e, B:273:0x0856, B:274:0x085f, B:276:0x0865, B:277:0x086b, B:279:0x0882, B:281:0x0893, B:283:0x08a5, B:286:0x08b0, B:288:0x08b6, B:289:0x08c8, B:291:0x08ce, B:295:0x08de, B:297:0x08fa, B:300:0x0916, B:302:0x093c, B:303:0x0a88, B:305:0x0a9b, B:306:0x0955, B:308:0x0969, B:309:0x0986, B:311:0x09ad, B:313:0x09df, B:315:0x09ec, B:317:0x0a03, B:318:0x0a20, B:320:0x0a47, B:322:0x0a79, B:328:0x0aa3, B:330:0x0aeb, B:331:0x0afe, B:334:0x0b06, B:337:0x0b20, B:339:0x0b39, B:341:0x0b4e, B:343:0x0b53, B:345:0x0b57, B:347:0x0b5b, B:349:0x0b65, B:350:0x0b6b, B:352:0x0b6f, B:354:0x0b75, B:355:0x0b81, B:356:0x0b8a, B:358:0x0e48, B:359:0x0b9c, B:444:0x0bb4, B:362:0x0bd2, B:364:0x0bfb, B:365:0x0c03, B:367:0x0c09, B:371:0x0c1b, B:376:0x0c49, B:380:0x0c75, B:382:0x0c81, B:384:0x0c99, B:385:0x0cdc, B:390:0x0cf6, B:392:0x0d01, B:394:0x0d05, B:396:0x0d09, B:398:0x0d0d, B:399:0x0d19, B:400:0x0d1e, B:402:0x0d24, B:404:0x0d3a, B:405:0x0d3f, B:409:0x0d86, B:411:0x0e43, B:418:0x0d97, B:420:0x0da7, B:423:0x0dba, B:425:0x0dde, B:426:0x0de5, B:430:0x0e24, B:435:0x0e2e, B:438:0x0dac, B:442:0x0c31, B:448:0x0bbb, B:450:0x0e54, B:452:0x0e65, B:453:0x0e6d, B:454:0x0e75, B:456:0x0e7b, B:459:0x0e96, B:461:0x0ea8, B:462:0x0f59, B:464:0x0f5f, B:466:0x0f74, B:469:0x0f7b, B:470:0x0fb0, B:471:0x0f83, B:473:0x0f91, B:474:0x0f97, B:475:0x0fbf, B:478:0x0ec3, B:480:0x0ec9, B:485:0x0edb, B:486:0x0ee2, B:494:0x0efa, B:495:0x0f01, B:499:0x0f16, B:503:0x0f26, B:505:0x0f3d, B:506:0x0f44, B:507:0x0f41, B:514:0x0efe, B:518:0x0edf, B:523:0x0833, B:525:0x0839, B:527:0x083f, B:528:0x07cd, B:529:0x079c, B:530:0x074c, B:532:0x0752, B:536:0x0fda), top: B:2:0x0011, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0515 A[Catch: all -> 0x0114, TryCatch #3 {all -> 0x0114, blocks: (B:3:0x0011, B:5:0x002a, B:7:0x0033, B:8:0x004a, B:11:0x006a, B:14:0x0094, B:16:0x00d1, B:19:0x00ea, B:21:0x00f4, B:24:0x06a9, B:25:0x012d, B:28:0x013f, B:30:0x0145, B:32:0x0182, B:34:0x0194, B:37:0x01b4, B:39:0x01ba, B:41:0x01ca, B:43:0x01d8, B:45:0x01e8, B:47:0x01f3, B:52:0x01f6, B:54:0x020c, B:61:0x0405, B:62:0x0411, B:65:0x041b, B:69:0x0440, B:70:0x042e, B:77:0x0447, B:79:0x0453, B:81:0x045f, B:85:0x04a2, B:86:0x047a, B:89:0x048c, B:91:0x0492, B:93:0x049c, B:96:0x04b8, B:98:0x04c4, B:101:0x04d7, B:103:0x04e8, B:105:0x04f4, B:107:0x0567, B:109:0x056d, B:110:0x0579, B:112:0x057f, B:114:0x058f, B:116:0x0599, B:117:0x05ac, B:119:0x05b2, B:120:0x05cd, B:122:0x05d3, B:124:0x05f1, B:126:0x0600, B:128:0x062d, B:129:0x0609, B:131:0x0617, B:133:0x0636, B:134:0x0650, B:136:0x0656, B:139:0x0669, B:144:0x0676, B:145:0x067a, B:147:0x0680, B:149:0x0690, B:156:0x0515, B:158:0x0525, B:161:0x0538, B:163:0x0549, B:165:0x0555, B:168:0x023b, B:171:0x0245, B:173:0x0253, B:175:0x02a0, B:176:0x0272, B:178:0x0284, B:186:0x02b0, B:188:0x02da, B:189:0x0302, B:191:0x0337, B:192:0x033e, B:195:0x034a, B:197:0x037f, B:198:0x039c, B:200:0x03a2, B:202:0x03b0, B:204:0x03c5, B:205:0x03b9, B:211:0x03cb, B:214:0x03d2, B:215:0x03ea, B:217:0x014b, B:219:0x0156, B:221:0x0164, B:223:0x016a, B:226:0x0175, B:231:0x06c0, B:233:0x06ce, B:235:0x06d7, B:237:0x070c, B:238:0x06df, B:240:0x06e9, B:242:0x06ef, B:244:0x06fb, B:246:0x0705, B:249:0x070e, B:250:0x071a, B:253:0x0722, B:256:0x0734, B:257:0x073f, B:259:0x0747, B:260:0x076e, B:262:0x078a, B:263:0x079f, B:265:0x07bb, B:266:0x07d0, B:268:0x081d, B:270:0x0823, B:271:0x084e, B:273:0x0856, B:274:0x085f, B:276:0x0865, B:277:0x086b, B:279:0x0882, B:281:0x0893, B:283:0x08a5, B:286:0x08b0, B:288:0x08b6, B:289:0x08c8, B:291:0x08ce, B:295:0x08de, B:297:0x08fa, B:300:0x0916, B:302:0x093c, B:303:0x0a88, B:305:0x0a9b, B:306:0x0955, B:308:0x0969, B:309:0x0986, B:311:0x09ad, B:313:0x09df, B:315:0x09ec, B:317:0x0a03, B:318:0x0a20, B:320:0x0a47, B:322:0x0a79, B:328:0x0aa3, B:330:0x0aeb, B:331:0x0afe, B:334:0x0b06, B:337:0x0b20, B:339:0x0b39, B:341:0x0b4e, B:343:0x0b53, B:345:0x0b57, B:347:0x0b5b, B:349:0x0b65, B:350:0x0b6b, B:352:0x0b6f, B:354:0x0b75, B:355:0x0b81, B:356:0x0b8a, B:358:0x0e48, B:359:0x0b9c, B:444:0x0bb4, B:362:0x0bd2, B:364:0x0bfb, B:365:0x0c03, B:367:0x0c09, B:371:0x0c1b, B:376:0x0c49, B:380:0x0c75, B:382:0x0c81, B:384:0x0c99, B:385:0x0cdc, B:390:0x0cf6, B:392:0x0d01, B:394:0x0d05, B:396:0x0d09, B:398:0x0d0d, B:399:0x0d19, B:400:0x0d1e, B:402:0x0d24, B:404:0x0d3a, B:405:0x0d3f, B:409:0x0d86, B:411:0x0e43, B:418:0x0d97, B:420:0x0da7, B:423:0x0dba, B:425:0x0dde, B:426:0x0de5, B:430:0x0e24, B:435:0x0e2e, B:438:0x0dac, B:442:0x0c31, B:448:0x0bbb, B:450:0x0e54, B:452:0x0e65, B:453:0x0e6d, B:454:0x0e75, B:456:0x0e7b, B:459:0x0e96, B:461:0x0ea8, B:462:0x0f59, B:464:0x0f5f, B:466:0x0f74, B:469:0x0f7b, B:470:0x0fb0, B:471:0x0f83, B:473:0x0f91, B:474:0x0f97, B:475:0x0fbf, B:478:0x0ec3, B:480:0x0ec9, B:485:0x0edb, B:486:0x0ee2, B:494:0x0efa, B:495:0x0f01, B:499:0x0f16, B:503:0x0f26, B:505:0x0f3d, B:506:0x0f44, B:507:0x0f41, B:514:0x0efe, B:518:0x0edf, B:523:0x0833, B:525:0x0839, B:527:0x083f, B:528:0x07cd, B:529:0x079c, B:530:0x074c, B:532:0x0752, B:536:0x0fda), top: B:2:0x0011, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0bfb A[Catch: all -> 0x0114, TryCatch #3 {all -> 0x0114, blocks: (B:3:0x0011, B:5:0x002a, B:7:0x0033, B:8:0x004a, B:11:0x006a, B:14:0x0094, B:16:0x00d1, B:19:0x00ea, B:21:0x00f4, B:24:0x06a9, B:25:0x012d, B:28:0x013f, B:30:0x0145, B:32:0x0182, B:34:0x0194, B:37:0x01b4, B:39:0x01ba, B:41:0x01ca, B:43:0x01d8, B:45:0x01e8, B:47:0x01f3, B:52:0x01f6, B:54:0x020c, B:61:0x0405, B:62:0x0411, B:65:0x041b, B:69:0x0440, B:70:0x042e, B:77:0x0447, B:79:0x0453, B:81:0x045f, B:85:0x04a2, B:86:0x047a, B:89:0x048c, B:91:0x0492, B:93:0x049c, B:96:0x04b8, B:98:0x04c4, B:101:0x04d7, B:103:0x04e8, B:105:0x04f4, B:107:0x0567, B:109:0x056d, B:110:0x0579, B:112:0x057f, B:114:0x058f, B:116:0x0599, B:117:0x05ac, B:119:0x05b2, B:120:0x05cd, B:122:0x05d3, B:124:0x05f1, B:126:0x0600, B:128:0x062d, B:129:0x0609, B:131:0x0617, B:133:0x0636, B:134:0x0650, B:136:0x0656, B:139:0x0669, B:144:0x0676, B:145:0x067a, B:147:0x0680, B:149:0x0690, B:156:0x0515, B:158:0x0525, B:161:0x0538, B:163:0x0549, B:165:0x0555, B:168:0x023b, B:171:0x0245, B:173:0x0253, B:175:0x02a0, B:176:0x0272, B:178:0x0284, B:186:0x02b0, B:188:0x02da, B:189:0x0302, B:191:0x0337, B:192:0x033e, B:195:0x034a, B:197:0x037f, B:198:0x039c, B:200:0x03a2, B:202:0x03b0, B:204:0x03c5, B:205:0x03b9, B:211:0x03cb, B:214:0x03d2, B:215:0x03ea, B:217:0x014b, B:219:0x0156, B:221:0x0164, B:223:0x016a, B:226:0x0175, B:231:0x06c0, B:233:0x06ce, B:235:0x06d7, B:237:0x070c, B:238:0x06df, B:240:0x06e9, B:242:0x06ef, B:244:0x06fb, B:246:0x0705, B:249:0x070e, B:250:0x071a, B:253:0x0722, B:256:0x0734, B:257:0x073f, B:259:0x0747, B:260:0x076e, B:262:0x078a, B:263:0x079f, B:265:0x07bb, B:266:0x07d0, B:268:0x081d, B:270:0x0823, B:271:0x084e, B:273:0x0856, B:274:0x085f, B:276:0x0865, B:277:0x086b, B:279:0x0882, B:281:0x0893, B:283:0x08a5, B:286:0x08b0, B:288:0x08b6, B:289:0x08c8, B:291:0x08ce, B:295:0x08de, B:297:0x08fa, B:300:0x0916, B:302:0x093c, B:303:0x0a88, B:305:0x0a9b, B:306:0x0955, B:308:0x0969, B:309:0x0986, B:311:0x09ad, B:313:0x09df, B:315:0x09ec, B:317:0x0a03, B:318:0x0a20, B:320:0x0a47, B:322:0x0a79, B:328:0x0aa3, B:330:0x0aeb, B:331:0x0afe, B:334:0x0b06, B:337:0x0b20, B:339:0x0b39, B:341:0x0b4e, B:343:0x0b53, B:345:0x0b57, B:347:0x0b5b, B:349:0x0b65, B:350:0x0b6b, B:352:0x0b6f, B:354:0x0b75, B:355:0x0b81, B:356:0x0b8a, B:358:0x0e48, B:359:0x0b9c, B:444:0x0bb4, B:362:0x0bd2, B:364:0x0bfb, B:365:0x0c03, B:367:0x0c09, B:371:0x0c1b, B:376:0x0c49, B:380:0x0c75, B:382:0x0c81, B:384:0x0c99, B:385:0x0cdc, B:390:0x0cf6, B:392:0x0d01, B:394:0x0d05, B:396:0x0d09, B:398:0x0d0d, B:399:0x0d19, B:400:0x0d1e, B:402:0x0d24, B:404:0x0d3a, B:405:0x0d3f, B:409:0x0d86, B:411:0x0e43, B:418:0x0d97, B:420:0x0da7, B:423:0x0dba, B:425:0x0dde, B:426:0x0de5, B:430:0x0e24, B:435:0x0e2e, B:438:0x0dac, B:442:0x0c31, B:448:0x0bbb, B:450:0x0e54, B:452:0x0e65, B:453:0x0e6d, B:454:0x0e75, B:456:0x0e7b, B:459:0x0e96, B:461:0x0ea8, B:462:0x0f59, B:464:0x0f5f, B:466:0x0f74, B:469:0x0f7b, B:470:0x0fb0, B:471:0x0f83, B:473:0x0f91, B:474:0x0f97, B:475:0x0fbf, B:478:0x0ec3, B:480:0x0ec9, B:485:0x0edb, B:486:0x0ee2, B:494:0x0efa, B:495:0x0f01, B:499:0x0f16, B:503:0x0f26, B:505:0x0f3d, B:506:0x0f44, B:507:0x0f41, B:514:0x0efe, B:518:0x0edf, B:523:0x0833, B:525:0x0839, B:527:0x083f, B:528:0x07cd, B:529:0x079c, B:530:0x074c, B:532:0x0752, B:536:0x0fda), top: B:2:0x0011, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0c49 A[Catch: all -> 0x0114, TryCatch #3 {all -> 0x0114, blocks: (B:3:0x0011, B:5:0x002a, B:7:0x0033, B:8:0x004a, B:11:0x006a, B:14:0x0094, B:16:0x00d1, B:19:0x00ea, B:21:0x00f4, B:24:0x06a9, B:25:0x012d, B:28:0x013f, B:30:0x0145, B:32:0x0182, B:34:0x0194, B:37:0x01b4, B:39:0x01ba, B:41:0x01ca, B:43:0x01d8, B:45:0x01e8, B:47:0x01f3, B:52:0x01f6, B:54:0x020c, B:61:0x0405, B:62:0x0411, B:65:0x041b, B:69:0x0440, B:70:0x042e, B:77:0x0447, B:79:0x0453, B:81:0x045f, B:85:0x04a2, B:86:0x047a, B:89:0x048c, B:91:0x0492, B:93:0x049c, B:96:0x04b8, B:98:0x04c4, B:101:0x04d7, B:103:0x04e8, B:105:0x04f4, B:107:0x0567, B:109:0x056d, B:110:0x0579, B:112:0x057f, B:114:0x058f, B:116:0x0599, B:117:0x05ac, B:119:0x05b2, B:120:0x05cd, B:122:0x05d3, B:124:0x05f1, B:126:0x0600, B:128:0x062d, B:129:0x0609, B:131:0x0617, B:133:0x0636, B:134:0x0650, B:136:0x0656, B:139:0x0669, B:144:0x0676, B:145:0x067a, B:147:0x0680, B:149:0x0690, B:156:0x0515, B:158:0x0525, B:161:0x0538, B:163:0x0549, B:165:0x0555, B:168:0x023b, B:171:0x0245, B:173:0x0253, B:175:0x02a0, B:176:0x0272, B:178:0x0284, B:186:0x02b0, B:188:0x02da, B:189:0x0302, B:191:0x0337, B:192:0x033e, B:195:0x034a, B:197:0x037f, B:198:0x039c, B:200:0x03a2, B:202:0x03b0, B:204:0x03c5, B:205:0x03b9, B:211:0x03cb, B:214:0x03d2, B:215:0x03ea, B:217:0x014b, B:219:0x0156, B:221:0x0164, B:223:0x016a, B:226:0x0175, B:231:0x06c0, B:233:0x06ce, B:235:0x06d7, B:237:0x070c, B:238:0x06df, B:240:0x06e9, B:242:0x06ef, B:244:0x06fb, B:246:0x0705, B:249:0x070e, B:250:0x071a, B:253:0x0722, B:256:0x0734, B:257:0x073f, B:259:0x0747, B:260:0x076e, B:262:0x078a, B:263:0x079f, B:265:0x07bb, B:266:0x07d0, B:268:0x081d, B:270:0x0823, B:271:0x084e, B:273:0x0856, B:274:0x085f, B:276:0x0865, B:277:0x086b, B:279:0x0882, B:281:0x0893, B:283:0x08a5, B:286:0x08b0, B:288:0x08b6, B:289:0x08c8, B:291:0x08ce, B:295:0x08de, B:297:0x08fa, B:300:0x0916, B:302:0x093c, B:303:0x0a88, B:305:0x0a9b, B:306:0x0955, B:308:0x0969, B:309:0x0986, B:311:0x09ad, B:313:0x09df, B:315:0x09ec, B:317:0x0a03, B:318:0x0a20, B:320:0x0a47, B:322:0x0a79, B:328:0x0aa3, B:330:0x0aeb, B:331:0x0afe, B:334:0x0b06, B:337:0x0b20, B:339:0x0b39, B:341:0x0b4e, B:343:0x0b53, B:345:0x0b57, B:347:0x0b5b, B:349:0x0b65, B:350:0x0b6b, B:352:0x0b6f, B:354:0x0b75, B:355:0x0b81, B:356:0x0b8a, B:358:0x0e48, B:359:0x0b9c, B:444:0x0bb4, B:362:0x0bd2, B:364:0x0bfb, B:365:0x0c03, B:367:0x0c09, B:371:0x0c1b, B:376:0x0c49, B:380:0x0c75, B:382:0x0c81, B:384:0x0c99, B:385:0x0cdc, B:390:0x0cf6, B:392:0x0d01, B:394:0x0d05, B:396:0x0d09, B:398:0x0d0d, B:399:0x0d19, B:400:0x0d1e, B:402:0x0d24, B:404:0x0d3a, B:405:0x0d3f, B:409:0x0d86, B:411:0x0e43, B:418:0x0d97, B:420:0x0da7, B:423:0x0dba, B:425:0x0dde, B:426:0x0de5, B:430:0x0e24, B:435:0x0e2e, B:438:0x0dac, B:442:0x0c31, B:448:0x0bbb, B:450:0x0e54, B:452:0x0e65, B:453:0x0e6d, B:454:0x0e75, B:456:0x0e7b, B:459:0x0e96, B:461:0x0ea8, B:462:0x0f59, B:464:0x0f5f, B:466:0x0f74, B:469:0x0f7b, B:470:0x0fb0, B:471:0x0f83, B:473:0x0f91, B:474:0x0f97, B:475:0x0fbf, B:478:0x0ec3, B:480:0x0ec9, B:485:0x0edb, B:486:0x0ee2, B:494:0x0efa, B:495:0x0f01, B:499:0x0f16, B:503:0x0f26, B:505:0x0f3d, B:506:0x0f44, B:507:0x0f41, B:514:0x0efe, B:518:0x0edf, B:523:0x0833, B:525:0x0839, B:527:0x083f, B:528:0x07cd, B:529:0x079c, B:530:0x074c, B:532:0x0752, B:536:0x0fda), top: B:2:0x0011, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0c75 A[Catch: all -> 0x0114, TryCatch #3 {all -> 0x0114, blocks: (B:3:0x0011, B:5:0x002a, B:7:0x0033, B:8:0x004a, B:11:0x006a, B:14:0x0094, B:16:0x00d1, B:19:0x00ea, B:21:0x00f4, B:24:0x06a9, B:25:0x012d, B:28:0x013f, B:30:0x0145, B:32:0x0182, B:34:0x0194, B:37:0x01b4, B:39:0x01ba, B:41:0x01ca, B:43:0x01d8, B:45:0x01e8, B:47:0x01f3, B:52:0x01f6, B:54:0x020c, B:61:0x0405, B:62:0x0411, B:65:0x041b, B:69:0x0440, B:70:0x042e, B:77:0x0447, B:79:0x0453, B:81:0x045f, B:85:0x04a2, B:86:0x047a, B:89:0x048c, B:91:0x0492, B:93:0x049c, B:96:0x04b8, B:98:0x04c4, B:101:0x04d7, B:103:0x04e8, B:105:0x04f4, B:107:0x0567, B:109:0x056d, B:110:0x0579, B:112:0x057f, B:114:0x058f, B:116:0x0599, B:117:0x05ac, B:119:0x05b2, B:120:0x05cd, B:122:0x05d3, B:124:0x05f1, B:126:0x0600, B:128:0x062d, B:129:0x0609, B:131:0x0617, B:133:0x0636, B:134:0x0650, B:136:0x0656, B:139:0x0669, B:144:0x0676, B:145:0x067a, B:147:0x0680, B:149:0x0690, B:156:0x0515, B:158:0x0525, B:161:0x0538, B:163:0x0549, B:165:0x0555, B:168:0x023b, B:171:0x0245, B:173:0x0253, B:175:0x02a0, B:176:0x0272, B:178:0x0284, B:186:0x02b0, B:188:0x02da, B:189:0x0302, B:191:0x0337, B:192:0x033e, B:195:0x034a, B:197:0x037f, B:198:0x039c, B:200:0x03a2, B:202:0x03b0, B:204:0x03c5, B:205:0x03b9, B:211:0x03cb, B:214:0x03d2, B:215:0x03ea, B:217:0x014b, B:219:0x0156, B:221:0x0164, B:223:0x016a, B:226:0x0175, B:231:0x06c0, B:233:0x06ce, B:235:0x06d7, B:237:0x070c, B:238:0x06df, B:240:0x06e9, B:242:0x06ef, B:244:0x06fb, B:246:0x0705, B:249:0x070e, B:250:0x071a, B:253:0x0722, B:256:0x0734, B:257:0x073f, B:259:0x0747, B:260:0x076e, B:262:0x078a, B:263:0x079f, B:265:0x07bb, B:266:0x07d0, B:268:0x081d, B:270:0x0823, B:271:0x084e, B:273:0x0856, B:274:0x085f, B:276:0x0865, B:277:0x086b, B:279:0x0882, B:281:0x0893, B:283:0x08a5, B:286:0x08b0, B:288:0x08b6, B:289:0x08c8, B:291:0x08ce, B:295:0x08de, B:297:0x08fa, B:300:0x0916, B:302:0x093c, B:303:0x0a88, B:305:0x0a9b, B:306:0x0955, B:308:0x0969, B:309:0x0986, B:311:0x09ad, B:313:0x09df, B:315:0x09ec, B:317:0x0a03, B:318:0x0a20, B:320:0x0a47, B:322:0x0a79, B:328:0x0aa3, B:330:0x0aeb, B:331:0x0afe, B:334:0x0b06, B:337:0x0b20, B:339:0x0b39, B:341:0x0b4e, B:343:0x0b53, B:345:0x0b57, B:347:0x0b5b, B:349:0x0b65, B:350:0x0b6b, B:352:0x0b6f, B:354:0x0b75, B:355:0x0b81, B:356:0x0b8a, B:358:0x0e48, B:359:0x0b9c, B:444:0x0bb4, B:362:0x0bd2, B:364:0x0bfb, B:365:0x0c03, B:367:0x0c09, B:371:0x0c1b, B:376:0x0c49, B:380:0x0c75, B:382:0x0c81, B:384:0x0c99, B:385:0x0cdc, B:390:0x0cf6, B:392:0x0d01, B:394:0x0d05, B:396:0x0d09, B:398:0x0d0d, B:399:0x0d19, B:400:0x0d1e, B:402:0x0d24, B:404:0x0d3a, B:405:0x0d3f, B:409:0x0d86, B:411:0x0e43, B:418:0x0d97, B:420:0x0da7, B:423:0x0dba, B:425:0x0dde, B:426:0x0de5, B:430:0x0e24, B:435:0x0e2e, B:438:0x0dac, B:442:0x0c31, B:448:0x0bbb, B:450:0x0e54, B:452:0x0e65, B:453:0x0e6d, B:454:0x0e75, B:456:0x0e7b, B:459:0x0e96, B:461:0x0ea8, B:462:0x0f59, B:464:0x0f5f, B:466:0x0f74, B:469:0x0f7b, B:470:0x0fb0, B:471:0x0f83, B:473:0x0f91, B:474:0x0f97, B:475:0x0fbf, B:478:0x0ec3, B:480:0x0ec9, B:485:0x0edb, B:486:0x0ee2, B:494:0x0efa, B:495:0x0f01, B:499:0x0f16, B:503:0x0f26, B:505:0x0f3d, B:506:0x0f44, B:507:0x0f41, B:514:0x0efe, B:518:0x0edf, B:523:0x0833, B:525:0x0839, B:527:0x083f, B:528:0x07cd, B:529:0x079c, B:530:0x074c, B:532:0x0752, B:536:0x0fda), top: B:2:0x0011, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0405 A[Catch: all -> 0x0114, TryCatch #3 {all -> 0x0114, blocks: (B:3:0x0011, B:5:0x002a, B:7:0x0033, B:8:0x004a, B:11:0x006a, B:14:0x0094, B:16:0x00d1, B:19:0x00ea, B:21:0x00f4, B:24:0x06a9, B:25:0x012d, B:28:0x013f, B:30:0x0145, B:32:0x0182, B:34:0x0194, B:37:0x01b4, B:39:0x01ba, B:41:0x01ca, B:43:0x01d8, B:45:0x01e8, B:47:0x01f3, B:52:0x01f6, B:54:0x020c, B:61:0x0405, B:62:0x0411, B:65:0x041b, B:69:0x0440, B:70:0x042e, B:77:0x0447, B:79:0x0453, B:81:0x045f, B:85:0x04a2, B:86:0x047a, B:89:0x048c, B:91:0x0492, B:93:0x049c, B:96:0x04b8, B:98:0x04c4, B:101:0x04d7, B:103:0x04e8, B:105:0x04f4, B:107:0x0567, B:109:0x056d, B:110:0x0579, B:112:0x057f, B:114:0x058f, B:116:0x0599, B:117:0x05ac, B:119:0x05b2, B:120:0x05cd, B:122:0x05d3, B:124:0x05f1, B:126:0x0600, B:128:0x062d, B:129:0x0609, B:131:0x0617, B:133:0x0636, B:134:0x0650, B:136:0x0656, B:139:0x0669, B:144:0x0676, B:145:0x067a, B:147:0x0680, B:149:0x0690, B:156:0x0515, B:158:0x0525, B:161:0x0538, B:163:0x0549, B:165:0x0555, B:168:0x023b, B:171:0x0245, B:173:0x0253, B:175:0x02a0, B:176:0x0272, B:178:0x0284, B:186:0x02b0, B:188:0x02da, B:189:0x0302, B:191:0x0337, B:192:0x033e, B:195:0x034a, B:197:0x037f, B:198:0x039c, B:200:0x03a2, B:202:0x03b0, B:204:0x03c5, B:205:0x03b9, B:211:0x03cb, B:214:0x03d2, B:215:0x03ea, B:217:0x014b, B:219:0x0156, B:221:0x0164, B:223:0x016a, B:226:0x0175, B:231:0x06c0, B:233:0x06ce, B:235:0x06d7, B:237:0x070c, B:238:0x06df, B:240:0x06e9, B:242:0x06ef, B:244:0x06fb, B:246:0x0705, B:249:0x070e, B:250:0x071a, B:253:0x0722, B:256:0x0734, B:257:0x073f, B:259:0x0747, B:260:0x076e, B:262:0x078a, B:263:0x079f, B:265:0x07bb, B:266:0x07d0, B:268:0x081d, B:270:0x0823, B:271:0x084e, B:273:0x0856, B:274:0x085f, B:276:0x0865, B:277:0x086b, B:279:0x0882, B:281:0x0893, B:283:0x08a5, B:286:0x08b0, B:288:0x08b6, B:289:0x08c8, B:291:0x08ce, B:295:0x08de, B:297:0x08fa, B:300:0x0916, B:302:0x093c, B:303:0x0a88, B:305:0x0a9b, B:306:0x0955, B:308:0x0969, B:309:0x0986, B:311:0x09ad, B:313:0x09df, B:315:0x09ec, B:317:0x0a03, B:318:0x0a20, B:320:0x0a47, B:322:0x0a79, B:328:0x0aa3, B:330:0x0aeb, B:331:0x0afe, B:334:0x0b06, B:337:0x0b20, B:339:0x0b39, B:341:0x0b4e, B:343:0x0b53, B:345:0x0b57, B:347:0x0b5b, B:349:0x0b65, B:350:0x0b6b, B:352:0x0b6f, B:354:0x0b75, B:355:0x0b81, B:356:0x0b8a, B:358:0x0e48, B:359:0x0b9c, B:444:0x0bb4, B:362:0x0bd2, B:364:0x0bfb, B:365:0x0c03, B:367:0x0c09, B:371:0x0c1b, B:376:0x0c49, B:380:0x0c75, B:382:0x0c81, B:384:0x0c99, B:385:0x0cdc, B:390:0x0cf6, B:392:0x0d01, B:394:0x0d05, B:396:0x0d09, B:398:0x0d0d, B:399:0x0d19, B:400:0x0d1e, B:402:0x0d24, B:404:0x0d3a, B:405:0x0d3f, B:409:0x0d86, B:411:0x0e43, B:418:0x0d97, B:420:0x0da7, B:423:0x0dba, B:425:0x0dde, B:426:0x0de5, B:430:0x0e24, B:435:0x0e2e, B:438:0x0dac, B:442:0x0c31, B:448:0x0bbb, B:450:0x0e54, B:452:0x0e65, B:453:0x0e6d, B:454:0x0e75, B:456:0x0e7b, B:459:0x0e96, B:461:0x0ea8, B:462:0x0f59, B:464:0x0f5f, B:466:0x0f74, B:469:0x0f7b, B:470:0x0fb0, B:471:0x0f83, B:473:0x0f91, B:474:0x0f97, B:475:0x0fbf, B:478:0x0ec3, B:480:0x0ec9, B:485:0x0edb, B:486:0x0ee2, B:494:0x0efa, B:495:0x0f01, B:499:0x0f16, B:503:0x0f26, B:505:0x0f3d, B:506:0x0f44, B:507:0x0f41, B:514:0x0efe, B:518:0x0edf, B:523:0x0833, B:525:0x0839, B:527:0x083f, B:528:0x07cd, B:529:0x079c, B:530:0x074c, B:532:0x0752, B:536:0x0fda), top: B:2:0x0011, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04c4 A[Catch: all -> 0x0114, TryCatch #3 {all -> 0x0114, blocks: (B:3:0x0011, B:5:0x002a, B:7:0x0033, B:8:0x004a, B:11:0x006a, B:14:0x0094, B:16:0x00d1, B:19:0x00ea, B:21:0x00f4, B:24:0x06a9, B:25:0x012d, B:28:0x013f, B:30:0x0145, B:32:0x0182, B:34:0x0194, B:37:0x01b4, B:39:0x01ba, B:41:0x01ca, B:43:0x01d8, B:45:0x01e8, B:47:0x01f3, B:52:0x01f6, B:54:0x020c, B:61:0x0405, B:62:0x0411, B:65:0x041b, B:69:0x0440, B:70:0x042e, B:77:0x0447, B:79:0x0453, B:81:0x045f, B:85:0x04a2, B:86:0x047a, B:89:0x048c, B:91:0x0492, B:93:0x049c, B:96:0x04b8, B:98:0x04c4, B:101:0x04d7, B:103:0x04e8, B:105:0x04f4, B:107:0x0567, B:109:0x056d, B:110:0x0579, B:112:0x057f, B:114:0x058f, B:116:0x0599, B:117:0x05ac, B:119:0x05b2, B:120:0x05cd, B:122:0x05d3, B:124:0x05f1, B:126:0x0600, B:128:0x062d, B:129:0x0609, B:131:0x0617, B:133:0x0636, B:134:0x0650, B:136:0x0656, B:139:0x0669, B:144:0x0676, B:145:0x067a, B:147:0x0680, B:149:0x0690, B:156:0x0515, B:158:0x0525, B:161:0x0538, B:163:0x0549, B:165:0x0555, B:168:0x023b, B:171:0x0245, B:173:0x0253, B:175:0x02a0, B:176:0x0272, B:178:0x0284, B:186:0x02b0, B:188:0x02da, B:189:0x0302, B:191:0x0337, B:192:0x033e, B:195:0x034a, B:197:0x037f, B:198:0x039c, B:200:0x03a2, B:202:0x03b0, B:204:0x03c5, B:205:0x03b9, B:211:0x03cb, B:214:0x03d2, B:215:0x03ea, B:217:0x014b, B:219:0x0156, B:221:0x0164, B:223:0x016a, B:226:0x0175, B:231:0x06c0, B:233:0x06ce, B:235:0x06d7, B:237:0x070c, B:238:0x06df, B:240:0x06e9, B:242:0x06ef, B:244:0x06fb, B:246:0x0705, B:249:0x070e, B:250:0x071a, B:253:0x0722, B:256:0x0734, B:257:0x073f, B:259:0x0747, B:260:0x076e, B:262:0x078a, B:263:0x079f, B:265:0x07bb, B:266:0x07d0, B:268:0x081d, B:270:0x0823, B:271:0x084e, B:273:0x0856, B:274:0x085f, B:276:0x0865, B:277:0x086b, B:279:0x0882, B:281:0x0893, B:283:0x08a5, B:286:0x08b0, B:288:0x08b6, B:289:0x08c8, B:291:0x08ce, B:295:0x08de, B:297:0x08fa, B:300:0x0916, B:302:0x093c, B:303:0x0a88, B:305:0x0a9b, B:306:0x0955, B:308:0x0969, B:309:0x0986, B:311:0x09ad, B:313:0x09df, B:315:0x09ec, B:317:0x0a03, B:318:0x0a20, B:320:0x0a47, B:322:0x0a79, B:328:0x0aa3, B:330:0x0aeb, B:331:0x0afe, B:334:0x0b06, B:337:0x0b20, B:339:0x0b39, B:341:0x0b4e, B:343:0x0b53, B:345:0x0b57, B:347:0x0b5b, B:349:0x0b65, B:350:0x0b6b, B:352:0x0b6f, B:354:0x0b75, B:355:0x0b81, B:356:0x0b8a, B:358:0x0e48, B:359:0x0b9c, B:444:0x0bb4, B:362:0x0bd2, B:364:0x0bfb, B:365:0x0c03, B:367:0x0c09, B:371:0x0c1b, B:376:0x0c49, B:380:0x0c75, B:382:0x0c81, B:384:0x0c99, B:385:0x0cdc, B:390:0x0cf6, B:392:0x0d01, B:394:0x0d05, B:396:0x0d09, B:398:0x0d0d, B:399:0x0d19, B:400:0x0d1e, B:402:0x0d24, B:404:0x0d3a, B:405:0x0d3f, B:409:0x0d86, B:411:0x0e43, B:418:0x0d97, B:420:0x0da7, B:423:0x0dba, B:425:0x0dde, B:426:0x0de5, B:430:0x0e24, B:435:0x0e2e, B:438:0x0dac, B:442:0x0c31, B:448:0x0bbb, B:450:0x0e54, B:452:0x0e65, B:453:0x0e6d, B:454:0x0e75, B:456:0x0e7b, B:459:0x0e96, B:461:0x0ea8, B:462:0x0f59, B:464:0x0f5f, B:466:0x0f74, B:469:0x0f7b, B:470:0x0fb0, B:471:0x0f83, B:473:0x0f91, B:474:0x0f97, B:475:0x0fbf, B:478:0x0ec3, B:480:0x0ec9, B:485:0x0edb, B:486:0x0ee2, B:494:0x0efa, B:495:0x0f01, B:499:0x0f16, B:503:0x0f26, B:505:0x0f3d, B:506:0x0f44, B:507:0x0f41, B:514:0x0efe, B:518:0x0edf, B:523:0x0833, B:525:0x0839, B:527:0x083f, B:528:0x07cd, B:529:0x079c, B:530:0x074c, B:532:0x0752, B:536:0x0fda), top: B:2:0x0011, inners: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(String str, long j) {
        Throwable th;
        boolean z8;
        boolean z10;
        int i7;
        C0646q0 c0646q0;
        zzic zzicVar;
        C0646q0 c0646q02;
        boolean z11;
        E3.d dVar;
        long parseLong;
        C0646q0 c0646q03;
        String str2;
        int a02;
        Long l10;
        ArrayList arrayList;
        SecureRandom secureRandom;
        int i10;
        E3.d dVar2;
        zzic zzicVar2;
        long zzp;
        int i11;
        zzhr zzhrVar;
        zzhr zzhrVar2;
        int i12;
        C0 c02;
        C0646q0 c0646q04;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z12;
        String str9;
        boolean z13;
        String str10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        I1 i110 = this;
        String str11 = "1";
        String str12 = "_ai";
        String str13 = "purchase";
        String str14 = "items";
        f0().x0();
        try {
            E3.d dVar3 = new E3.d(i110);
            f0().v0(str, j, i110.f11393O, dVar3);
            ArrayList arrayList2 = (ArrayList) dVar3.f3527d;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                f0().y0();
                z8 = false;
            } else {
                zzic zzicVar3 = (zzic) ((zzid) dVar3.f3525b).zzcl();
                zzicVar3.zzi();
                int i22 = -1;
                int i23 = -1;
                int i24 = 0;
                int i25 = 0;
                boolean z14 = false;
                boolean z15 = false;
                zzhr zzhrVar3 = null;
                zzhr zzhrVar4 = null;
                while (true) {
                    int size = ((ArrayList) dVar3.f3527d).size();
                    z10 = z15;
                    String str15 = "_fr";
                    i7 = i25;
                    String str16 = str14;
                    c0646q0 = i110.f11414z;
                    int i26 = i23;
                    zzicVar = zzicVar3;
                    int i27 = i22;
                    if (i24 >= size) {
                        break;
                    }
                    zzhr zzhrVar5 = (zzhr) ((zzhs) ((ArrayList) dVar3.f3527d).get(i24)).zzcl();
                    int i28 = i24;
                    if (e0().Y(((zzid) dVar3.f3525b).zzA(), zzhrVar5.zzk())) {
                        b().O().c("Dropping blocked raw event. appId", W.R(((zzid) dVar3.f3525b).zzA()), c0646q0.m().a(zzhrVar5.zzk()));
                        if (!str11.equals(e0().a(((zzid) dVar3.f3525b).zzA(), "measurement.upload.blacklist_internal")) && !str11.equals(e0().a(((zzid) dVar3.f3525b).zzA(), "measurement.upload.blacklist_public")) && !"_err".equals(zzhrVar5.zzk())) {
                            j0();
                            M1.Z(i110.f11402X, ((zzid) dVar3.f3525b).zzA(), 11, "_ev", zzhrVar5.zzk(), 0);
                        }
                        z15 = z10;
                        str5 = str11;
                        str7 = str12;
                        str8 = str13;
                        i25 = i7;
                        str14 = str16;
                        i23 = i26;
                        zzicVar3 = zzicVar;
                        i17 = i27;
                        i19 = i28;
                    } else {
                        String zzk = zzhrVar5.zzk();
                        str5 = str11;
                        if (zzk.equals(str13) || zzk.equals("_iap") || zzk.equals("ecommerce_purchase")) {
                            zzhv zzn = zzhw.zzn();
                            zzn.zzb("_ct");
                            if (!z14) {
                                String zzA = ((zzid) dVar3.f3525b).zzA();
                                if (i110.P(zzA, str13) && i110.P(zzA, "_iap") && i110.P(zzA, "ecommerce_purchase")) {
                                    str6 = "new";
                                    zzn.zzd(str6);
                                    zzhrVar5.zzf((zzhw) zzn.zzbc());
                                    z14 = true;
                                }
                            }
                            str6 = "returning";
                            zzn.zzd(str6);
                            zzhrVar5.zzf((zzhw) zzn.zzbc());
                            z14 = true;
                        }
                        if (zzhrVar5.zzk().equals(D0.g(str12, D0.f11237c, D0.f11235a))) {
                            zzhrVar5.zzl(str12);
                            b().Q().a("Renaming ad_impression to _ai");
                            if (Log.isLoggable(b().T(), 5)) {
                                for (int i29 = 0; i29 < zzhrVar5.zzb(); i29++) {
                                    if ("ad_platform".equals(zzhrVar5.zzc(i29).zzb()) && !zzhrVar5.zzc(i29).zzd().isEmpty() && "admob".equalsIgnoreCase(zzhrVar5.zzc(i29).zzd())) {
                                        b().f11582y.a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                }
                            }
                        }
                        boolean Z7 = e0().Z(((zzid) dVar3.f3525b).zzA(), zzhrVar5.zzk());
                        if (!Z7) {
                            i0();
                            String zzk2 = zzhrVar5.zzk();
                            com.google.android.gms.common.internal.G.d(zzk2);
                            if (zzk2.hashCode() != 95027 || !zzk2.equals("_ui")) {
                                str7 = str12;
                                str8 = str13;
                                z12 = z14;
                                str9 = "_fr";
                                Z7 = false;
                                z15 = z10;
                                if (Z7) {
                                    ArrayList arrayList3 = new ArrayList(zzhrVar5.zza());
                                    int i30 = -1;
                                    int i31 = -1;
                                    for (int i32 = 0; i32 < arrayList3.size(); i32++) {
                                        if ("value".equals(((zzhw) arrayList3.get(i32)).zzb())) {
                                            i30 = i32;
                                        } else if ("currency".equals(((zzhw) arrayList3.get(i32)).zzb())) {
                                            i31 = i32;
                                        }
                                    }
                                    if (i30 != -1) {
                                        if (((zzhw) arrayList3.get(i30)).zze() || ((zzhw) arrayList3.get(i30)).zzi()) {
                                            if (i31 != -1) {
                                                String zzd = ((zzhw) arrayList3.get(i31)).zzd();
                                                if (zzd.length() == 3) {
                                                    int i33 = 0;
                                                    while (i33 < zzd.length()) {
                                                        int codePointAt = zzd.codePointAt(i33);
                                                        if (Character.isLetter(codePointAt)) {
                                                            i33 += Character.charCount(codePointAt);
                                                        }
                                                    }
                                                }
                                            }
                                            b().f11582y.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                            zzhrVar5.zzj(i30);
                                            C(zzhrVar5, "_c");
                                            c0(zzhrVar5, 19, "currency");
                                            break;
                                        }
                                        b().f11582y.a("Value must be specified with a numeric type.");
                                        zzhrVar5.zzj(i30);
                                        C(zzhrVar5, "_c");
                                        c0(zzhrVar5, 18, "value");
                                    }
                                }
                                if ("_e".equals(zzhrVar5.zzk())) {
                                    zzicVar3 = zzicVar;
                                    i14 = i27;
                                    if ("_vs".equals(zzhrVar5.zzk())) {
                                        i0();
                                        if (C0598a0.R((zzhs) zzhrVar5.zzbc(), "_et") == null) {
                                            if (zzhrVar3 != null && Math.abs(zzhrVar3.zzn() - zzhrVar5.zzn()) <= 1000) {
                                                zzhr zzhrVar6 = (zzhr) zzhrVar3.clone();
                                                if (i110.I(zzhrVar6, zzhrVar5)) {
                                                    zzicVar3.zzf(i26, zzhrVar6);
                                                    i15 = i26;
                                                    i16 = i14;
                                                    zzhrVar3 = null;
                                                    zzhrVar4 = null;
                                                    if (zzhrVar5.zzb() == 0) {
                                                    }
                                                    i19 = i28;
                                                    ((ArrayList) dVar3.f3527d).set(i19, (zzhs) zzhrVar5.zzbc());
                                                    zzicVar3.zzg(zzhrVar5);
                                                    i25 = i7 + 1;
                                                    i23 = i18;
                                                    z14 = z12;
                                                }
                                            }
                                            zzhrVar4 = zzhrVar5;
                                            i15 = i26;
                                            i16 = i7;
                                            if (zzhrVar5.zzb() == 0) {
                                            }
                                            i19 = i28;
                                            ((ArrayList) dVar3.f3527d).set(i19, (zzhs) zzhrVar5.zzbc());
                                            zzicVar3.zzg(zzhrVar5);
                                            i25 = i7 + 1;
                                            i23 = i18;
                                            z14 = z12;
                                        }
                                    }
                                    i15 = i26;
                                    i16 = i14;
                                    if (zzhrVar5.zzb() == 0) {
                                    }
                                    i19 = i28;
                                    ((ArrayList) dVar3.f3527d).set(i19, (zzhs) zzhrVar5.zzbc());
                                    zzicVar3.zzg(zzhrVar5);
                                    i25 = i7 + 1;
                                    i23 = i18;
                                    z14 = z12;
                                } else {
                                    i0();
                                    if (C0598a0.R((zzhs) zzhrVar5.zzbc(), str9) == null) {
                                        if (zzhrVar4 != null && Math.abs(zzhrVar4.zzn() - zzhrVar5.zzn()) <= 1000) {
                                            zzhr zzhrVar7 = (zzhr) zzhrVar4.clone();
                                            if (i110.I(zzhrVar5, zzhrVar7)) {
                                                zzicVar3 = zzicVar;
                                                zzicVar3.zzf(i27, zzhrVar7);
                                                i16 = i27;
                                                i15 = i26;
                                                zzhrVar3 = null;
                                                zzhrVar4 = null;
                                                if (zzhrVar5.zzb() == 0) {
                                                    i0();
                                                    Bundle Q3 = C0598a0.Q(zzhrVar5.zza());
                                                    int i34 = 0;
                                                    while (i34 < zzhrVar5.zzb()) {
                                                        zzhw zzc = zzhrVar5.zzc(i34);
                                                        String str17 = str16;
                                                        if (!zzc.zzb().equals(str17) || zzc.zzk().isEmpty()) {
                                                            i20 = i16;
                                                            i21 = i15;
                                                            if (!zzc.zzb().equals(str17)) {
                                                                i110.w(zzhrVar5.zzk(), (zzhv) zzc.zzcl(), Q3, ((zzid) dVar3.f3525b).zzA());
                                                            }
                                                        } else {
                                                            String zzA2 = ((zzid) dVar3.f3525b).zzA();
                                                            List zzk3 = zzc.zzk();
                                                            Bundle[] bundleArr = new Bundle[zzk3.size()];
                                                            int i35 = 0;
                                                            while (i35 < zzk3.size()) {
                                                                zzhw zzhwVar = (zzhw) zzk3.get(i35);
                                                                i0();
                                                                List list = zzk3;
                                                                Bundle Q10 = C0598a0.Q(zzhwVar.zzk());
                                                                Iterator it = zzhwVar.zzk().iterator();
                                                                while (it.hasNext()) {
                                                                    i110.w(zzhrVar5.zzk(), (zzhv) ((zzhw) it.next()).zzcl(), Q10, zzA2);
                                                                    i16 = i16;
                                                                    i15 = i15;
                                                                }
                                                                bundleArr[i35] = Q10;
                                                                i35++;
                                                                zzk3 = list;
                                                                i16 = i16;
                                                                i15 = i15;
                                                            }
                                                            i20 = i16;
                                                            i21 = i15;
                                                            Q3.putParcelableArray(str17, bundleArr);
                                                        }
                                                        i34++;
                                                        str16 = str17;
                                                        i16 = i20;
                                                        i15 = i21;
                                                    }
                                                    i17 = i16;
                                                    i18 = i15;
                                                    str14 = str16;
                                                    zzhrVar5.zzi();
                                                    C0598a0 i02 = i0();
                                                    ArrayList arrayList4 = new ArrayList();
                                                    for (String str18 : Q3.keySet()) {
                                                        zzhv zzn2 = zzhw.zzn();
                                                        zzn2.zzb(str18);
                                                        Object obj = Q3.get(str18);
                                                        if (obj != null) {
                                                            i02.j0(zzn2, obj);
                                                            arrayList4.add((zzhw) zzn2.zzbc());
                                                        }
                                                    }
                                                    Iterator it2 = arrayList4.iterator();
                                                    while (it2.hasNext()) {
                                                        zzhrVar5.zzf((zzhw) it2.next());
                                                    }
                                                } else {
                                                    i17 = i16;
                                                    i18 = i15;
                                                    str14 = str16;
                                                }
                                                i19 = i28;
                                                ((ArrayList) dVar3.f3527d).set(i19, (zzhs) zzhrVar5.zzbc());
                                                zzicVar3.zzg(zzhrVar5);
                                                i25 = i7 + 1;
                                                i23 = i18;
                                                z14 = z12;
                                            }
                                        }
                                        zzicVar3 = zzicVar;
                                        zzhrVar3 = zzhrVar5;
                                        i16 = i27;
                                        i15 = i7;
                                        if (zzhrVar5.zzb() == 0) {
                                        }
                                        i19 = i28;
                                        ((ArrayList) dVar3.f3527d).set(i19, (zzhs) zzhrVar5.zzbc());
                                        zzicVar3.zzg(zzhrVar5);
                                        i25 = i7 + 1;
                                        i23 = i18;
                                        z14 = z12;
                                    } else {
                                        zzicVar3 = zzicVar;
                                        i14 = i27;
                                        i15 = i26;
                                        i16 = i14;
                                        if (zzhrVar5.zzb() == 0) {
                                        }
                                        i19 = i28;
                                        ((ArrayList) dVar3.f3527d).set(i19, (zzhs) zzhrVar5.zzbc());
                                        zzicVar3.zzg(zzhrVar5);
                                        i25 = i7 + 1;
                                        i23 = i18;
                                        z14 = z12;
                                    }
                                }
                            }
                        }
                        str7 = str12;
                        int i36 = 0;
                        boolean z16 = false;
                        boolean z17 = false;
                        while (true) {
                            str8 = str13;
                            if (i36 >= zzhrVar5.zzb()) {
                                break;
                            }
                            if ("_c".equals(zzhrVar5.zzc(i36).zzb())) {
                                zzhv zzhvVar = (zzhv) zzhrVar5.zzc(i36).zzcl();
                                z13 = z14;
                                str10 = str15;
                                zzhvVar.zzf(1L);
                                zzhrVar5.zzd(i36, (zzhw) zzhvVar.zzbc());
                                i13 = 1;
                                z16 = true;
                            } else {
                                z13 = z14;
                                str10 = str15;
                                if ("_r".equals(zzhrVar5.zzc(i36).zzb())) {
                                    zzhv zzhvVar2 = (zzhv) zzhrVar5.zzc(i36).zzcl();
                                    zzhvVar2.zzf(1L);
                                    zzhrVar5.zzd(i36, (zzhw) zzhvVar2.zzbc());
                                    i13 = 1;
                                    z17 = true;
                                } else {
                                    i13 = 1;
                                }
                            }
                            i36 += i13;
                            str13 = str8;
                            str15 = str10;
                            z14 = z13;
                        }
                        z12 = z14;
                        str9 = str15;
                        if (!z16 && Z7) {
                            b().Q().b(c0646q0.m().a(zzhrVar5.zzk()), "Marking event as conversion");
                            zzhv zzn3 = zzhw.zzn();
                            zzn3.zzb("_c");
                            zzn3.zzf(1L);
                            zzhrVar5.zzg(zzn3);
                        }
                        if (!z17) {
                            b().Q().b(c0646q0.m().a(zzhrVar5.zzk()), "Marking event as real-time");
                            zzhv zzn4 = zzhw.zzn();
                            zzn4.zzb("_r");
                            zzn4.zzf(1L);
                            zzhrVar5.zzg(zzn4);
                        }
                        if (f0().P0(g(), ((zzid) dVar3.f3525b).zzA(), false, true, false, false).f11785e > d0().R(((zzid) dVar3.f3525b).zzA(), F.f11341p)) {
                            C(zzhrVar5, "_r");
                            z15 = z10;
                        } else {
                            z15 = true;
                        }
                        if (M1.H0(zzhrVar5.zzk()) && Z7 && f0().P0(g(), ((zzid) dVar3.f3525b).zzA(), true, false, false, false).f11783c > d0().R(((zzid) dVar3.f3525b).zzA(), F.f11339o)) {
                            b().O().b(W.R(((zzid) dVar3.f3525b).zzA()), "Too many conversions. Not logging as conversion. appId");
                            zzhv zzhvVar3 = null;
                            boolean z18 = false;
                            int i37 = -1;
                            for (int i38 = 0; i38 < zzhrVar5.zzb(); i38++) {
                                zzhw zzc2 = zzhrVar5.zzc(i38);
                                if ("_c".equals(zzc2.zzb())) {
                                    zzhvVar3 = (zzhv) zzc2.zzcl();
                                    i37 = i38;
                                } else if ("_err".equals(zzc2.zzb())) {
                                    z18 = true;
                                }
                            }
                            if (z18) {
                                if (zzhvVar3 != null) {
                                    zzhrVar5.zzj(i37);
                                } else {
                                    zzhvVar3 = null;
                                }
                            }
                            if (zzhvVar3 != null) {
                                zzhv zzhvVar4 = (zzhv) zzhvVar3.clone();
                                zzhvVar4.zzb("_err");
                                zzhvVar4.zzf(10L);
                                zzhrVar5.zzd(i37, (zzhw) zzhvVar4.zzbc());
                            } else {
                                b().N().b(W.R(((zzid) dVar3.f3525b).zzA()), "Did not find conversion parameter. appId");
                            }
                        }
                        if (Z7) {
                        }
                        if ("_e".equals(zzhrVar5.zzk())) {
                        }
                    }
                    i24 = i19 + 1;
                    i22 = i17;
                    str11 = str5;
                    str12 = str7;
                    str13 = str8;
                }
                zzic zzicVar4 = zzicVar;
                int i39 = i7;
                int i40 = 0;
                long j10 = 0;
                while (i40 < i39) {
                    zzhs zzd2 = zzicVar4.zzd(i40);
                    if ("_e".equals(zzd2.zzd())) {
                        i0();
                        if (C0598a0.R(zzd2, "_fr") != null) {
                            zzicVar4.zzj(i40);
                            i39--;
                            i40--;
                            i40++;
                        }
                    }
                    i0();
                    zzhw R10 = C0598a0.R(zzd2, "_et");
                    if (R10 != null) {
                        Long valueOf = R10.zze() ? Long.valueOf(R10.zzf()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j10 += valueOf.longValue();
                        }
                    }
                    i40++;
                }
                i110.H(zzicVar4, j10, false);
                Iterator it3 = zzicVar4.zzb().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((zzhs) it3.next()).zzd())) {
                        f0().D0(zzicVar4.zzK(), "_se");
                        break;
                    }
                }
                if (C0598a0.x0(zzicVar4, "_sid") >= 0) {
                    i110.H(zzicVar4, j10, true);
                } else {
                    int x02 = C0598a0.x0(zzicVar4, "_se");
                    if (x02 >= 0) {
                        zzicVar4.zzr(x02);
                        b().N().b(W.R(((zzid) dVar3.f3525b).zzA()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String zzA3 = ((zzid) dVar3.f3525b).zzA();
                c().J();
                k0();
                C0601b0 N02 = f0().N0(zzA3);
                if (N02 == null) {
                    b().N().b(W.R(zzA3), "Cannot fix consent fields without appInfo. appId");
                } else {
                    i110.m(N02, zzicVar4);
                }
                String zzA4 = ((zzid) dVar3.f3525b).zzA();
                c().J();
                k0();
                C0601b0 N03 = f0().N0(zzA4);
                if (N03 == null) {
                    b().O().b(W.R(zzA4), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    i110.n(N03, zzicVar4);
                }
                R(zzicVar4);
                zzicVar4.zzak();
                C0 c03 = C0.f11229c;
                C0 j11 = i110.a(((zzid) dVar3.f3525b).zzA()).j(C0.c(100, ((zzid) dVar3.f3525b).zzaf()));
                C0 s02 = f0().s0(((zzid) dVar3.f3525b).zzA());
                f0().r0(((zzid) dVar3.f3525b).zzA(), j11);
                B0 b02 = B0.ANALYTICS_STORAGE;
                if (!j11.i(b02) && s02.i(b02)) {
                    f0().B0(((zzid) dVar3.f3525b).zzA());
                } else if (j11.i(b02) && !s02.i(b02)) {
                    f0().C0(((zzid) dVar3.f3525b).zzA());
                }
                B0 b03 = B0.AD_STORAGE;
                if (!j11.i(b03)) {
                    zzicVar4.zzR();
                    zzicVar4.zzU();
                    zzicVar4.zzan();
                }
                if (!j11.i(b02)) {
                    zzicVar4.zzX();
                    zzicVar4.zzav();
                }
                zzql.zza();
                if (d0().T(((zzid) dVar3.f3525b).zzA(), F.f11283P0)) {
                    j0();
                    if (M1.f0(((zzid) dVar3.f3525b).zzA()) && i110.a(((zzid) dVar3.f3525b).zzA()).i(b03) && ((zzid) dVar3.f3525b).zzak()) {
                        int i41 = 0;
                        while (i41 < zzicVar4.zzc()) {
                            zzhr zzhrVar8 = (zzhr) zzicVar4.zzd(i41).zzcl();
                            Iterator it4 = zzhrVar8.zza().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    c02 = j11;
                                    c0646q04 = c0646q0;
                                    break;
                                }
                                if ("_c".equals(((zzhw) it4.next()).zzb())) {
                                    if (((zzid) dVar3.f3525b).zzar() >= d0().R(((zzid) dVar3.f3525b).zzA(), F.f11334l0)) {
                                        int R11 = d0().R(((zzid) dVar3.f3525b).zzA(), F.f11360y0);
                                        LinkedList linkedList = i110.f11384E;
                                        if (R11 > 0) {
                                            c02 = j11;
                                            c0646q04 = c0646q0;
                                            if (f0().P0(g(), ((zzid) dVar3.f3525b).zzA(), false, false, false, true).g > R11) {
                                                zzhv zzn5 = zzhw.zzn();
                                                zzn5.zzb("_tnr");
                                                zzn5.zzf(1L);
                                                zzhrVar8.zzf((zzhw) zzn5.zzbc());
                                            } else {
                                                if (d0().T(((zzid) dVar3.f3525b).zzA(), F.f11287R0)) {
                                                    str4 = j0().B0();
                                                    zzhv zzn6 = zzhw.zzn();
                                                    zzn6.zzb("_tu");
                                                    zzn6.zzd(str4);
                                                    zzhrVar8.zzf((zzhw) zzn6.zzbc());
                                                } else {
                                                    str4 = null;
                                                }
                                                zzhv zzn7 = zzhw.zzn();
                                                zzn7.zzb("_tr");
                                                zzn7.zzf(1L);
                                                zzhrVar8.zzf((zzhw) zzn7.zzbc());
                                                x1 k02 = i0().k0(((zzid) dVar3.f3525b).zzA(), zzicVar4, zzhrVar8, str4);
                                                if (k02 != null) {
                                                    b().Q().c("Generated trigger URI. appId, uri", ((zzid) dVar3.f3525b).zzA(), k02.f11993a);
                                                    f0().p0(((zzid) dVar3.f3525b).zzA(), k02);
                                                    if (!linkedList.contains(((zzid) dVar3.f3525b).zzA())) {
                                                        linkedList.add(((zzid) dVar3.f3525b).zzA());
                                                    }
                                                }
                                            }
                                        } else {
                                            c02 = j11;
                                            c0646q04 = c0646q0;
                                            if (d0().T(((zzid) dVar3.f3525b).zzA(), F.f11287R0)) {
                                                str3 = j0().B0();
                                                zzhv zzn8 = zzhw.zzn();
                                                zzn8.zzb("_tu");
                                                zzn8.zzd(str3);
                                                zzhrVar8.zzf((zzhw) zzn8.zzbc());
                                            } else {
                                                str3 = null;
                                            }
                                            zzhv zzn9 = zzhw.zzn();
                                            zzn9.zzb("_tr");
                                            zzn9.zzf(1L);
                                            zzhrVar8.zzf((zzhw) zzn9.zzbc());
                                            x1 k03 = i0().k0(((zzid) dVar3.f3525b).zzA(), zzicVar4, zzhrVar8, str3);
                                            if (k03 != null) {
                                                b().Q().c("Generated trigger URI. appId, uri", ((zzid) dVar3.f3525b).zzA(), k03.f11993a);
                                                f0().p0(((zzid) dVar3.f3525b).zzA(), k03);
                                                if (!linkedList.contains(((zzid) dVar3.f3525b).zzA())) {
                                                    linkedList.add(((zzid) dVar3.f3525b).zzA());
                                                }
                                            }
                                        }
                                    } else {
                                        c02 = j11;
                                        c0646q04 = c0646q0;
                                    }
                                    zzicVar4.zze(i41, (zzhs) zzhrVar8.zzbc());
                                } else {
                                    i110 = this;
                                }
                            }
                            i41++;
                            i110 = this;
                            c0646q0 = c0646q04;
                            j11 = c02;
                        }
                    }
                }
                C0646q0 c0646q05 = c0646q0;
                zzicVar4.zzag();
                zzicVar4.zzaf(h0().N(zzicVar4.zzK(), zzicVar4.zzb(), zzicVar4.zzk(), Long.valueOf(zzicVar4.zzu()), Long.valueOf(zzicVar4.zzw()), !j11.i(b02)));
                if (d0().L(((zzid) dVar3.f3525b).zzA())) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList5 = new ArrayList();
                    SecureRandom G02 = j0().G0();
                    int i42 = 0;
                    while (i42 < zzicVar4.zzc()) {
                        zzhr zzhrVar9 = (zzhr) zzicVar4.zzd(i42).zzcl();
                        if (zzhrVar9.zzk().equals("_ep")) {
                            i0();
                            String str19 = (String) C0598a0.S((zzhs) zzhrVar9.zzbc(), "_en");
                            C0645q c0645q = (C0645q) hashMap.get(str19);
                            if (c0645q == null) {
                                C0633m f02 = f0();
                                String zzA5 = ((zzid) dVar3.f3525b).zzA();
                                com.google.android.gms.common.internal.G.g(str19);
                                c0645q = f02.j0("events", zzA5, str19);
                                if (c0645q != null) {
                                    hashMap.put(str19, c0645q);
                                }
                            }
                            if (c0645q != null && c0645q.f11888i == null) {
                                Long l11 = c0645q.j;
                                if (l11 != null && l11.longValue() > 1) {
                                    i0();
                                    C0598a0.P(zzhrVar9, "_sr", l11);
                                }
                                Boolean bool = c0645q.k;
                                if (bool != null && bool.booleanValue()) {
                                    i0();
                                    C0598a0.P(zzhrVar9, "_efs", 1L);
                                }
                                arrayList5.add((zzhs) zzhrVar9.zzbc());
                            }
                            zzicVar4.zzf(i42, zzhrVar9);
                            arrayList = arrayList5;
                            secureRandom = G02;
                            i11 = i42;
                            dVar2 = dVar3;
                            c0646q03 = c0646q05;
                            i12 = 1;
                        } else {
                            C0628k0 e02 = e0();
                            String zzA6 = ((zzid) dVar3.f3525b).zzA();
                            String a9 = e02.a(zzA6, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(a9)) {
                                try {
                                    parseLong = Long.parseLong(a9);
                                } catch (NumberFormatException e2) {
                                    ((C0646q0) e02.f3094a).b().O().c("Unable to parse timezone offset. appId", W.R(zzA6), e2);
                                }
                                j0();
                                long j12 = parseLong * 60000;
                                long zzn10 = (j12 + zzhrVar9.zzn()) / 86400000;
                                zzhs zzhsVar = (zzhs) zzhrVar9.zzbc();
                                Long l12 = 1L;
                                c0646q03 = c0646q05;
                                if (!TextUtils.isEmpty("_dbg")) {
                                    Iterator it5 = zzhsVar.zza().iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            break;
                                        }
                                        zzhw zzhwVar2 = (zzhw) it5.next();
                                        Iterator it6 = it5;
                                        if (!"_dbg".equals(zzhwVar2.zzb())) {
                                            it5 = it6;
                                        } else if (l12.equals(Long.valueOf(zzhwVar2.zzf()))) {
                                            str2 = "_efs";
                                            a02 = 1;
                                        }
                                    }
                                }
                                str2 = "_efs";
                                a02 = e0().a0(((zzid) dVar3.f3525b).zzA(), zzhrVar9.zzk());
                                if (a02 > 0) {
                                    b().O().c("Sample rate must be positive. event, rate", zzhrVar9.zzk(), Integer.valueOf(a02));
                                    arrayList5.add((zzhs) zzhrVar9.zzbc());
                                    zzicVar4.zzf(i42, zzhrVar9);
                                } else {
                                    C0645q c0645q2 = (C0645q) hashMap.get(zzhrVar9.zzk());
                                    if (c0645q2 == null) {
                                        l10 = l12;
                                        c0645q2 = f0().j0("events", ((zzid) dVar3.f3525b).zzA(), zzhrVar9.zzk());
                                        if (c0645q2 == null) {
                                            b().O().c("Event being bundled has no eventAggregate. appId, eventName", ((zzid) dVar3.f3525b).zzA(), zzhrVar9.zzk());
                                            c0645q2 = new C0645q(((zzid) dVar3.f3525b).zzA(), zzhrVar9.zzk(), 1L, 1L, 1L, zzhrVar9.zzn(), 0L, null, null, null, null);
                                        }
                                    } else {
                                        l10 = l12;
                                    }
                                    i0();
                                    Long l13 = (Long) C0598a0.S((zzhs) zzhrVar9.zzbc(), "_eid");
                                    boolean z19 = l13 != null;
                                    if (a02 == 1) {
                                        arrayList5.add((zzhs) zzhrVar9.zzbc());
                                        if (z19 && (c0645q2.f11888i != null || c0645q2.j != null || c0645q2.k != null)) {
                                            hashMap.put(zzhrVar9.zzk(), c0645q2.b(null, null, null));
                                        }
                                        zzicVar4.zzf(i42, zzhrVar9);
                                    } else {
                                        if (G02.nextInt(a02) == 0) {
                                            i0();
                                            Long valueOf2 = Long.valueOf(a02);
                                            C0598a0.P(zzhrVar9, "_sr", valueOf2);
                                            arrayList5.add((zzhs) zzhrVar9.zzbc());
                                            if (z19) {
                                                c0645q2 = c0645q2.b(null, valueOf2, null);
                                            }
                                            try {
                                                secureRandom = G02;
                                                dVar2 = dVar3;
                                                zzicVar2 = zzicVar4;
                                                i10 = i42;
                                                zzhrVar2 = zzhrVar9;
                                                arrayList = arrayList5;
                                                hashMap = hashMap;
                                                hashMap.put(zzhrVar9.zzk(), new C0645q(c0645q2.f11881a, c0645q2.f11882b, c0645q2.f11883c, c0645q2.f11884d, c0645q2.f11885e, c0645q2.f11886f, zzhrVar9.zzn(), Long.valueOf(zzn10), c0645q2.f11888i, c0645q2.j, c0645q2.k));
                                            } catch (Throwable th2) {
                                                th = th2;
                                                th = th;
                                                f0().z0();
                                                throw th;
                                            }
                                        } else {
                                            arrayList = arrayList5;
                                            secureRandom = G02;
                                            i10 = i42;
                                            dVar2 = dVar3;
                                            zzicVar2 = zzicVar4;
                                            Long l14 = c0645q2.f11887h;
                                            if (l14 != null) {
                                                zzp = l14.longValue();
                                            } else {
                                                j0();
                                                zzp = (j12 + zzhrVar9.zzp()) / 86400000;
                                            }
                                            if (zzp != zzn10) {
                                                i0();
                                                C0598a0.P(zzhrVar9, str2, l10);
                                                i0();
                                                Long valueOf3 = Long.valueOf(a02);
                                                C0598a0.P(zzhrVar9, "_sr", valueOf3);
                                                arrayList.add((zzhs) zzhrVar9.zzbc());
                                                if (z19) {
                                                    c0645q2 = c0645q2.b(null, valueOf3, Boolean.TRUE);
                                                }
                                                try {
                                                    arrayList = arrayList;
                                                    zzhrVar2 = zzhrVar9;
                                                    hashMap = hashMap;
                                                    hashMap.put(zzhrVar9.zzk(), new C0645q(c0645q2.f11881a, c0645q2.f11882b, c0645q2.f11883c, c0645q2.f11884d, c0645q2.f11885e, c0645q2.f11886f, zzhrVar9.zzn(), Long.valueOf(zzn10), c0645q2.f11888i, c0645q2.j, c0645q2.k));
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    th = th;
                                                    f0().z0();
                                                    throw th;
                                                }
                                            } else {
                                                if (z19) {
                                                    hashMap.put(zzhrVar9.zzk(), c0645q2.b(l13, null, null));
                                                }
                                                zzicVar4 = zzicVar2;
                                                i11 = i10;
                                                zzhrVar = zzhrVar9;
                                                zzicVar4.zzf(i11, zzhrVar);
                                                i12 = 1;
                                            }
                                        }
                                        zzicVar4 = zzicVar2;
                                        i11 = i10;
                                        zzhrVar = zzhrVar2;
                                        zzicVar4.zzf(i11, zzhrVar);
                                        i12 = 1;
                                    }
                                }
                                arrayList = arrayList5;
                                secureRandom = G02;
                                i11 = i42;
                                dVar2 = dVar3;
                                i12 = 1;
                            }
                            parseLong = 0;
                            j0();
                            long j122 = parseLong * 60000;
                            long zzn102 = (j122 + zzhrVar9.zzn()) / 86400000;
                            zzhs zzhsVar2 = (zzhs) zzhrVar9.zzbc();
                            Long l122 = 1L;
                            c0646q03 = c0646q05;
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            str2 = "_efs";
                            a02 = e0().a0(((zzid) dVar3.f3525b).zzA(), zzhrVar9.zzk());
                            if (a02 > 0) {
                            }
                            arrayList = arrayList5;
                            secureRandom = G02;
                            i11 = i42;
                            dVar2 = dVar3;
                            i12 = 1;
                        }
                        i42 = i11 + i12;
                        c0646q05 = c0646q03;
                        G02 = secureRandom;
                        dVar3 = dVar2;
                        arrayList5 = arrayList;
                    }
                    ArrayList arrayList6 = arrayList5;
                    E3.d dVar4 = dVar3;
                    c0646q02 = c0646q05;
                    z11 = true;
                    if (arrayList6.size() < zzicVar4.zzc()) {
                        zzicVar4.zzi();
                        zzicVar4.zzh(arrayList6);
                    }
                    Iterator it7 = hashMap.entrySet().iterator();
                    while (it7.hasNext()) {
                        f0().k0("events", (C0645q) ((Map.Entry) it7.next()).getValue());
                    }
                    dVar = dVar4;
                } else {
                    c0646q02 = c0646q05;
                    z11 = true;
                    dVar = dVar3;
                }
                String zzA7 = ((zzid) dVar.f3525b).zzA();
                C0601b0 N04 = f0().N0(zzA7);
                if (N04 == null) {
                    b().N().b(W.R(((zzid) dVar.f3525b).zzA()), "Bundling raw events w/o app info. appId");
                } else if (zzicVar4.zzc() > 0) {
                    try {
                        C0640o0 c0640o0 = N04.f11653a.f11913u;
                        C0646q0.l(c0640o0);
                        c0640o0.J();
                        long j13 = N04.f11660i;
                        if (j13 != 0) {
                            zzicVar4.zzA(j13);
                        } else {
                            zzicVar4.zzB();
                        }
                        try {
                            C0640o0 c0640o02 = N04.f11653a.f11913u;
                            C0646q0.l(c0640o02);
                            c0640o02.J();
                            long j14 = N04.f11659h;
                            if (j14 != 0) {
                                j13 = j14;
                            }
                            if (j13 != 0) {
                                zzicVar4.zzy(j13);
                            } else {
                                zzicVar4.zzz();
                            }
                            N04.h(zzicVar4.zzc());
                            try {
                                C0640o0 c0640o03 = N04.f11653a.f11913u;
                                C0646q0.l(c0640o03);
                                c0640o03.J();
                                zzicVar4.zzaJ((int) N04.f11640F);
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    try {
                        C0640o0 c0640o04 = N04.f11653a.f11913u;
                        C0646q0.l(c0640o04);
                        c0640o04.J();
                        zzicVar4.zzZ((int) N04.g);
                        N04.L(zzicVar4.zzu());
                        N04.M(zzicVar4.zzw());
                        String u3 = N04.u();
                        if (u3 != null) {
                            zzicVar4.zzaa(u3);
                        } else {
                            zzicVar4.zzab();
                        }
                        f0().O0(N04, false);
                    } catch (Throwable th7) {
                        th = th7;
                        th = th;
                        f0().z0();
                        throw th;
                    }
                }
                if (zzicVar4.zzc() > 0) {
                    c0646q02.getClass();
                    zzgl V7 = e0().V(((zzid) dVar.f3525b).zzA());
                    if (V7 != null && V7.zza()) {
                        zzicVar4.zzal(V7.zzb());
                        f0().S0((zzid) zzicVar4.zzbc(), z10);
                    }
                    if (((zzid) dVar.f3525b).zzP().isEmpty()) {
                        zzicVar4.zzal(-1L);
                    } else {
                        b().O().b(W.R(((zzid) dVar.f3525b).zzA()), "Did not find measurement config or missing version info. appId");
                    }
                    f0().S0((zzid) zzicVar4.zzbc(), z10);
                }
                f0().Z((ArrayList) dVar.f3526c);
                f0().a0(zzA7);
                f0().y0();
                z8 = z11;
            }
            f0().z0();
            return z8;
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public final void H(zzic zzicVar, long j, boolean z8) {
        L1 l12;
        Object obj;
        String str = true != z8 ? "_lte" : "_se";
        C0633m c0633m = this.f11405c;
        S(c0633m);
        L1 F02 = c0633m.F0(zzicVar.zzK(), str);
        if (F02 == null || (obj = F02.f11445e) == null) {
            String zzK = zzicVar.zzK();
            ((M5.b) e()).getClass();
            l12 = new L1(zzK, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String zzK2 = zzicVar.zzK();
            ((M5.b) e()).getClass();
            l12 = new L1(zzK2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        zzit zzm = zziu.zzm();
        zzm.zzb(str);
        ((M5.b) e()).getClass();
        zzm.zza(System.currentTimeMillis());
        Object obj2 = l12.f11445e;
        zzm.zze(((Long) obj2).longValue());
        zziu zziuVar = (zziu) zzm.zzbc();
        int x02 = C0598a0.x0(zzicVar, str);
        if (x02 >= 0) {
            zzicVar.zzn(x02, zziuVar);
        } else {
            zzicVar.zzo(zziuVar);
        }
        if (j > 0) {
            C0633m c0633m2 = this.f11405c;
            S(c0633m2);
            c0633m2.E0(l12);
            b().f11573B.c("Updated engagement user property. scope, value", true != z8 ? "lifetime" : "session-scoped", obj2);
        }
    }

    public final boolean I(zzhr zzhrVar, zzhr zzhrVar2) {
        com.google.android.gms.common.internal.G.b("_e".equals(zzhrVar.zzk()));
        i0();
        zzhw R10 = C0598a0.R((zzhs) zzhrVar.zzbc(), "_sc");
        String zzd = R10 == null ? null : R10.zzd();
        i0();
        zzhw R11 = C0598a0.R((zzhs) zzhrVar2.zzbc(), "_pc");
        String zzd2 = R11 != null ? R11.zzd() : null;
        if (zzd2 == null || !zzd2.equals(zzd)) {
            return false;
        }
        com.google.android.gms.common.internal.G.b("_e".equals(zzhrVar.zzk()));
        i0();
        zzhw R12 = C0598a0.R((zzhs) zzhrVar.zzbc(), "_et");
        if (R12 == null || !R12.zze() || R12.zzf() <= 0) {
            return true;
        }
        long zzf = R12.zzf();
        i0();
        zzhw R13 = C0598a0.R((zzhs) zzhrVar2.zzbc(), "_et");
        if (R13 != null && R13.zzf() > 0) {
            zzf += R13.zzf();
        }
        i0();
        C0598a0.P(zzhrVar2, "_et", Long.valueOf(zzf));
        i0();
        C0598a0.P(zzhrVar, "_fr", 1L);
        return true;
    }

    public final boolean J() {
        c().J();
        k0();
        C0633m c0633m = this.f11405c;
        S(c0633m);
        if (c0633m.f0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        C0633m c0633m2 = this.f11405c;
        S(c0633m2);
        return !TextUtils.isEmpty(c0633m2.R());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        boolean z8;
        long max;
        long max2;
        long j;
        long j10;
        c().J();
        k0();
        if (this.f11382C > 0) {
            ((M5.b) e()).getClass();
            long abs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.f11382C);
            if (abs > 0) {
                W b2 = b();
                b2.f11573B.b(Long.valueOf(abs), "Upload has been suspended. Will update scheduling later in approximately ms");
                g0().a();
                y1 y1Var = this.f11407e;
                S(y1Var);
                y1Var.N();
                return;
            }
            this.f11382C = 0L;
        }
        if (!this.f11414z.h() || !J()) {
            b().f11573B.a("Nothing to upload or uploading impossible");
            g0().a();
            y1 y1Var2 = this.f11407e;
            S(y1Var2);
            y1Var2.N();
            return;
        }
        ((M5.b) e()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        d0();
        Object obj = null;
        long max3 = Math.max(0L, ((Long) F.f11280O.a(null)).longValue());
        C0633m c0633m = this.f11405c;
        S(c0633m);
        if (c0633m.f0("select count(1) > 0 from raw_events where realtime = 1", null) == 0) {
            C0633m c0633m2 = this.f11405c;
            S(c0633m2);
            if (c0633m2.f0("select count(1) > 0 from queue where has_realtime = 1", null) == 0) {
                z8 = false;
                if (z8) {
                    d0();
                    max = Math.max(0L, ((Long) F.f11267H.a(null)).longValue());
                } else {
                    String N10 = d0().N("debug.firebase.analytics.app");
                    if (TextUtils.isEmpty(N10) || ".none.".equals(N10)) {
                        d0();
                        max = Math.max(0L, ((Long) F.f11269I.a(null)).longValue());
                    } else {
                        d0();
                        max = Math.max(0L, ((Long) F.f11271J.a(null)).longValue());
                    }
                }
                long f4 = this.f11411w.f11854v.f();
                long f10 = this.f11411w.f11855w.f();
                C0633m c0633m3 = this.f11405c;
                S(c0633m3);
                long g02 = c0633m3.g0("select max(bundle_end_timestamp) from queue", null, 0L);
                C0633m c0633m4 = this.f11405c;
                S(c0633m4);
                long j11 = max;
                max2 = Math.max(g02, c0633m4.g0("select max(timestamp) from raw_events", null, 0L));
                C0598a0 c0598a0 = this.f11409u;
                if (max2 != 0) {
                    long abs2 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                    long abs3 = currentTimeMillis - Math.abs(f4 - currentTimeMillis);
                    long abs4 = currentTimeMillis - Math.abs(f10 - currentTimeMillis);
                    j = max3 + abs2;
                    long max4 = Math.max(abs3, abs4);
                    if (z8 && max4 > 0) {
                        j = Math.min(abs2, max4) + j11;
                    }
                    S(c0598a0);
                    if (!c0598a0.t0(max4, j11)) {
                        j = max4 + j11;
                    }
                    if (abs4 != 0 && abs4 >= abs2) {
                        int i7 = 0;
                        while (true) {
                            d0();
                            if (i7 >= Math.min(20, Math.max(0, ((Integer) F.f11284Q.a(obj)).intValue()))) {
                                break;
                            }
                            d0();
                            j += Math.max(0L, ((Long) F.f11282P.a(obj)).longValue()) * (1 << i7);
                            if (j > abs4) {
                                break;
                            }
                            i7++;
                            obj = null;
                        }
                    }
                    j10 = 0;
                    if (j == j10) {
                        b().f11573B.a("Next upload time is 0");
                        g0().a();
                        y1 y1Var3 = this.f11407e;
                        S(y1Var3);
                        y1Var3.N();
                        return;
                    }
                    C0598a0 c0598a02 = this.f11404b;
                    S(c0598a02);
                    if (!c0598a02.d0()) {
                        b().f11573B.a("No network");
                        C0604c0 g03 = g0();
                        I1 i12 = g03.f11683a;
                        i12.k0();
                        i12.c().J();
                        if (!g03.f11684b) {
                            i12.f11414z.f11907a.registerReceiver(g03, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            C0598a0 c0598a03 = i12.f11404b;
                            S(c0598a03);
                            g03.f11685c = c0598a03.d0();
                            W b10 = i12.b();
                            b10.f11573B.b(Boolean.valueOf(g03.f11685c), "Registering connectivity change receiver. Network connected");
                            g03.f11684b = true;
                        }
                        y1 y1Var4 = this.f11407e;
                        S(y1Var4);
                        y1Var4.N();
                        return;
                    }
                    long f11 = this.f11411w.f11853u.f();
                    d0();
                    long max5 = Math.max(0L, ((Long) F.f11265G.a(null)).longValue());
                    S(c0598a0);
                    if (!c0598a0.t0(f11, max5)) {
                        j = Math.max(j, f11 + max5);
                    }
                    g0().a();
                    ((M5.b) e()).getClass();
                    long currentTimeMillis2 = j - System.currentTimeMillis();
                    if (currentTimeMillis2 <= 0) {
                        d0();
                        currentTimeMillis2 = Math.max(0L, ((Long) F.f11273K.a(null)).longValue());
                        C0610e0 c0610e0 = this.f11411w.f11854v;
                        ((M5.b) e()).getClass();
                        c0610e0.g(System.currentTimeMillis());
                    }
                    W b11 = b();
                    b11.f11573B.b(Long.valueOf(currentTimeMillis2), "Upload scheduled in approximately ms");
                    y1 y1Var5 = this.f11407e;
                    S(y1Var5);
                    y1Var5.K();
                    C0646q0 c0646q0 = (C0646q0) y1Var5.f3094a;
                    c0646q0.getClass();
                    Context context = c0646q0.f11907a;
                    boolean z02 = M1.z0(context);
                    W w10 = c0646q0.f11912f;
                    if (!z02) {
                        C0646q0.l(w10);
                        w10.f11572A.a("Receiver not registered/enabled");
                    }
                    if (!M1.c0(context)) {
                        C0646q0.l(w10);
                        w10.f11572A.a("Service not registered/enabled");
                    }
                    y1Var5.N();
                    C0646q0.l(w10);
                    w10.f11573B.b(Long.valueOf(currentTimeMillis2), "Scheduling upload, millis");
                    c0646q0.f11917y.getClass();
                    SystemClock.elapsedRealtime();
                    if (currentTimeMillis2 < Math.max(0L, ((Long) F.L.a(null)).longValue()) && y1Var5.O().f11845c == 0) {
                        y1Var5.O().b(currentTimeMillis2);
                    }
                    ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
                    int Q3 = y1Var5.Q();
                    PersistableBundle persistableBundle = new PersistableBundle();
                    persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                    zzch.zza(context, new JobInfo.Builder(Q3, componentName).setMinimumLatency(currentTimeMillis2).setOverrideDeadline(currentTimeMillis2 + currentTimeMillis2).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
                    return;
                }
                j10 = 0;
                j = 0;
                if (j == j10) {
                }
            }
        }
        z8 = true;
        if (z8) {
        }
        long f42 = this.f11411w.f11854v.f();
        long f102 = this.f11411w.f11855w.f();
        C0633m c0633m32 = this.f11405c;
        S(c0633m32);
        long g022 = c0633m32.g0("select max(bundle_end_timestamp) from queue", null, 0L);
        C0633m c0633m42 = this.f11405c;
        S(c0633m42);
        long j112 = max;
        max2 = Math.max(g022, c0633m42.g0("select max(timestamp) from raw_events", null, 0L));
        C0598a0 c0598a04 = this.f11409u;
        if (max2 != 0) {
        }
        j10 = 0;
        j = 0;
        if (j == j10) {
        }
    }

    public final void M() {
        c().J();
        if (this.f11387H || this.f11388I || this.f11389J) {
            W b2 = b();
            b2.f11573B.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f11387H), Boolean.valueOf(this.f11388I), Boolean.valueOf(this.f11389J));
            return;
        }
        b().f11573B.a("Stopping uploading service(s)");
        ArrayList arrayList = this.f11383D;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.f11383D;
        com.google.android.gms.common.internal.G.g(arrayList2);
        arrayList2.clear();
    }

    public final Boolean N(C0601b0 c0601b0) {
        try {
            long P10 = c0601b0.P();
            C0646q0 c0646q0 = this.f11414z;
            if (P10 != -2147483648L) {
                if (c0601b0.P() == O5.c.a(c0646q0.f11907a).h(0, c0601b0.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = O5.c.a(c0646q0.f11907a).h(0, c0601b0.D()).versionName;
                String N10 = c0601b0.N();
                if (N10 != null && N10.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final O1 O(String str) {
        C0633m c0633m = this.f11405c;
        S(c0633m);
        C0601b0 N02 = c0633m.N0(str);
        if (N02 == null || TextUtils.isEmpty(N02.N())) {
            b().f11572A.b(str, "No app data available; dropping");
            return null;
        }
        Boolean N10 = N(N02);
        if (N10 != null && !N10.booleanValue()) {
            W b2 = b();
            b2.f11577f.b(W.R(str), "App version does not match; dropping. appId");
            return null;
        }
        String G9 = N02.G();
        String N11 = N02.N();
        long P10 = N02.P();
        C0646q0 c0646q0 = N02.f11653a;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        String str2 = N02.f11661l;
        C0640o0 c0640o02 = c0646q0.f11913u;
        C0646q0.l(c0640o02);
        c0640o02.J();
        long j = N02.f11662m;
        C0640o0 c0640o03 = c0646q0.f11913u;
        C0646q0.l(c0640o03);
        c0640o03.J();
        long j10 = N02.f11663n;
        C0640o0 c0640o04 = c0646q0.f11913u;
        C0646q0.l(c0640o04);
        c0640o04.J();
        boolean z8 = N02.f11664o;
        String J10 = N02.J();
        C0640o0 c0640o05 = c0646q0.f11913u;
        C0646q0.l(c0640o05);
        c0640o05.J();
        boolean z10 = N02.f11665p;
        Boolean w10 = N02.w();
        long b10 = N02.b();
        C0640o0 c0640o06 = c0646q0.f11913u;
        C0646q0.l(c0640o06);
        c0640o06.J();
        ArrayList arrayList = N02.f11668s;
        String g = a(str).g();
        boolean y10 = N02.y();
        C0640o0 c0640o07 = c0646q0.f11913u;
        C0646q0.l(c0640o07);
        c0640o07.J();
        long j11 = N02.f11671v;
        C0 a9 = a(str);
        String str3 = n0(str).f11859b;
        C0640o0 c0640o08 = c0646q0.f11913u;
        C0646q0.l(c0640o08);
        c0640o08.J();
        int i7 = N02.f11673x;
        C0640o0 c0640o09 = c0646q0.f11913u;
        C0646q0.l(c0640o09);
        c0640o09.J();
        return new O1(str, G9, N11, P10, str2, j, j10, (String) null, z8, false, J10, 0L, 0, z10, false, w10, b10, (List) arrayList, g, "", (String) null, y10, j11, a9.f11231b, str3, i7, N02.f11636B, N02.C(), N02.s(), 0L, N02.t());
    }

    public final boolean P(String str, String str2) {
        C0633m c0633m = this.f11405c;
        S(c0633m);
        C0645q j02 = c0633m.j0("events", str, str2);
        return j02 == null || j02.f11883c < 1;
    }

    public final void U(K1 k12, O1 o12) {
        long j;
        c().J();
        k0();
        if (Q(o12)) {
            if (!o12.f11513v) {
                a0(o12);
                return;
            }
            M1 j02 = j0();
            String str = k12.f11429b;
            int O02 = j02.O0(str);
            R7.b bVar = this.f11402X;
            if (O02 != 0) {
                j0();
                d0();
                String O10 = M1.O(str, 24, true);
                int length = str != null ? str.length() : 0;
                j0();
                M1.Z(bVar, o12.f11506a, O02, "_ev", O10, length);
                return;
            }
            int W10 = j0().W(k12.t(), str);
            if (W10 != 0) {
                j0();
                d0();
                String O11 = M1.O(str, 24, true);
                Object t5 = k12.t();
                int length2 = (t5 == null || !((t5 instanceof String) || (t5 instanceof CharSequence))) ? 0 : t5.toString().length();
                j0();
                M1.Z(bVar, o12.f11506a, W10, "_ev", O11, length2);
                return;
            }
            Object X10 = j0().X(k12.t(), str);
            if (X10 != null) {
                boolean equals = "_sid".equals(str);
                String str2 = o12.f11506a;
                if (equals) {
                    com.google.android.gms.common.internal.G.g(str2);
                    C0633m c0633m = this.f11405c;
                    S(c0633m);
                    L1 F02 = c0633m.F0(str2, "_sno");
                    if (F02 != null) {
                        Object obj = F02.f11445e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            U(new K1(k12.f11430c, Long.valueOf(j + 1), "_sno", k12.f11433f), o12);
                        }
                    }
                    if (F02 != null) {
                        b().f11580w.b(F02.f11445e, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    C0633m c0633m2 = this.f11405c;
                    S(c0633m2);
                    C0645q j03 = c0633m2.j0("events", str2, "_s");
                    if (j03 != null) {
                        W b2 = b();
                        long j10 = j03.f11883c;
                        b2.f11573B.b(Long.valueOf(j10), "Backfill the session number. Last used session number");
                        j = j10;
                    } else {
                        j = 0;
                    }
                    U(new K1(k12.f11430c, Long.valueOf(j + 1), "_sno", k12.f11433f), o12);
                }
                com.google.android.gms.common.internal.G.g(str2);
                String str3 = k12.f11433f;
                com.google.android.gms.common.internal.G.g(str3);
                L1 l12 = new L1(str2, str3, str, k12.f11430c, X10);
                W b10 = b();
                C0646q0 c0646q0 = this.f11414z;
                Q q10 = c0646q0.f11916x;
                String str4 = l12.f11443c;
                b10.f11573B.c("Setting user property", q10.c(str4), X10);
                C0633m c0633m3 = this.f11405c;
                S(c0633m3);
                c0633m3.x0();
                try {
                    boolean equals2 = "_id".equals(str4);
                    Object obj2 = l12.f11445e;
                    if (equals2) {
                        C0633m c0633m4 = this.f11405c;
                        S(c0633m4);
                        L1 F03 = c0633m4.F0(str2, "_id");
                        if (F03 != null && !obj2.equals(F03.f11445e)) {
                            C0633m c0633m5 = this.f11405c;
                            S(c0633m5);
                            c0633m5.D0(str2, "_lair");
                        }
                    }
                    a0(o12);
                    C0633m c0633m6 = this.f11405c;
                    S(c0633m6);
                    boolean E02 = c0633m6.E0(l12);
                    if ("_sid".equals(str)) {
                        C0598a0 c0598a0 = this.f11409u;
                        S(c0598a0);
                        String str5 = o12.f11496I;
                        long u02 = TextUtils.isEmpty(str5) ? 0L : c0598a0.u0(str5.getBytes(Charset.forName("UTF-8")));
                        C0633m c0633m7 = this.f11405c;
                        S(c0633m7);
                        C0601b0 N02 = c0633m7.N0(str2);
                        if (N02 != null) {
                            N02.A(u02);
                            if (N02.o()) {
                                C0633m c0633m8 = this.f11405c;
                                S(c0633m8);
                                c0633m8.O0(N02, false);
                            }
                        }
                    }
                    C0633m c0633m9 = this.f11405c;
                    S(c0633m9);
                    c0633m9.y0();
                    if (!E02) {
                        b().f11577f.c("Too many unique user properties are set. Ignoring user property", c0646q0.f11916x.c(str4), obj2);
                        j0();
                        M1.Z(bVar, str2, 9, null, null, 0);
                    }
                    C0633m c0633m10 = this.f11405c;
                    S(c0633m10);
                    c0633m10.z0();
                } catch (Throwable th) {
                    C0633m c0633m11 = this.f11405c;
                    S(c0633m11);
                    c0633m11.z0();
                    throw th;
                }
            }
        }
    }

    public final void V(String str, O1 o12) {
        c().J();
        k0();
        if (Q(o12)) {
            if (!o12.f11513v) {
                a0(o12);
                return;
            }
            Boolean T10 = T(o12);
            if ("_npa".equals(str) && T10 != null) {
                b().f11572A.a("Falling back to manifest metadata value for ad personalization");
                ((M5.b) e()).getClass();
                U(new K1(System.currentTimeMillis(), Long.valueOf(true != T10.booleanValue() ? 0L : 1L), "_npa", "auto"), o12);
                return;
            }
            W b2 = b();
            C0646q0 c0646q0 = this.f11414z;
            b2.f11572A.b(c0646q0.f11916x.c(str), "Removing user property");
            C0633m c0633m = this.f11405c;
            S(c0633m);
            c0633m.x0();
            try {
                a0(o12);
                boolean equals = "_id".equals(str);
                String str2 = o12.f11506a;
                if (equals) {
                    C0633m c0633m2 = this.f11405c;
                    S(c0633m2);
                    com.google.android.gms.common.internal.G.g(str2);
                    c0633m2.D0(str2, "_lair");
                }
                C0633m c0633m3 = this.f11405c;
                S(c0633m3);
                com.google.android.gms.common.internal.G.g(str2);
                c0633m3.D0(str2, str);
                C0633m c0633m4 = this.f11405c;
                S(c0633m4);
                c0633m4.y0();
                b().f11572A.b(c0646q0.f11916x.c(str), "User property removed");
                C0633m c0633m5 = this.f11405c;
                S(c0633m5);
                c0633m5.z0();
            } catch (Throwable th) {
                C0633m c0633m6 = this.f11405c;
                S(c0633m6);
                c0633m6.z0();
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:65|66)|(2:68|(8:70|(3:72|(2:74|(1:76))(1:96)|95)(1:97)|77|(1:79)(1:94)|80|81|82|(4:84|(1:86)(1:90)|87|(1:89))))|98|81|82|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0339, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x033a, code lost:
    
        b().f11577f.c("Application info is null, first open report might be inaccurate. appId", Y5.W.R(r3), r0);
        r7 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03d4 A[Catch: all -> 0x02b5, TryCatch #2 {all -> 0x02b5, blocks: (B:52:0x0282, B:54:0x02a0, B:59:0x0369, B:60:0x036c, B:61:0x03f8, B:66:0x02b8, B:68:0x02d7, B:70:0x02df, B:72:0x02e5, B:76:0x02f8, B:77:0x030b, B:80:0x0317, B:82:0x032d, B:93:0x033a, B:84:0x034c, B:86:0x0352, B:87:0x035a, B:89:0x0360, B:96:0x0303, B:101:0x02c5, B:146:0x0385, B:148:0x03b9, B:149:0x03bc, B:150:0x03d4, B:152:0x03dc), top: B:37:0x012c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0120 A[Catch: all -> 0x00be, TryCatch #5 {all -> 0x00be, blocks: (B:25:0x00a1, B:27:0x00b3, B:30:0x00f6, B:32:0x0103, B:33:0x010c, B:36:0x0113, B:39:0x012e, B:42:0x0145, B:115:0x018d, B:154:0x0120, B:155:0x0109, B:157:0x00c4, B:160:0x00d4, B:162:0x00e3, B:164:0x00ed, B:167:0x00f3), top: B:24:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0109 A[Catch: all -> 0x00be, TryCatch #5 {all -> 0x00be, blocks: (B:25:0x00a1, B:27:0x00b3, B:30:0x00f6, B:32:0x0103, B:33:0x010c, B:36:0x0113, B:39:0x012e, B:42:0x0145, B:115:0x018d, B:154:0x0120, B:155:0x0109, B:157:0x00c4, B:160:0x00d4, B:162:0x00e3, B:164:0x00ed, B:167:0x00f3), top: B:24:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103 A[Catch: all -> 0x00be, TryCatch #5 {all -> 0x00be, blocks: (B:25:0x00a1, B:27:0x00b3, B:30:0x00f6, B:32:0x0103, B:33:0x010c, B:36:0x0113, B:39:0x012e, B:42:0x0145, B:115:0x018d, B:154:0x0120, B:155:0x0109, B:157:0x00c4, B:160:0x00d4, B:162:0x00e3, B:164:0x00ed, B:167:0x00f3), top: B:24:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113 A[Catch: all -> 0x00be, TRY_ENTER, TryCatch #5 {all -> 0x00be, blocks: (B:25:0x00a1, B:27:0x00b3, B:30:0x00f6, B:32:0x0103, B:33:0x010c, B:36:0x0113, B:39:0x012e, B:42:0x0145, B:115:0x018d, B:154:0x0120, B:155:0x0109, B:157:0x00c4, B:160:0x00d4, B:162:0x00e3, B:164:0x00ed, B:167:0x00f3), top: B:24:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012e A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #5 {all -> 0x00be, blocks: (B:25:0x00a1, B:27:0x00b3, B:30:0x00f6, B:32:0x0103, B:33:0x010c, B:36:0x0113, B:39:0x012e, B:42:0x0145, B:115:0x018d, B:154:0x0120, B:155:0x0109, B:157:0x00c4, B:160:0x00d4, B:162:0x00e3, B:164:0x00ed, B:167:0x00f3), top: B:24:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027a A[Catch: all -> 0x01cd, TryCatch #4 {all -> 0x01cd, blocks: (B:108:0x0169, B:110:0x0177, B:112:0x017d, B:47:0x024e, B:49:0x027a, B:50:0x027d, B:118:0x019b, B:120:0x01c1, B:121:0x01d2, B:123:0x01d9, B:125:0x01df, B:127:0x01e9, B:129:0x01ef, B:131:0x01f5, B:133:0x01fb, B:135:0x0200, B:138:0x0219, B:143:0x021d, B:144:0x022c, B:145:0x0237, B:46:0x0242), top: B:107:0x0169, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a0 A[Catch: all -> 0x02b5, TRY_LEAVE, TryCatch #2 {all -> 0x02b5, blocks: (B:52:0x0282, B:54:0x02a0, B:59:0x0369, B:60:0x036c, B:61:0x03f8, B:66:0x02b8, B:68:0x02d7, B:70:0x02df, B:72:0x02e5, B:76:0x02f8, B:77:0x030b, B:80:0x0317, B:82:0x032d, B:93:0x033a, B:84:0x034c, B:86:0x0352, B:87:0x035a, B:89:0x0360, B:96:0x0303, B:101:0x02c5, B:146:0x0385, B:148:0x03b9, B:149:0x03bc, B:150:0x03d4, B:152:0x03dc), top: B:37:0x012c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0369 A[Catch: all -> 0x02b5, TryCatch #2 {all -> 0x02b5, blocks: (B:52:0x0282, B:54:0x02a0, B:59:0x0369, B:60:0x036c, B:61:0x03f8, B:66:0x02b8, B:68:0x02d7, B:70:0x02df, B:72:0x02e5, B:76:0x02f8, B:77:0x030b, B:80:0x0317, B:82:0x032d, B:93:0x033a, B:84:0x034c, B:86:0x0352, B:87:0x035a, B:89:0x0360, B:96:0x0303, B:101:0x02c5, B:146:0x0385, B:148:0x03b9, B:149:0x03bc, B:150:0x03d4, B:152:0x03dc), top: B:37:0x012c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x034c A[Catch: all -> 0x02b5, TryCatch #2 {all -> 0x02b5, blocks: (B:52:0x0282, B:54:0x02a0, B:59:0x0369, B:60:0x036c, B:61:0x03f8, B:66:0x02b8, B:68:0x02d7, B:70:0x02df, B:72:0x02e5, B:76:0x02f8, B:77:0x030b, B:80:0x0317, B:82:0x032d, B:93:0x033a, B:84:0x034c, B:86:0x0352, B:87:0x035a, B:89:0x0360, B:96:0x0303, B:101:0x02c5, B:146:0x0385, B:148:0x03b9, B:149:0x03bc, B:150:0x03d4, B:152:0x03dc), top: B:37:0x012c, inners: #1, #3 }] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [Y5.I1] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [Y5.I1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [Y5.I1] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(O1 o12) {
        ?? r42;
        C0645q j02;
        long j;
        C0646q0 c0646q0;
        String str;
        long X10;
        C0646q0 c0646q02;
        PackageInfo packageInfo;
        O1 o13;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        long j10;
        boolean z8;
        C0646q0 c0646q03 = this.f11414z;
        c().J();
        k0();
        com.google.android.gms.common.internal.G.g(o12);
        String str2 = o12.f11506a;
        com.google.android.gms.common.internal.G.d(str2);
        if (!Q(o12)) {
            return;
        }
        C0633m c0633m = this.f11405c;
        S(c0633m);
        C0601b0 N02 = c0633m.N0(str2);
        if (N02 != null && TextUtils.isEmpty(N02.G()) && !TextUtils.isEmpty(o12.f11507b)) {
            N02.f(0L);
            C0633m c0633m2 = this.f11405c;
            S(c0633m2);
            c0633m2.O0(N02, false);
            C0628k0 c0628k0 = this.f11403a;
            S(c0628k0);
            c0628k0.J();
            c0628k0.f11802v.remove(str2);
        }
        if (!o12.f11513v) {
            a0(o12);
            return;
        }
        long j11 = o12.f11517z;
        if (j11 == 0) {
            ((M5.b) e()).getClass();
            j11 = System.currentTimeMillis();
        }
        int i7 = o12.f11488A;
        if (i7 != 0 && i7 != 1) {
            b().f11580w.c("Incorrect app type, assuming installed app. appId, appType", W.R(str2), Integer.valueOf(i7));
            i7 = 0;
        }
        C0633m c0633m3 = this.f11405c;
        S(c0633m3);
        c0633m3.x0();
        try {
            C0633m c0633m4 = this.f11405c;
            S(c0633m4);
            L1 F02 = c0633m4.F0(str2, "_npa");
            Boolean T10 = T(o12);
            try {
                if (F02 != null) {
                    if ("auto".equals(F02.f11442b)) {
                    }
                    if (d0().T(null, F.f11312c1)) {
                        Z(o12, j11);
                    } else {
                        Z(o12, o12.f11504R);
                    }
                    a0(o12);
                    if (i7 != 0) {
                        C0633m c0633m5 = this.f11405c;
                        S(c0633m5);
                        j02 = c0633m5.j0("events", str2, "_f");
                        r42 = 0;
                    } else {
                        C0633m c0633m6 = this.f11405c;
                        S(c0633m6);
                        j02 = c0633m6.j0("events", str2, "_v");
                        r42 = 1;
                    }
                    if (j02 != null) {
                        long j12 = ((j11 / 3600000) + 1) * 3600000;
                        boolean z10 = o12.f11490C;
                        if (r42 == 0) {
                            U(new K1(j11, Long.valueOf(j12), "_fot", "auto"), o12);
                            c().J();
                            C0619h0 c0619h0 = this.f11413y;
                            com.google.android.gms.common.internal.G.g(c0619h0);
                            C0646q0 c0646q04 = c0619h0.f11773a;
                            if (str2 != null) {
                                try {
                                    if (!str2.isEmpty()) {
                                        j = j11;
                                        C0640o0 c0640o0 = c0646q04.f11913u;
                                        Context context = c0646q04.f11907a;
                                        C0646q0.l(c0640o0);
                                        c0640o0.J();
                                        boolean a9 = c0619h0.a();
                                        c0646q0 = c0646q03;
                                        W w10 = c0646q04.f11912f;
                                        if (a9) {
                                            ServiceConnectionC0616g0 serviceConnectionC0616g0 = new ServiceConnectionC0616g0(c0619h0, str2);
                                            C0640o0 c0640o02 = c0646q04.f11913u;
                                            C0646q0.l(c0640o02);
                                            c0640o02.J();
                                            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                            str = str2;
                                            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                            PackageManager packageManager = context.getPackageManager();
                                            if (packageManager == null) {
                                                C0646q0.l(w10);
                                                w10.f11581x.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                            } else {
                                                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                                    C0646q0.l(w10);
                                                    w10.f11583z.a("Play Service for fetching Install Referrer is unavailable on device");
                                                } else {
                                                    ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                    if (serviceInfo != null) {
                                                        String str3 = serviceInfo.packageName;
                                                        if (serviceInfo.name != null && "com.android.vending".equals(str3) && c0619h0.a()) {
                                                            try {
                                                                boolean a10 = L5.a.b().a(context, new Intent(intent), serviceConnectionC0616g0, 1);
                                                                C0646q0.l(w10);
                                                                w10.f11573B.b(a10 ? "available" : "not available", "Install Referrer Service is");
                                                            } catch (RuntimeException e2) {
                                                                C0646q0.l(w10);
                                                                w10.f11577f.b(e2.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                            }
                                                        } else {
                                                            C0646q0.l(w10);
                                                            w10.f11580w.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            C0646q0.l(w10);
                                            w10.f11583z.a("Install Referrer Reporter is not available");
                                            str = str2;
                                        }
                                        c().J();
                                        k0();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("_c", 1L);
                                        bundle.putLong("_r", 1L);
                                        bundle.putLong("_uwa", 0L);
                                        bundle.putLong("_pfo", 0L);
                                        bundle.putLong("_sys", 0L);
                                        bundle.putLong("_sysu", 0L);
                                        bundle.putLong("_et", 1L);
                                        if (z10) {
                                            bundle.putLong("_dac", 1L);
                                        }
                                        com.google.android.gms.common.internal.G.g(str);
                                        r42 = this;
                                        C0633m c0633m7 = r42.f11405c;
                                        S(c0633m7);
                                        com.google.android.gms.common.internal.G.d(str);
                                        c0633m7.J();
                                        c0633m7.K();
                                        String str4 = str;
                                        X10 = c0633m7.X(str4);
                                        c0646q02 = c0646q0;
                                        if (c0646q02.f11907a.getPackageManager() != null) {
                                            b().f11577f.b(W.R(str4), "PackageManager is null, first open report might be inaccurate. appId");
                                            o13 = o12;
                                        } else {
                                            try {
                                                packageInfo = O5.c.a(c0646q02.f11907a).h(0, str4);
                                            } catch (PackageManager.NameNotFoundException e10) {
                                                b().f11577f.c("Package info is null, first open report might be inaccurate. appId", W.R(str4), e10);
                                                packageInfo = null;
                                            }
                                            if (packageInfo != null) {
                                                long j13 = packageInfo.firstInstallTime;
                                                if (j13 != 0) {
                                                    if (j13 != packageInfo.lastUpdateTime) {
                                                        applicationInfo = null;
                                                        if (!d0().T(null, F.f11270I0)) {
                                                            bundle.putLong("_uwa", 1L);
                                                        } else if (X10 == 0) {
                                                            bundle.putLong("_uwa", 1L);
                                                            z8 = false;
                                                            X10 = 0;
                                                        }
                                                        z8 = false;
                                                    } else {
                                                        applicationInfo = null;
                                                        z8 = true;
                                                    }
                                                    o13 = o12;
                                                    r42.U(new K1(j, Long.valueOf(true != z8 ? 0L : 1L), "_fi", "auto"), o13);
                                                    applicationInfo2 = O5.c.a(c0646q02.f11907a).g(0, str4);
                                                    if (applicationInfo2 != null) {
                                                        if ((applicationInfo2.flags & 1) != 0) {
                                                            j10 = 1;
                                                            bundle.putLong("_sys", 1L);
                                                        } else {
                                                            j10 = 1;
                                                        }
                                                        if ((applicationInfo2.flags & 128) != 0) {
                                                            bundle.putLong("_sysu", j10);
                                                        }
                                                    }
                                                }
                                            }
                                            o13 = o12;
                                            applicationInfo = null;
                                            applicationInfo2 = O5.c.a(c0646q02.f11907a).g(0, str4);
                                            if (applicationInfo2 != null) {
                                            }
                                        }
                                        if (X10 >= 0) {
                                            bundle.putLong("_pfo", X10);
                                        }
                                        r42.i(new C0648s("_f", new r(bundle), "auto", j), o13);
                                        r42 = r42;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    r42 = this;
                                    C0633m c0633m8 = r42.f11405c;
                                    S(c0633m8);
                                    c0633m8.z0();
                                    throw th;
                                }
                            }
                            str = str2;
                            c0646q0 = c0646q03;
                            j = j11;
                            W w11 = c0646q04.f11912f;
                            C0646q0.l(w11);
                            w11.f11581x.a("Install Referrer Reporter was called with invalid app package name");
                            c().J();
                            k0();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("_c", 1L);
                            bundle2.putLong("_r", 1L);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", 1L);
                            if (z10) {
                            }
                            com.google.android.gms.common.internal.G.g(str);
                            r42 = this;
                            C0633m c0633m72 = r42.f11405c;
                            S(c0633m72);
                            com.google.android.gms.common.internal.G.d(str);
                            c0633m72.J();
                            c0633m72.K();
                            String str42 = str;
                            X10 = c0633m72.X(str42);
                            c0646q02 = c0646q0;
                            if (c0646q02.f11907a.getPackageManager() != null) {
                            }
                            if (X10 >= 0) {
                            }
                            r42.i(new C0648s("_f", new r(bundle2), "auto", j), o13);
                            r42 = r42;
                        } else {
                            I1 i12 = this;
                            long j14 = j11;
                            i12.U(new K1(j14, Long.valueOf(j12), "_fvt", "auto"), o12);
                            c().J();
                            k0();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("_c", 1L);
                            bundle3.putLong("_r", 1L);
                            bundle3.putLong("_et", 1L);
                            if (z10) {
                                bundle3.putLong("_dac", 1L);
                            }
                            i12.i(new C0648s("_v", new r(bundle3), "auto", j14), o12);
                            r42 = i12;
                        }
                    } else {
                        I1 i13 = this;
                        long j15 = j11;
                        r42 = i13;
                        if (o12.f11514w) {
                            i13.i(new C0648s("_cd", new r(new Bundle()), "auto", j15), o12);
                            r42 = i13;
                        }
                    }
                    C0633m c0633m9 = r42.f11405c;
                    S(c0633m9);
                    c0633m9.y0();
                    C0633m c0633m10 = r42.f11405c;
                    S(c0633m10);
                    c0633m10.z0();
                    return;
                }
                if (j02 != null) {
                }
                C0633m c0633m92 = r42.f11405c;
                S(c0633m92);
                c0633m92.y0();
                C0633m c0633m102 = r42.f11405c;
                S(c0633m102);
                c0633m102.z0();
                return;
            } catch (Throwable th2) {
                th = th2;
                C0633m c0633m82 = r42.f11405c;
                S(c0633m82);
                c0633m82.z0();
                throw th;
            }
            if (T10 != null) {
                K1 k12 = new K1(j11, Long.valueOf(true != T10.booleanValue() ? 0L : 1L), "_npa", "auto");
                if (F02 == null || !F02.f11445e.equals(k12.f11431d)) {
                    U(k12, o12);
                }
            } else if (F02 != null) {
                V("_npa", o12);
            }
            if (d0().T(null, F.f11312c1)) {
            }
            a0(o12);
            if (i7 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
            r42 = this;
        }
    }

    public final void X(C0609e c0609e, O1 o12) {
        C0648s c0648s;
        com.google.android.gms.common.internal.G.d(c0609e.f11711a);
        com.google.android.gms.common.internal.G.g(c0609e.f11712b);
        com.google.android.gms.common.internal.G.g(c0609e.f11713c);
        com.google.android.gms.common.internal.G.d(c0609e.f11713c.f11429b);
        c().J();
        k0();
        if (Q(o12)) {
            if (!o12.f11513v) {
                a0(o12);
                return;
            }
            C0609e c0609e2 = new C0609e(c0609e);
            boolean z8 = false;
            c0609e2.f11715e = false;
            C0633m c0633m = this.f11405c;
            S(c0633m);
            c0633m.x0();
            try {
                C0633m c0633m2 = this.f11405c;
                S(c0633m2);
                String str = c0609e2.f11711a;
                com.google.android.gms.common.internal.G.g(str);
                C0609e J02 = c0633m2.J0(str, c0609e2.f11713c.f11429b);
                C0646q0 c0646q0 = this.f11414z;
                if (J02 != null && !J02.f11712b.equals(c0609e2.f11712b)) {
                    b().f11580w.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", c0646q0.f11916x.c(c0609e2.f11713c.f11429b), c0609e2.f11712b, J02.f11712b);
                }
                if (J02 != null && J02.f11715e) {
                    c0609e2.f11712b = J02.f11712b;
                    c0609e2.f11714d = J02.f11714d;
                    c0609e2.f11718v = J02.f11718v;
                    c0609e2.f11716f = J02.f11716f;
                    c0609e2.f11719w = J02.f11719w;
                    c0609e2.f11715e = true;
                    K1 k12 = c0609e2.f11713c;
                    c0609e2.f11713c = new K1(J02.f11713c.f11430c, k12.t(), k12.f11429b, J02.f11713c.f11433f);
                } else if (TextUtils.isEmpty(c0609e2.f11716f)) {
                    K1 k13 = c0609e2.f11713c;
                    c0609e2.f11713c = new K1(c0609e2.f11714d, k13.t(), k13.f11429b, c0609e2.f11713c.f11433f);
                    c0609e2.f11715e = true;
                    z8 = true;
                }
                if (c0609e2.f11715e) {
                    K1 k14 = c0609e2.f11713c;
                    String str2 = c0609e2.f11711a;
                    com.google.android.gms.common.internal.G.g(str2);
                    String str3 = c0609e2.f11712b;
                    String str4 = k14.f11429b;
                    long j = k14.f11430c;
                    Object t5 = k14.t();
                    com.google.android.gms.common.internal.G.g(t5);
                    L1 l12 = new L1(str2, str3, str4, j, t5);
                    Object obj = l12.f11445e;
                    String str5 = l12.f11443c;
                    C0633m c0633m3 = this.f11405c;
                    S(c0633m3);
                    if (c0633m3.E0(l12)) {
                        b().f11572A.d("User property updated immediately", c0609e2.f11711a, c0646q0.f11916x.c(str5), obj);
                    } else {
                        b().f11577f.d("(2)Too many active user properties, ignoring", W.R(c0609e2.f11711a), c0646q0.f11916x.c(str5), obj);
                    }
                    if (z8 && (c0648s = c0609e2.f11719w) != null) {
                        l(new C0648s(c0648s, c0609e2.f11714d), o12);
                    }
                }
                C0633m c0633m4 = this.f11405c;
                S(c0633m4);
                if (c0633m4.I0(c0609e2)) {
                    b().f11572A.d("Conditional property added", c0609e2.f11711a, c0646q0.f11916x.c(c0609e2.f11713c.f11429b), c0609e2.f11713c.t());
                } else {
                    b().f11577f.d("Too many conditional properties, ignoring", W.R(c0609e2.f11711a), c0646q0.f11916x.c(c0609e2.f11713c.f11429b), c0609e2.f11713c.t());
                }
                C0633m c0633m5 = this.f11405c;
                S(c0633m5);
                c0633m5.y0();
                C0633m c0633m6 = this.f11405c;
                S(c0633m6);
                c0633m6.z0();
            } catch (Throwable th) {
                C0633m c0633m7 = this.f11405c;
                S(c0633m7);
                c0633m7.z0();
                throw th;
            }
        }
    }

    public final void Y(C0609e c0609e, O1 o12) {
        com.google.android.gms.common.internal.G.d(c0609e.f11711a);
        com.google.android.gms.common.internal.G.g(c0609e.f11713c);
        com.google.android.gms.common.internal.G.d(c0609e.f11713c.f11429b);
        c().J();
        k0();
        if (Q(o12)) {
            if (!o12.f11513v) {
                a0(o12);
                return;
            }
            C0633m c0633m = this.f11405c;
            S(c0633m);
            c0633m.x0();
            try {
                a0(o12);
                String str = c0609e.f11711a;
                com.google.android.gms.common.internal.G.g(str);
                C0633m c0633m2 = this.f11405c;
                S(c0633m2);
                C0609e J02 = c0633m2.J0(str, c0609e.f11713c.f11429b);
                C0646q0 c0646q0 = this.f11414z;
                if (J02 != null) {
                    b().f11572A.c("Removing conditional user property", c0609e.f11711a, c0646q0.f11916x.c(c0609e.f11713c.f11429b));
                    C0633m c0633m3 = this.f11405c;
                    S(c0633m3);
                    c0633m3.K0(str, c0609e.f11713c.f11429b);
                    if (J02.f11715e) {
                        C0633m c0633m4 = this.f11405c;
                        S(c0633m4);
                        c0633m4.D0(str, c0609e.f11713c.f11429b);
                    }
                    C0648s c0648s = c0609e.f11721y;
                    if (c0648s != null) {
                        r rVar = c0648s.f11930b;
                        C0648s l02 = j0().l0(c0648s.f11929a, rVar != null ? rVar.D() : null, J02.f11712b, c0648s.f11932d, true);
                        com.google.android.gms.common.internal.G.g(l02);
                        l(l02, o12);
                    }
                } else {
                    b().f11580w.c("Conditional user property doesn't exist", W.R(c0609e.f11711a), c0646q0.f11916x.c(c0609e.f11713c.f11429b));
                }
                C0633m c0633m5 = this.f11405c;
                S(c0633m5);
                c0633m5.y0();
                C0633m c0633m6 = this.f11405c;
                S(c0633m6);
                c0633m6.z0();
            } catch (Throwable th) {
                C0633m c0633m7 = this.f11405c;
                S(c0633m7);
                c0633m7.z0();
                throw th;
            }
        }
    }

    public final void Z(O1 o12, long j) {
        C0633m c0633m = this.f11405c;
        S(c0633m);
        String str = o12.f11506a;
        com.google.android.gms.common.internal.G.g(str);
        C0601b0 N02 = c0633m.N0(str);
        if (N02 != null) {
            j0();
            String G9 = N02.G();
            String str2 = o12.f11507b;
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean isEmpty2 = TextUtils.isEmpty(G9);
            if (!isEmpty && !isEmpty2) {
                com.google.android.gms.common.internal.G.g(str2);
                if (!str2.equals(G9)) {
                    b().f11580w.b(W.R(N02.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    C0633m c0633m2 = this.f11405c;
                    S(c0633m2);
                    C0646q0 c0646q0 = (C0646q0) c0633m2.f3094a;
                    String D10 = N02.D();
                    c0633m2.K();
                    c0633m2.J();
                    com.google.android.gms.common.internal.G.d(D10);
                    try {
                        SQLiteDatabase A02 = c0633m2.A0();
                        String[] strArr = {D10};
                        int delete = A02.delete("events", "app_id=?", strArr) + A02.delete("user_attributes", "app_id=?", strArr) + A02.delete("conditional_properties", "app_id=?", strArr) + A02.delete("apps", "app_id=?", strArr) + A02.delete("raw_events", "app_id=?", strArr) + A02.delete("raw_events_metadata", "app_id=?", strArr) + A02.delete("event_filters", "app_id=?", strArr) + A02.delete("property_filters", "app_id=?", strArr) + A02.delete("audience_filter_values", "app_id=?", strArr) + A02.delete("consent_settings", "app_id=?", strArr) + A02.delete("default_event_params", "app_id=?", strArr) + A02.delete("trigger_uris", "app_id=?", strArr);
                        zzpk.zza();
                        if (c0646q0.f11910d.T(null, F.f11329i1)) {
                            delete += A02.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (delete > 0) {
                            W w10 = c0646q0.f11912f;
                            C0646q0.l(w10);
                            w10.f11573B.c("Deleted application data. app, records", D10, Integer.valueOf(delete));
                        }
                    } catch (SQLiteException e2) {
                        W w11 = c0646q0.f11912f;
                        C0646q0.l(w11);
                        w11.f11577f.c("Error deleting application data. appId, error", W.R(D10), e2);
                    }
                    N02 = null;
                }
            }
        }
        if (N02 != null) {
            boolean z8 = (N02.P() == -2147483648L || N02.P() == o12.f11515x) ? false : true;
            String N10 = N02.N();
            if (z8 || ((N02.P() != -2147483648L || N10 == null || N10.equals(o12.f11508c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", N10);
                C0648s c0648s = new C0648s("_au", new r(bundle), "auto", j);
                if (d0().T(null, F.f11315d1)) {
                    i(c0648s, o12);
                } else {
                    j(c0648s, o12);
                }
            }
        }
    }

    public final C0 a(String str) {
        C0 c02 = C0.f11229c;
        c().J();
        k0();
        HashMap hashMap = this.f11394P;
        C0 c03 = (C0) hashMap.get(str);
        if (c03 == null) {
            C0633m c0633m = this.f11405c;
            S(c0633m);
            c03 = c0633m.e0(str);
            if (c03 == null) {
                c03 = C0.f11229c;
            }
            c().J();
            k0();
            hashMap.put(str, c03);
            C0633m c0633m2 = this.f11405c;
            S(c0633m2);
            c0633m2.q0(str, c03);
        }
        return c03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0295, code lost:
    
        if (r11 != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0601b0 a0(O1 o12) {
        boolean z8;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        c().J();
        k0();
        com.google.android.gms.common.internal.G.g(o12);
        String str5 = o12.f11506a;
        com.google.android.gms.common.internal.G.d(str5);
        String str6 = o12.f11495H;
        if (!str6.isEmpty()) {
            this.f11396R.put(str5, new G1(this, str6));
        }
        C0633m c0633m = this.f11405c;
        S(c0633m);
        C0601b0 N02 = c0633m.N0(str5);
        C0 j10 = a(str5).j(C0.c(100, o12.f11494G));
        B0 b02 = B0.AD_STORAGE;
        boolean i7 = j10.i(b02);
        boolean z10 = o12.f11489B;
        String O10 = i7 ? this.f11411w.O(str5, z10) : "";
        B0 b03 = B0.ANALYTICS_STORAGE;
        boolean z11 = true;
        if (N02 == null) {
            N02 = new C0601b0(this.f11414z, str5);
            if (j10.i(b03)) {
                N02.F(o(j10));
            }
            if (j10.i(b02)) {
                N02.I(O10);
            }
        } else {
            if (j10.i(b02) && O10 != null) {
                C0646q0 c0646q0 = N02.f11653a;
                C0640o0 c0640o0 = c0646q0.f11913u;
                C0646q0.l(c0640o0);
                c0640o0.J();
                if (!O10.equals(N02.f11657e)) {
                    C0640o0 c0640o02 = c0646q0.f11913u;
                    C0646q0.l(c0640o02);
                    c0640o02.J();
                    boolean isEmpty = TextUtils.isEmpty(N02.f11657e);
                    N02.I(O10);
                    if (z10) {
                        C0638n1 c0638n1 = this.f11411w;
                        c0638n1.getClass();
                        if (!"00000000-0000-0000-0000-000000000000".equals((j10.i(b02) ? c0638n1.N(str5) : new Pair("", Boolean.FALSE)).first) && !isEmpty) {
                            if (j10.i(b03)) {
                                N02.F(o(j10));
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            C0633m c0633m2 = this.f11405c;
                            S(c0633m2);
                            if (c0633m2.F0(str5, "_id") != null) {
                                C0633m c0633m3 = this.f11405c;
                                S(c0633m3);
                                if (c0633m3.F0(str5, "_lair") == null) {
                                    ((M5.b) e()).getClass();
                                    L1 l12 = new L1(str5, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    C0633m c0633m4 = this.f11405c;
                                    S(c0633m4);
                                    c0633m4.E0(l12);
                                }
                            }
                            N02.H(o12.f11507b);
                            str = o12.f11516y;
                            if (!TextUtils.isEmpty(str)) {
                                N02.K(str);
                            }
                            j = o12.f11510e;
                            if (j != 0) {
                                N02.S(j);
                            }
                            str2 = o12.f11508c;
                            if (!TextUtils.isEmpty(str2)) {
                                N02.O(str2);
                            }
                            N02.Q(o12.f11515x);
                            str3 = o12.f11509d;
                            if (str3 != null) {
                                N02.R(str3);
                            }
                            N02.a(o12.f11511f);
                            N02.d(o12.f11513v);
                            str4 = o12.f11512u;
                            if (!TextUtils.isEmpty(str4)) {
                                N02.v(str4);
                            }
                            C0646q0 c0646q02 = N02.f11653a;
                            C0640o0 c0640o03 = c0646q02.f11913u;
                            C0646q0.l(c0640o03);
                            c0640o03.J();
                            N02.f11650Q |= N02.f11665p == z10;
                            N02.f11665p = z10;
                            C0640o0 c0640o04 = c0646q02.f11913u;
                            C0646q0.l(c0640o04);
                            c0640o04.J();
                            boolean z12 = N02.f11650Q;
                            Boolean bool = N02.f11666q;
                            Boolean bool2 = o12.f11491D;
                            N02.f11650Q = z12 | (!Objects.equals(bool, bool2));
                            N02.f11666q = bool2;
                            N02.c(o12.f11492E);
                            C0640o0 c0640o05 = c0646q02.f11913u;
                            C0646q0.l(c0640o05);
                            c0640o05.J();
                            boolean z13 = N02.f11650Q;
                            String str7 = N02.f11669t;
                            String str8 = o12.f11496I;
                            N02.f11650Q = z13 | (!Objects.equals(str7, str8));
                            N02.f11669t = str8;
                            zzpn.zza();
                            if (d0().T(null, F.f11275L0)) {
                                zzpn.zza();
                                if (d0().T(null, F.f11274K0)) {
                                    N02.x(null);
                                }
                            } else {
                                N02.x(o12.f11493F);
                            }
                            C0640o0 c0640o06 = c0646q02.f11913u;
                            C0646q0.l(c0640o06);
                            c0640o06.J();
                            boolean z14 = N02.f11650Q;
                            boolean z15 = N02.f11670u;
                            boolean z16 = o12.f11497J;
                            N02.f11650Q = z14 | (z15 == z16);
                            N02.f11670u = z16;
                            C0640o0 c0640o07 = c0646q02.f11913u;
                            C0646q0.l(c0640o07);
                            c0640o07.J();
                            boolean z17 = N02.f11650Q;
                            String str9 = N02.f11637C;
                            String str10 = o12.f11502P;
                            N02.f11650Q = z17 | (str9 == str10);
                            N02.f11637C = str10;
                            zzql.zza();
                            if (d0().T(null, F.f11283P0)) {
                                C0640o0 c0640o08 = c0646q02.f11913u;
                                C0646q0.l(c0640o08);
                                c0640o08.J();
                                boolean z18 = N02.f11650Q;
                                int i10 = N02.f11673x;
                                int i11 = o12.f11500N;
                                N02.f11650Q = z18 | (i10 != i11);
                                N02.f11673x = i11;
                            }
                            N02.z(o12.f11498K);
                            C0640o0 c0640o09 = c0646q02.f11913u;
                            C0646q0.l(c0640o09);
                            c0640o09.J();
                            boolean z19 = N02.f11650Q;
                            String str11 = N02.f11641G;
                            String str12 = o12.f11503Q;
                            N02.f11650Q = z19 | (str11 == str12);
                            N02.f11641G = str12;
                            C0640o0 c0640o010 = c0646q02.f11913u;
                            C0646q0.l(c0640o010);
                            c0640o010.J();
                            boolean z20 = N02.f11650Q;
                            int i12 = N02.f11643I;
                            int i13 = o12.f11505S;
                            N02.f11650Q = z20 | (i12 != i13);
                            N02.f11643I = i13;
                            if (!N02.o()) {
                                z11 = z8;
                            }
                            C0633m c0633m5 = this.f11405c;
                            S(c0633m5);
                            c0633m5.O0(N02, z11);
                            return N02;
                        }
                    }
                    if (TextUtils.isEmpty(N02.E()) && j10.i(b03)) {
                        N02.F(o(j10));
                    }
                }
            }
            if (TextUtils.isEmpty(N02.E()) && j10.i(b03)) {
                N02.F(o(j10));
            }
        }
        z8 = false;
        N02.H(o12.f11507b);
        str = o12.f11516y;
        if (!TextUtils.isEmpty(str)) {
        }
        j = o12.f11510e;
        if (j != 0) {
        }
        str2 = o12.f11508c;
        if (!TextUtils.isEmpty(str2)) {
        }
        N02.Q(o12.f11515x);
        str3 = o12.f11509d;
        if (str3 != null) {
        }
        N02.a(o12.f11511f);
        N02.d(o12.f11513v);
        str4 = o12.f11512u;
        if (!TextUtils.isEmpty(str4)) {
        }
        C0646q0 c0646q022 = N02.f11653a;
        C0640o0 c0640o032 = c0646q022.f11913u;
        C0646q0.l(c0640o032);
        c0640o032.J();
        N02.f11650Q |= N02.f11665p == z10;
        N02.f11665p = z10;
        C0640o0 c0640o042 = c0646q022.f11913u;
        C0646q0.l(c0640o042);
        c0640o042.J();
        boolean z122 = N02.f11650Q;
        Boolean bool3 = N02.f11666q;
        Boolean bool22 = o12.f11491D;
        N02.f11650Q = z122 | (!Objects.equals(bool3, bool22));
        N02.f11666q = bool22;
        N02.c(o12.f11492E);
        C0640o0 c0640o052 = c0646q022.f11913u;
        C0646q0.l(c0640o052);
        c0640o052.J();
        boolean z132 = N02.f11650Q;
        String str72 = N02.f11669t;
        String str82 = o12.f11496I;
        N02.f11650Q = z132 | (!Objects.equals(str72, str82));
        N02.f11669t = str82;
        zzpn.zza();
        if (d0().T(null, F.f11275L0)) {
        }
        C0640o0 c0640o062 = c0646q022.f11913u;
        C0646q0.l(c0640o062);
        c0640o062.J();
        boolean z142 = N02.f11650Q;
        boolean z152 = N02.f11670u;
        boolean z162 = o12.f11497J;
        N02.f11650Q = z142 | (z152 == z162);
        N02.f11670u = z162;
        C0640o0 c0640o072 = c0646q022.f11913u;
        C0646q0.l(c0640o072);
        c0640o072.J();
        boolean z172 = N02.f11650Q;
        String str92 = N02.f11637C;
        String str102 = o12.f11502P;
        N02.f11650Q = z172 | (str92 == str102);
        N02.f11637C = str102;
        zzql.zza();
        if (d0().T(null, F.f11283P0)) {
        }
        N02.z(o12.f11498K);
        C0640o0 c0640o092 = c0646q022.f11913u;
        C0646q0.l(c0640o092);
        c0640o092.J();
        boolean z192 = N02.f11650Q;
        String str112 = N02.f11641G;
        String str122 = o12.f11503Q;
        N02.f11650Q = z192 | (str112 == str122);
        N02.f11641G = str122;
        C0640o0 c0640o0102 = c0646q022.f11913u;
        C0646q0.l(c0640o0102);
        c0640o0102.J();
        boolean z202 = N02.f11650Q;
        int i122 = N02.f11643I;
        int i132 = o12.f11505S;
        N02.f11650Q = z202 | (i122 != i132);
        N02.f11643I = i132;
        if (!N02.o()) {
        }
        C0633m c0633m52 = this.f11405c;
        S(c0633m52);
        c0633m52.O0(N02, z11);
        return N02;
    }

    @Override // Y5.InterfaceC0661y0
    public final W b() {
        C0646q0 c0646q0 = this.f11414z;
        com.google.android.gms.common.internal.G.g(c0646q0);
        W w10 = c0646q0.f11912f;
        C0646q0.l(w10);
        return w10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List b0(O1 o12, Bundle bundle) {
        int[] iArr;
        c().J();
        zzql.zza();
        C0615g d02 = d0();
        String str = o12.f11506a;
        if (!d02.T(str, F.f11283P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    b().f11577f.a("Uri sources and timestamps do not match");
                } else {
                    int i7 = 0;
                    while (i7 < intArray.length) {
                        C0633m c0633m = this.f11405c;
                        S(c0633m);
                        C0646q0 c0646q0 = (C0646q0) c0633m.f3094a;
                        int i10 = intArray[i7];
                        long j = longArray[i7];
                        com.google.android.gms.common.internal.G.d(str);
                        c0633m.J();
                        c0633m.K();
                        try {
                            iArr = intArray;
                        } catch (SQLiteException e2) {
                            e = e2;
                            iArr = intArray;
                        }
                        try {
                            int delete = c0633m.A0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i10), String.valueOf(j)});
                            W w10 = c0646q0.f11912f;
                            C0646q0.l(w10);
                            U u3 = w10.f11573B;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(delete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            u3.d(sb2.toString(), str, Integer.valueOf(i10), Long.valueOf(j));
                        } catch (SQLiteException e10) {
                            e = e10;
                            W w11 = c0646q0.f11912f;
                            C0646q0.l(w11);
                            w11.f11577f.c("Error pruning trigger URIs. appId", W.R(str), e);
                            i7++;
                            intArray = iArr;
                        }
                        i7++;
                        intArray = iArr;
                    }
                }
            }
        }
        C0633m c0633m2 = this.f11405c;
        S(c0633m2);
        String str2 = o12.f11506a;
        com.google.android.gms.common.internal.G.d(str2);
        c0633m2.J();
        c0633m2.K();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = c0633m2.A0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new x1(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            W w12 = ((C0646q0) c0633m2.f3094a).f11912f;
            C0646q0.l(w12);
            w12.f11577f.c("Error querying trigger uris. appId", W.R(str2), e11);
            arrayList = Collections.emptyList();
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    @Override // Y5.InterfaceC0661y0
    public final C0640o0 c() {
        C0646q0 c0646q0 = this.f11414z;
        com.google.android.gms.common.internal.G.g(c0646q0);
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        return c0640o0;
    }

    @Override // Y5.InterfaceC0661y0
    public final Context d() {
        return this.f11414z.f11907a;
    }

    public final C0615g d0() {
        C0646q0 c0646q0 = this.f11414z;
        com.google.android.gms.common.internal.G.g(c0646q0);
        return c0646q0.f11910d;
    }

    @Override // Y5.InterfaceC0661y0
    public final M5.a e() {
        C0646q0 c0646q0 = this.f11414z;
        com.google.android.gms.common.internal.G.g(c0646q0);
        return c0646q0.f11917y;
    }

    public final C0628k0 e0() {
        C0628k0 c0628k0 = this.f11403a;
        S(c0628k0);
        return c0628k0;
    }

    @Override // Y5.InterfaceC0661y0
    public final C1332t f() {
        return this.f11414z.f11909c;
    }

    public final C0633m f0() {
        C0633m c0633m = this.f11405c;
        S(c0633m);
        return c0633m;
    }

    public final long g() {
        ((M5.b) e()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C0638n1 c0638n1 = this.f11411w;
        c0638n1.K();
        c0638n1.J();
        C0610e0 c0610e0 = c0638n1.f11856x;
        long f4 = c0610e0.f();
        if (f4 == 0) {
            C0646q0.j(((C0646q0) c0638n1.f3094a).f11915w);
            f4 = r2.G0().nextInt(86400000) + 1;
            c0610e0.g(f4);
        }
        return ((((currentTimeMillis + f4) / 1000) / 60) / 60) / 24;
    }

    public final C0604c0 g0() {
        C0604c0 c0604c0 = this.f11406d;
        if (c0604c0 != null) {
            return c0604c0;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final void h(C0648s c0648s, String str) {
        C0633m c0633m = this.f11405c;
        S(c0633m);
        C0601b0 N02 = c0633m.N0(str);
        if (N02 == null || TextUtils.isEmpty(N02.N())) {
            b().f11572A.b(str, "No app data available; dropping event");
            return;
        }
        Boolean N10 = N(N02);
        if (N10 == null) {
            if (!"_ui".equals(c0648s.f11929a)) {
                W b2 = b();
                b2.f11580w.b(W.R(str), "Could not find package. appId");
            }
        } else if (!N10.booleanValue()) {
            W b10 = b();
            b10.f11577f.b(W.R(str), "App version does not match; dropping event. appId");
            return;
        }
        String G9 = N02.G();
        String N11 = N02.N();
        long P10 = N02.P();
        C0646q0 c0646q0 = N02.f11653a;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        String str2 = N02.f11661l;
        C0640o0 c0640o02 = c0646q0.f11913u;
        C0646q0.l(c0640o02);
        c0640o02.J();
        long j = N02.f11662m;
        C0640o0 c0640o03 = c0646q0.f11913u;
        C0646q0.l(c0640o03);
        c0640o03.J();
        long j10 = N02.f11663n;
        C0640o0 c0640o04 = c0646q0.f11913u;
        C0646q0.l(c0640o04);
        c0640o04.J();
        boolean z8 = N02.f11664o;
        String J10 = N02.J();
        C0640o0 c0640o05 = c0646q0.f11913u;
        C0646q0.l(c0640o05);
        c0640o05.J();
        boolean z10 = N02.f11665p;
        Boolean w10 = N02.w();
        long b11 = N02.b();
        C0640o0 c0640o06 = c0646q0.f11913u;
        C0646q0.l(c0640o06);
        c0640o06.J();
        ArrayList arrayList = N02.f11668s;
        String g = a(str).g();
        boolean y10 = N02.y();
        C0640o0 c0640o07 = c0646q0.f11913u;
        C0646q0.l(c0640o07);
        c0640o07.J();
        long j11 = N02.f11671v;
        C0 a9 = a(str);
        String str3 = n0(str).f11859b;
        C0640o0 c0640o08 = c0646q0.f11913u;
        C0646q0.l(c0640o08);
        c0640o08.J();
        int i7 = N02.f11673x;
        C0640o0 c0640o09 = c0646q0.f11913u;
        C0646q0.l(c0640o09);
        c0640o09.J();
        i(c0648s, new O1(str, G9, N11, P10, str2, j, j10, (String) null, z8, false, J10, 0L, 0, z10, false, w10, b11, (List) arrayList, g, "", (String) null, y10, j11, a9.f11231b, str3, i7, N02.f11636B, N02.C(), N02.s(), 0L, N02.t()));
    }

    public final C0603c h0() {
        C0603c c0603c = this.f11408f;
        S(c0603c);
        return c0603c;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x007a: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:37:0x007a */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(C0648s c0648s, O1 o12) {
        Cursor cursor;
        Cursor cursor2;
        Bundle bundle;
        C0648s c10;
        r rVar;
        String str = o12.f11506a;
        com.google.android.gms.common.internal.G.d(str);
        X a9 = X.a(c0648s);
        M1 j02 = j0();
        C0633m c0633m = this.f11405c;
        S(c0633m);
        C0646q0 c0646q0 = (C0646q0) c0633m.f3094a;
        c0633m.J();
        c0633m.K();
        Cursor cursor3 = null;
        try {
            try {
                cursor = c0633m.A0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.b(e, "Error selecting default event parameters");
                    if (cursor != null) {
                    }
                    bundle = null;
                    j02.U((Bundle) a9.f11589e, bundle);
                    M1 j03 = j0();
                    C0615g d02 = d0();
                    d02.getClass();
                    j03.S(a9, Math.max(Math.min(d02.R(str, F.f11298X), 100), 25));
                    c10 = a9.c();
                    if (!d0().T(null, F.f11323g1)) {
                    }
                    j(c10, o12);
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (cursor.moveToFirst()) {
            try {
                zzhs zzhsVar = (zzhs) ((zzhr) C0598a0.w0(zzhs.zzk(), cursor.getBlob(0))).zzbc();
                c0633m.f12021b.i0();
                bundle = C0598a0.Q(zzhsVar.zza());
                cursor.close();
            } catch (IOException e11) {
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11577f.c("Failed to retrieve default event parameters. appId", W.R(str), e11);
            }
            j02.U((Bundle) a9.f11589e, bundle);
            M1 j032 = j0();
            C0615g d022 = d0();
            d022.getClass();
            j032.S(a9, Math.max(Math.min(d022.R(str, F.f11298X), 100), 25));
            c10 = a9.c();
            if (!d0().T(null, F.f11323g1) && "_cmp".equals(c10.f11929a)) {
                rVar = c10.f11930b;
                if ("referrer API v2".equals(rVar.f11922a.getString("_cis"))) {
                    String string = rVar.f11922a.getString("gclid");
                    if (!TextUtils.isEmpty(string)) {
                        U(new K1(c10.f11932d, string, "_lgclid", "auto"), o12);
                    }
                }
            }
            j(c10, o12);
        }
        W w12 = c0646q0.f11912f;
        C0646q0.l(w12);
        w12.f11573B.a("Default event parameters not found");
        if (cursor != null) {
            cursor.close();
        }
        bundle = null;
        j02.U((Bundle) a9.f11589e, bundle);
        M1 j0322 = j0();
        C0615g d0222 = d0();
        d0222.getClass();
        j0322.S(a9, Math.max(Math.min(d0222.R(str, F.f11298X), 100), 25));
        c10 = a9.c();
        if (!d0().T(null, F.f11323g1)) {
            rVar = c10.f11930b;
            if ("referrer API v2".equals(rVar.f11922a.getString("_cis"))) {
            }
        }
        j(c10, o12);
    }

    public final C0598a0 i0() {
        C0598a0 c0598a0 = this.f11409u;
        S(c0598a0);
        return c0598a0;
    }

    public final void j(C0648s c0648s, O1 o12) {
        List M02;
        C0646q0 c0646q0;
        List M03;
        List<C0609e> M04;
        String str;
        com.google.android.gms.common.internal.G.g(o12);
        String str2 = o12.f11506a;
        com.google.android.gms.common.internal.G.d(str2);
        c().J();
        k0();
        X a9 = X.a(c0648s);
        c().J();
        M1.A0((this.f11398T == null || (str = this.f11399U) == null || !str.equals(str2)) ? null : this.f11398T, (Bundle) a9.f11589e, false);
        C0648s c10 = a9.c();
        i0();
        if (TextUtils.isEmpty(o12.f11507b)) {
            return;
        }
        if (!o12.f11513v) {
            a0(o12);
            return;
        }
        List list = o12.f11493F;
        if (list != null) {
            String str3 = c10.f11929a;
            if (!list.contains(str3)) {
                b().f11572A.d("Dropping non-safelisted event. appId, event name, origin", str2, c10.f11929a, c10.f11931c);
                return;
            } else {
                Bundle D10 = c10.f11930b.D();
                D10.putLong("ga_safelisted", 1L);
                c10 = new C0648s(str3, new r(D10), c10.f11931c, c10.f11932d);
            }
        }
        C0633m c0633m = this.f11405c;
        S(c0633m);
        c0633m.x0();
        try {
            String str4 = c10.f11929a;
            if ("_s".equals(str4)) {
                C0633m c0633m2 = this.f11405c;
                S(c0633m2);
                if (!c0633m2.Y(str2, "_s") && c10.f11930b.f11922a.getLong("_sid") != 0) {
                    C0633m c0633m3 = this.f11405c;
                    S(c0633m3);
                    if (!c0633m3.Y(str2, "_f")) {
                        C0633m c0633m4 = this.f11405c;
                        S(c0633m4);
                        if (!c0633m4.Y(str2, "_v")) {
                            C0633m c0633m5 = this.f11405c;
                            S(c0633m5);
                            ((M5.b) e()).getClass();
                            c0633m5.d0(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(c10, str2));
                        }
                    }
                    C0633m c0633m6 = this.f11405c;
                    S(c0633m6);
                    c0633m6.d0(str2, null, "_sid", k(c10, str2));
                }
            }
            C0633m c0633m7 = this.f11405c;
            S(c0633m7);
            com.google.android.gms.common.internal.G.d(str2);
            c0633m7.J();
            c0633m7.K();
            long j = c0648s.f11932d;
            if (j < 0) {
                W w10 = ((C0646q0) c0633m7.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11580w.c("Invalid time querying timed out conditional properties", W.R(str2), Long.valueOf(j));
                M02 = Collections.emptyList();
            } else {
                M02 = c0633m7.M0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = M02.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c0646q0 = this.f11414z;
                if (!hasNext) {
                    break;
                }
                C0609e c0609e = (C0609e) it.next();
                if (c0609e != null) {
                    b().f11573B.d("User property timed out", c0609e.f11711a, c0646q0.f11916x.c(c0609e.f11713c.f11429b), c0609e.f11713c.t());
                    C0648s c0648s2 = c0609e.f11717u;
                    if (c0648s2 != null) {
                        l(new C0648s(c0648s2, j), o12);
                    }
                    C0633m c0633m8 = this.f11405c;
                    S(c0633m8);
                    c0633m8.K0(str2, c0609e.f11713c.f11429b);
                }
            }
            C0633m c0633m9 = this.f11405c;
            S(c0633m9);
            com.google.android.gms.common.internal.G.d(str2);
            c0633m9.J();
            c0633m9.K();
            if (j < 0) {
                W w11 = ((C0646q0) c0633m9.f3094a).f11912f;
                C0646q0.l(w11);
                w11.f11580w.c("Invalid time querying expired conditional properties", W.R(str2), Long.valueOf(j));
                M03 = Collections.emptyList();
            } else {
                M03 = c0633m9.M0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(M03.size());
            Iterator it2 = M03.iterator();
            while (it2.hasNext()) {
                C0609e c0609e2 = (C0609e) it2.next();
                if (c0609e2 != null) {
                    Iterator it3 = it2;
                    b().f11573B.d("User property expired", c0609e2.f11711a, c0646q0.f11916x.c(c0609e2.f11713c.f11429b), c0609e2.f11713c.t());
                    C0633m c0633m10 = this.f11405c;
                    S(c0633m10);
                    c0633m10.D0(str2, c0609e2.f11713c.f11429b);
                    C0648s c0648s3 = c0609e2.f11721y;
                    if (c0648s3 != null) {
                        arrayList.add(c0648s3);
                    }
                    C0633m c0633m11 = this.f11405c;
                    S(c0633m11);
                    c0633m11.K0(str2, c0609e2.f11713c.f11429b);
                    it2 = it3;
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                l(new C0648s((C0648s) it4.next(), j), o12);
            }
            C0633m c0633m12 = this.f11405c;
            S(c0633m12);
            com.google.android.gms.common.internal.G.d(str2);
            com.google.android.gms.common.internal.G.d(str4);
            c0633m12.J();
            c0633m12.K();
            if (j < 0) {
                C0646q0 c0646q02 = (C0646q0) c0633m12.f3094a;
                W w12 = c0646q02.f11912f;
                C0646q0.l(w12);
                w12.f11580w.d("Invalid time querying triggered conditional properties", W.R(str2), c0646q02.f11916x.a(str4), Long.valueOf(j));
                M04 = Collections.emptyList();
            } else {
                M04 = c0633m12.M0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(M04.size());
            for (C0609e c0609e3 : M04) {
                if (c0609e3 != null) {
                    K1 k12 = c0609e3.f11713c;
                    String str5 = c0609e3.f11711a;
                    com.google.android.gms.common.internal.G.g(str5);
                    String str6 = c0609e3.f11712b;
                    String str7 = k12.f11429b;
                    Object t5 = k12.t();
                    com.google.android.gms.common.internal.G.g(t5);
                    L1 l12 = new L1(str5, str6, str7, j, t5);
                    Object obj = l12.f11445e;
                    String str8 = l12.f11443c;
                    C0633m c0633m13 = this.f11405c;
                    S(c0633m13);
                    if (c0633m13.E0(l12)) {
                        b().f11573B.d("User property triggered", c0609e3.f11711a, c0646q0.f11916x.c(str8), obj);
                    } else {
                        b().f11577f.d("Too many active user properties, ignoring", W.R(c0609e3.f11711a), c0646q0.f11916x.c(str8), obj);
                    }
                    C0648s c0648s4 = c0609e3.f11719w;
                    if (c0648s4 != null) {
                        arrayList2.add(c0648s4);
                    }
                    c0609e3.f11713c = new K1(l12);
                    c0609e3.f11715e = true;
                    C0633m c0633m14 = this.f11405c;
                    S(c0633m14);
                    c0633m14.I0(c0609e3);
                }
            }
            l(c10, o12);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                l(new C0648s((C0648s) it5.next(), j), o12);
            }
            C0633m c0633m15 = this.f11405c;
            S(c0633m15);
            c0633m15.y0();
            C0633m c0633m16 = this.f11405c;
            S(c0633m16);
            c0633m16.z0();
        } catch (Throwable th) {
            C0633m c0633m17 = this.f11405c;
            S(c0633m17);
            c0633m17.z0();
            throw th;
        }
    }

    public final M1 j0() {
        C0646q0 c0646q0 = this.f11414z;
        com.google.android.gms.common.internal.G.g(c0646q0);
        M1 m12 = c0646q0.f11915w;
        C0646q0.j(m12);
        return m12;
    }

    public final Bundle k(C0648s c0648s, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", c0648s.f11930b.f11922a.getLong("_sid"));
        C0633m c0633m = this.f11405c;
        S(c0633m);
        L1 F02 = c0633m.F0(str, "_sno");
        if (F02 != null) {
            Object obj = F02.f11445e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final void k0() {
        if (!this.f11380A.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:413|(15:(2:415|(16:417|418|419|420|421|422|(1:424)|57|(0)(0)|60|61|62|(0)(0)|68|69|70))|435|436|437|422|(0)|57|(0)(0)|60|61|62|(0)(0)|68|69|70)|427|428|429|430|431|432|433|434) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:413|(2:415|(16:417|418|419|420|421|422|(1:424)|57|(0)(0)|60|61|62|(0)(0)|68|69|70))|427|428|429|430|431|432|433|434|435|436|437|422|(0)|57|(0)(0)|60|61|62|(0)(0)|68|69|70) */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0ba2, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x02fd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0308, code lost:
    
        ((Y5.C0646q0) r14.f3094a).b().N().c("Error pruning currencies. appId", Y5.W.R(r13), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0372, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0300, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0301, code lost:
    
        r28 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05a0 A[Catch: all -> 0x0239, TryCatch #14 {all -> 0x0239, blocks: (B:57:0x0379, B:60:0x03b2, B:64:0x03ee, B:66:0x03f5, B:67:0x040c, B:72:0x0417, B:74:0x0431, B:76:0x043a, B:77:0x0451, B:80:0x0473, B:84:0x0497, B:85:0x04ae, B:86:0x04b8, B:89:0x04d5, B:90:0x04f0, B:92:0x04f8, B:94:0x0504, B:96:0x050a, B:97:0x0511, B:99:0x051e, B:101:0x0526, B:103:0x052e, B:106:0x0538, B:109:0x0544, B:111:0x054c, B:113:0x0555, B:116:0x0579, B:121:0x05a0, B:122:0x05b5, B:367:0x0588, B:376:0x0389, B:382:0x03a1, B:385:0x03a9, B:396:0x01f5, B:399:0x01ff, B:401:0x0214, B:406:0x022d, B:409:0x0260, B:411:0x0266, B:413:0x0274, B:415:0x0282, B:417:0x028d, B:421:0x02a6, B:422:0x0337, B:424:0x0341, B:428:0x02ca, B:430:0x02e9, B:433:0x02ef, B:434:0x0319, B:437:0x032a, B:446:0x0308, B:454:0x023b), top: B:395:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05e4 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06c1 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06ca A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x06d8 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06e6 A[Catch: all -> 0x065e, TRY_LEAVE, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0706 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x073d A[Catch: all -> 0x065e, TRY_ENTER, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x07ed A[Catch: all -> 0x065e, TRY_ENTER, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x081b A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0826 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x08c0 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x08d0 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08e9 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x08f8 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0910 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x09e7 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x09fe A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a6a A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0a88 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0aa1 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0b96 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0c3f A[Catch: all -> 0x065e, SQLiteException -> 0x0c55, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0c55, blocks: (B:280:0x0c2e, B:282:0x0c3f), top: B:279:0x0c2e, outer: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0c58  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0ba4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08fd A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0820 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0681 A[Catch: all -> 0x065e, TryCatch #16 {all -> 0x065e, blocks: (B:125:0x05b9, B:127:0x05e4, B:130:0x0610, B:132:0x0663, B:133:0x068f, B:135:0x06c1, B:136:0x06c4, B:138:0x06ca, B:139:0x06d2, B:141:0x06d8, B:142:0x06e0, B:144:0x06e6, B:148:0x06f8, B:149:0x06fb, B:151:0x0706, B:152:0x070e, B:155:0x073d, B:157:0x0746, B:161:0x075d, B:165:0x076c, B:170:0x07ed, B:171:0x07f0, B:173:0x07ff, B:175:0x081b, B:177:0x0826, B:179:0x0833, B:180:0x084f, B:182:0x0855, B:185:0x086f, B:187:0x087b, B:189:0x0888, B:192:0x08b6, B:197:0x08c0, B:198:0x08c3, B:200:0x08d0, B:201:0x08d5, B:203:0x08e9, B:205:0x08ed, B:207:0x08f8, B:208:0x0906, B:210:0x0910, B:212:0x091b, B:213:0x0924, B:215:0x0930, B:217:0x093c, B:220:0x0948, B:222:0x0954, B:224:0x096a, B:225:0x0984, B:227:0x0990, B:228:0x0999, B:229:0x09ad, B:231:0x09e7, B:233:0x09f1, B:234:0x09f4, B:236:0x09fe, B:238:0x0a1d, B:239:0x0a28, B:240:0x0a62, B:242:0x0a6a, B:244:0x0a74, B:245:0x0a7e, B:247:0x0a88, B:248:0x0a92, B:249:0x0a9b, B:251:0x0aa1, B:253:0x0add, B:255:0x0aef, B:258:0x0b0e, B:260:0x0b1e, B:264:0x0afe, B:268:0x0b2a, B:270:0x0b6e, B:271:0x0b79, B:272:0x0b90, B:274:0x0b96, B:278:0x0bde, B:280:0x0c2e, B:282:0x0c3f, B:283:0x0cab, B:288:0x0c5a, B:291:0x0c5d, B:294:0x0ba4, B:296:0x0bcc, B:302:0x0c7c, B:303:0x0c95, B:307:0x0c96, B:310:0x08fd, B:317:0x08a6, B:323:0x0820, B:324:0x0777, B:327:0x0784, B:330:0x0792, B:333:0x07a0, B:336:0x07ae, B:339:0x07bc, B:342:0x07c8, B:345:0x07d6, B:359:0x0681), top: B:124:0x05b9, inners: #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0389 A[Catch: all -> 0x0239, TRY_LEAVE, TryCatch #14 {all -> 0x0239, blocks: (B:57:0x0379, B:60:0x03b2, B:64:0x03ee, B:66:0x03f5, B:67:0x040c, B:72:0x0417, B:74:0x0431, B:76:0x043a, B:77:0x0451, B:80:0x0473, B:84:0x0497, B:85:0x04ae, B:86:0x04b8, B:89:0x04d5, B:90:0x04f0, B:92:0x04f8, B:94:0x0504, B:96:0x050a, B:97:0x0511, B:99:0x051e, B:101:0x0526, B:103:0x052e, B:106:0x0538, B:109:0x0544, B:111:0x054c, B:113:0x0555, B:116:0x0579, B:121:0x05a0, B:122:0x05b5, B:367:0x0588, B:376:0x0389, B:382:0x03a1, B:385:0x03a9, B:396:0x01f5, B:399:0x01ff, B:401:0x0214, B:406:0x022d, B:409:0x0260, B:411:0x0266, B:413:0x0274, B:415:0x0282, B:417:0x028d, B:421:0x02a6, B:422:0x0337, B:424:0x0341, B:428:0x02ca, B:430:0x02e9, B:433:0x02ef, B:434:0x0319, B:437:0x032a, B:446:0x0308, B:454:0x023b), top: B:395:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0341 A[Catch: all -> 0x0239, TryCatch #14 {all -> 0x0239, blocks: (B:57:0x0379, B:60:0x03b2, B:64:0x03ee, B:66:0x03f5, B:67:0x040c, B:72:0x0417, B:74:0x0431, B:76:0x043a, B:77:0x0451, B:80:0x0473, B:84:0x0497, B:85:0x04ae, B:86:0x04b8, B:89:0x04d5, B:90:0x04f0, B:92:0x04f8, B:94:0x0504, B:96:0x050a, B:97:0x0511, B:99:0x051e, B:101:0x0526, B:103:0x052e, B:106:0x0538, B:109:0x0544, B:111:0x054c, B:113:0x0555, B:116:0x0579, B:121:0x05a0, B:122:0x05b5, B:367:0x0588, B:376:0x0389, B:382:0x03a1, B:385:0x03a9, B:396:0x01f5, B:399:0x01ff, B:401:0x0214, B:406:0x022d, B:409:0x0260, B:411:0x0266, B:413:0x0274, B:415:0x0282, B:417:0x028d, B:421:0x02a6, B:422:0x0337, B:424:0x0341, B:428:0x02ca, B:430:0x02e9, B:433:0x02ef, B:434:0x0319, B:437:0x032a, B:446:0x0308, B:454:0x023b), top: B:395:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03ee A[Catch: all -> 0x0239, TRY_ENTER, TryCatch #14 {all -> 0x0239, blocks: (B:57:0x0379, B:60:0x03b2, B:64:0x03ee, B:66:0x03f5, B:67:0x040c, B:72:0x0417, B:74:0x0431, B:76:0x043a, B:77:0x0451, B:80:0x0473, B:84:0x0497, B:85:0x04ae, B:86:0x04b8, B:89:0x04d5, B:90:0x04f0, B:92:0x04f8, B:94:0x0504, B:96:0x050a, B:97:0x0511, B:99:0x051e, B:101:0x0526, B:103:0x052e, B:106:0x0538, B:109:0x0544, B:111:0x054c, B:113:0x0555, B:116:0x0579, B:121:0x05a0, B:122:0x05b5, B:367:0x0588, B:376:0x0389, B:382:0x03a1, B:385:0x03a9, B:396:0x01f5, B:399:0x01ff, B:401:0x0214, B:406:0x022d, B:409:0x0260, B:411:0x0266, B:413:0x0274, B:415:0x0282, B:417:0x028d, B:421:0x02a6, B:422:0x0337, B:424:0x0341, B:428:0x02ca, B:430:0x02e9, B:433:0x02ef, B:434:0x0319, B:437:0x032a, B:446:0x0308, B:454:0x023b), top: B:395:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0415  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0648s c0648s, O1 o12) {
        Throwable th;
        boolean z8;
        boolean equals;
        r rVar;
        String str;
        String str2;
        long j;
        String str3;
        String str4;
        String str5;
        String str6;
        L1 l12;
        String str7;
        long j10;
        long intValue;
        C0646q0 c0646q0;
        C0646q0 c0646q02;
        String str8;
        long j11;
        C0645q j02;
        String str9;
        C0645q a9;
        zzic zzaE;
        String str10;
        String str11;
        String str12;
        long j12;
        String str13;
        boolean T10;
        B0 b02;
        long j13;
        long j14;
        Map emptyMap;
        String str14;
        String str15;
        ArrayList arrayList;
        C0 j15;
        String str16;
        C0 c02;
        S4.k kVar;
        B0 b03;
        C0601b0 N02;
        C0 c03;
        int i7;
        List G02;
        int i10;
        C0633m f02;
        C0633m f03;
        S4.k kVar2;
        Iterator<String> it;
        ContentValues contentValues;
        String str17;
        long u02;
        Pair N10;
        C0601b0 N03;
        String str18;
        L1 F02;
        com.google.android.gms.common.internal.G.g(o12);
        long j16 = o12.f11492E;
        String str19 = o12.f11494G;
        long j17 = o12.f11510e;
        String str20 = o12.f11496I;
        String str21 = o12.f11508c;
        String str22 = o12.f11509d;
        String str23 = o12.f11506a;
        com.google.android.gms.common.internal.G.d(str23);
        long nanoTime = System.nanoTime();
        c().J();
        k0();
        i0();
        String str24 = o12.f11507b;
        if (TextUtils.isEmpty(str24)) {
            return;
        }
        boolean z10 = o12.f11513v;
        if (!z10) {
            a0(o12);
            return;
        }
        C0628k0 e02 = e0();
        String str25 = c0648s.f11929a;
        boolean Y2 = e02.Y(str23, str25);
        C0646q0 c0646q03 = this.f11414z;
        R7.b bVar = this.f11402X;
        if (Y2) {
            b().O().c("Dropping blocked event. appId", W.R(str23), c0646q03.m().a(str25));
            if (!"1".equals(e0().a(str23, "measurement.upload.blacklist_internal")) && !"1".equals(e0().a(str23, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str25)) {
                    return;
                }
                j0();
                M1.Z(bVar, str23, 11, "_ev", str25, 0);
                return;
            }
            C0601b0 N04 = f0().N0(str23);
            if (N04 != null) {
                C0646q0 c0646q04 = N04.f11653a;
                C0640o0 c0640o0 = c0646q04.f11913u;
                C0646q0.l(c0640o0);
                c0640o0.J();
                long j18 = N04.f11652S;
                C0640o0 c0640o02 = c0646q04.f11913u;
                C0646q0.l(c0640o02);
                c0640o02.J();
                long max = Math.max(j18, N04.f11651R);
                ((M5.b) e()).getClass();
                long abs = Math.abs(System.currentTimeMillis() - max);
                d0();
                if (abs > ((Long) F.f11278N.a(null)).longValue()) {
                    b().P().a("Fetching config for blocked app");
                    y(N04);
                    return;
                }
                return;
            }
            return;
        }
        X a10 = X.a(c0648s);
        M1 j03 = j0();
        C0615g d02 = d0();
        d02.getClass();
        j03.S(a10, Math.max(Math.min(d02.R(str23, F.f11298X), 100), 25));
        int max2 = Math.max(Math.min(d0().R(str23, F.f11322g0), 35), 10);
        Bundle bundle = (Bundle) a10.f11589e;
        Iterator it2 = new TreeSet(bundle.keySet()).iterator();
        while (it2.hasNext()) {
            String str26 = (String) it2.next();
            Iterator it3 = it2;
            if ("items".equals(str26)) {
                j0().T(bundle.getParcelableArray(str26), max2);
            }
            it2 = it3;
        }
        C0648s c10 = a10.c();
        String str27 = c10.f11929a;
        if (Log.isLoggable(b().T(), 2)) {
            b().Q().b(c0646q03.m().d(c10), "Logging event");
        }
        f0().x0();
        try {
            a0(o12);
            z8 = "ecommerce_purchase".equals(str27) || "purchase".equals(str27) || "refund".equals(str27);
            equals = "_iap".equals(str27);
            rVar = c10.f11930b;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (!equals) {
                if (!z8) {
                    str = "raw_events";
                    str3 = "_sno";
                    str5 = "value";
                    str6 = str23;
                    str4 = str24;
                    boolean H02 = M1.H0(str27);
                    boolean equals2 = "_err".equals(str27);
                    j0();
                    if (rVar == null) {
                        j10 = 0;
                    } else {
                        Iterator<String> it4 = rVar.f11922a.keySet().iterator();
                        j10 = 0;
                        while (it4.hasNext()) {
                            try {
                                if (rVar.t(it4.next()) instanceof Parcelable[]) {
                                    j10 += ((Parcelable[]) r8).length;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                f0().z0();
                                throw th;
                            }
                        }
                    }
                    C0624j Q02 = f0().Q0(g(), str6, j10 + 1, true, H02, false, equals2, false, false, false);
                    long j19 = Q02.f11782b;
                    d0();
                    intValue = j19 - ((Integer) F.f11333l.a(null)).intValue();
                    if (intValue <= 0) {
                        if (H02) {
                            long j20 = Q02.f11781a;
                            d0();
                            long intValue2 = j20 - ((Integer) F.f11337n.a(null)).intValue();
                            if (intValue2 > 0) {
                                if (intValue2 % 1000 == 1) {
                                    b().N().c("Data loss. Too many public events logged. appId, count", W.R(str6), Long.valueOf(Q02.f11781a));
                                }
                                j0();
                                M1.Z(bVar, str6, 16, "_ev", c10.f11929a, 0);
                                f0().y0();
                            }
                        }
                        String str28 = o12.f11506a;
                        if (equals2) {
                            c0646q0 = c0646q03;
                            long max3 = Q02.f11784d - Math.max(0, Math.min(1000000, d0().R(str28, F.f11335m)));
                            if (max3 > 0) {
                                if (max3 == 1) {
                                    b().N().c("Too many error events logged. appId, count", W.R(str6), Long.valueOf(Q02.f11784d));
                                }
                                f0().y0();
                            }
                        } else {
                            c0646q0 = c0646q03;
                        }
                        Bundle D10 = rVar.D();
                        M1 j04 = j0();
                        String str29 = c10.f11931c;
                        j04.Y(D10, "_o", str29);
                        if (j0().j0(str6, o12.f11502P)) {
                            c0646q02 = c0646q0;
                            j0().Y(D10, "_dbg", 1L);
                            j0().Y(D10, "_r", 1L);
                        } else {
                            c0646q02 = c0646q0;
                        }
                        if ("_s".equals(str27) && (F02 = f0().F0(str28, (str18 = str3))) != null) {
                            Object obj = F02.f11445e;
                            if (obj instanceof Long) {
                                j0().Y(D10, str18, obj);
                            }
                        }
                        if (d0().T(null, F.f11299X0) && Objects.equals(str29, "am") && str27.equals("_ai")) {
                            String str30 = str5;
                            Object obj2 = D10.get(str30);
                            if (obj2 instanceof String) {
                                try {
                                    double parseDouble = Double.parseDouble((String) obj2);
                                    D10.remove(str30);
                                    D10.putDouble(str30, parseDouble);
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                        C0633m f04 = f0();
                        C0646q0 c0646q05 = (C0646q0) f04.f3094a;
                        com.google.android.gms.common.internal.G.d(str6);
                        f04.J();
                        f04.K();
                        try {
                            str8 = str;
                            try {
                                j11 = f04.A0().delete(str8, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, c0646q05.f11910d.R(str6, F.f11343q))))});
                            } catch (SQLiteException e2) {
                                e = e2;
                                c0646q05.b().N().c("Error deleting over the limit events. appId", W.R(str6), e);
                                j11 = 0;
                                if (j11 > 0) {
                                }
                                C0646q0 c0646q06 = this.f11414z;
                                S4.k kVar3 = new S4.k(c0646q06, c10.f11931c, str6, c10.f11929a, c10.f11932d, 0L, D10);
                                C0633m f05 = f0();
                                String str31 = (String) kVar3.f9133e;
                                j02 = f05.j0("events", str6, str31);
                                if (j02 != null) {
                                }
                                f0().k0("events", a9);
                                c().J();
                                k0();
                                String str32 = (String) kVar3.f9132d;
                                com.google.android.gms.common.internal.G.d(str32);
                                com.google.android.gms.common.internal.G.b(str32.equals(str28));
                                zzaE = zzid.zzaE();
                                zzaE.zza(1);
                                zzaE.zzC("android");
                                if (!TextUtils.isEmpty(str28)) {
                                }
                                if (TextUtils.isEmpty(str22)) {
                                }
                                if (TextUtils.isEmpty(str21)) {
                                }
                                if (TextUtils.isEmpty(str20)) {
                                }
                                j12 = o12.f11515x;
                                if (j12 != -2147483648L) {
                                }
                                zzaE.zzN(j17);
                                if (TextUtils.isEmpty(str4)) {
                                }
                                com.google.android.gms.common.internal.G.g(str28);
                                String str33 = str12;
                                C0 j21 = a(str28).j(C0.c(100, str19));
                                zzaE.zzat(j21.f());
                                zzql.zza();
                                T10 = d0().T(str28, F.f11283P0);
                                b02 = B0.AD_STORAGE;
                                if (T10) {
                                }
                                j13 = j12;
                                j14 = o12.f11511f;
                                if (j14 != 0) {
                                }
                                zzaE.zzar(j16);
                                C0598a0 i02 = i0();
                                C0646q0 c0646q07 = (C0646q0) i02.f3094a;
                                zzjq zza = zzjq.zza(i02.f12021b.f11414z.d().getContentResolver(), zzka.zza("com.google.android.gms.measurement"), D.f11233b);
                                if (zza == null) {
                                }
                                if (emptyMap == null) {
                                }
                                str14 = str10;
                                str15 = str11;
                                arrayList = null;
                                if (arrayList != null) {
                                }
                                if (d0().T(null, F.f11309b1)) {
                                }
                                j15 = a(str28).j(C0.c(100, str19));
                                if (j15.i(b02)) {
                                }
                                str16 = "_r";
                                c02 = j15;
                                kVar = kVar3;
                                b03 = b02;
                                c0646q02.p().L();
                                zzaE.zzF(Build.MODEL);
                                c0646q02.p().L();
                                zzaE.zzE(Build.VERSION.RELEASE);
                                zzaE.zzI((int) c0646q02.p().N());
                                zzaE.zzH(c0646q02.p().O());
                                zzaE.zzay(o12.f11498K);
                                if (c0646q02.a()) {
                                }
                                N02 = f0().N0(str28);
                                if (N02 == null) {
                                }
                                if (c03.i(B0.ANALYTICS_STORAGE)) {
                                }
                                if (!TextUtils.isEmpty(N02.J())) {
                                }
                                G02 = f0().G0(str28);
                                i10 = i7;
                                while (i10 < G02.size()) {
                                }
                                try {
                                    f02 = f0();
                                    zzid zzidVar = (zzid) zzaE.zzbc();
                                    f02.J();
                                    f02.K();
                                    com.google.android.gms.common.internal.G.g(zzidVar);
                                    com.google.android.gms.common.internal.G.d(zzidVar.zzA());
                                    byte[] zzcc = zzidVar.zzcc();
                                    long u03 = f02.f12021b.i0().u0(zzcc);
                                    ContentValues contentValues2 = new ContentValues();
                                    contentValues2.put("app_id", zzidVar.zzA());
                                    contentValues2.put("metadata_fingerprint", Long.valueOf(u03));
                                    contentValues2.put("metadata", zzcc);
                                    try {
                                        f02.A0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                        f03 = f0();
                                        kVar2 = kVar;
                                        r rVar2 = (r) kVar2.g;
                                        Objects.requireNonNull(rVar2);
                                        it = rVar2.f11922a.keySet().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                            }
                                        }
                                        f03.J();
                                        f03.K();
                                        String str34 = (String) kVar2.f9132d;
                                        com.google.android.gms.common.internal.G.d(str34);
                                        byte[] zzcc2 = f03.f12021b.i0().l0(kVar2).zzcc();
                                        contentValues = new ContentValues();
                                        contentValues.put("app_id", str34);
                                        contentValues.put("name", (String) kVar2.f9133e);
                                        contentValues.put("timestamp", Long.valueOf(kVar2.f9130b));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(u03));
                                        contentValues.put("data", zzcc2);
                                        contentValues.put("realtime", Integer.valueOf(i7));
                                        try {
                                            if (f03.A0().insert(str9, null, contentValues) == -1) {
                                            }
                                        } catch (SQLiteException e10) {
                                            ((C0646q0) f03.f3094a).b().N().c("Error storing raw event. appId", W.R((String) kVar2.f9132d), e10);
                                        }
                                    } catch (SQLiteException e11) {
                                        ((C0646q0) f02.f3094a).b().N().c("Error storing raw event metadata. appId", W.R(zzidVar.zzA()), e11);
                                        throw e11;
                                    }
                                } catch (IOException e12) {
                                    b().N().c("Data loss. Failed to insert raw event metadata. appId", W.R(zzaE.zzK()), e12);
                                }
                                f0().y0();
                                f0().z0();
                                L();
                                b().Q().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                return;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            str8 = str;
                        }
                        if (j11 > 0) {
                            b().O().c("Data lost. Too many events stored on disk, deleted. appId", W.R(str6), Long.valueOf(j11));
                        }
                        try {
                            C0646q0 c0646q062 = this.f11414z;
                            S4.k kVar32 = new S4.k(c0646q062, c10.f11931c, str6, c10.f11929a, c10.f11932d, 0L, D10);
                            C0633m f052 = f0();
                            String str312 = (String) kVar32.f9133e;
                            j02 = f052.j0("events", str6, str312);
                            if (j02 != null) {
                                long b04 = f0().b0(str6);
                                d0().getClass();
                                E e14 = F.f11296W;
                                str9 = str8;
                                String str35 = str6;
                                if (b04 >= Math.max(Math.min(r3.R(str6, e14), 2000), 500) && H02) {
                                    U N11 = b().N();
                                    V R10 = W.R(str35);
                                    String a11 = c0646q062.m().a(str312);
                                    C0615g d03 = d0();
                                    d03.getClass();
                                    N11.d("Too many event names used, ignoring event. appId, name, supported count", R10, a11, Integer.valueOf(Math.max(Math.min(d03.R(str35, e14), 2000), 500)));
                                    j0();
                                    M1.Z(bVar, str35, 8, null, null, 0);
                                    f0().z0();
                                }
                                a9 = new C0645q(str35, str312, 0L, 0L, 0L, kVar32.f9130b, 0L, null, null, null, null);
                            } else {
                                str9 = str8;
                                kVar32 = kVar32.e(c0646q062, j02.f11886f);
                                a9 = j02.a(kVar32.f9130b);
                            }
                            f0().k0("events", a9);
                            c().J();
                            k0();
                            String str322 = (String) kVar32.f9132d;
                            com.google.android.gms.common.internal.G.d(str322);
                            com.google.android.gms.common.internal.G.b(str322.equals(str28));
                            zzaE = zzid.zzaE();
                            zzaE.zza(1);
                            zzaE.zzC("android");
                            if (!TextUtils.isEmpty(str28)) {
                                zzaE.zzL(str28);
                            }
                            if (TextUtils.isEmpty(str22)) {
                                str10 = str22;
                                zzaE.zzJ(str10);
                            } else {
                                str10 = str22;
                            }
                            if (TextUtils.isEmpty(str21)) {
                                str11 = str21;
                                zzaE.zzM(str11);
                            } else {
                                str11 = str21;
                            }
                            if (TextUtils.isEmpty(str20)) {
                                str12 = str20;
                                zzaE.zzau(str12);
                            } else {
                                str12 = str20;
                            }
                            j12 = o12.f11515x;
                            if (j12 != -2147483648L) {
                                zzaE.zzaj((int) j12);
                            }
                            zzaE.zzN(j17);
                            if (TextUtils.isEmpty(str4)) {
                                str13 = str4;
                                zzaE.zzad(str13);
                            } else {
                                str13 = str4;
                            }
                            com.google.android.gms.common.internal.G.g(str28);
                            String str332 = str12;
                            C0 j212 = a(str28).j(C0.c(100, str19));
                            zzaE.zzat(j212.f());
                            zzql.zza();
                            T10 = d0().T(str28, F.f11283P0);
                            b02 = B0.AD_STORAGE;
                            if (T10) {
                                j0();
                                if (M1.f0(str28)) {
                                    zzaE.zzaH(o12.f11500N);
                                    j13 = j12;
                                    long j22 = o12.f11501O;
                                    if (!j212.i(b02) && j22 != 0) {
                                        j22 = (j22 & (-2)) | 32;
                                    }
                                    zzaE.zzaz(j22 == 1);
                                    if (j22 != 0) {
                                        zzhd zzh = zzhe.zzh();
                                        zzh.zza((j22 & 1) != 0);
                                        zzh.zzb((j22 & 2) != 0);
                                        zzh.zzc((j22 & 4) != 0);
                                        zzh.zzd((j22 & 8) != 0);
                                        zzh.zze((j22 & 16) != 0);
                                        zzh.zzf((j22 & 32) != 0);
                                        zzh.zzg((j22 & 64) != 0);
                                        zzaE.zzaI((zzhe) zzh.zzbc());
                                    }
                                    j14 = o12.f11511f;
                                    if (j14 != 0) {
                                        zzaE.zzY(j14);
                                    }
                                    zzaE.zzar(j16);
                                    C0598a0 i022 = i0();
                                    C0646q0 c0646q072 = (C0646q0) i022.f3094a;
                                    zzjq zza2 = zzjq.zza(i022.f12021b.f11414z.d().getContentResolver(), zzka.zza("com.google.android.gms.measurement"), D.f11233b);
                                    emptyMap = zza2 == null ? Collections.emptyMap() : zza2.zzb();
                                    if (emptyMap == null && !emptyMap.isEmpty()) {
                                        arrayList = new ArrayList();
                                        str14 = str10;
                                        int intValue3 = ((Integer) F.f11320f0.a(null)).intValue();
                                        Iterator it5 = emptyMap.entrySet().iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                str15 = str11;
                                                break;
                                            }
                                            Map.Entry entry = (Map.Entry) it5.next();
                                            Iterator it6 = it5;
                                            str15 = str11;
                                            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                                try {
                                                    int parseInt = Integer.parseInt((String) entry.getValue());
                                                    if (parseInt != 0) {
                                                        arrayList.add(Integer.valueOf(parseInt));
                                                        if (arrayList.size() >= intValue3) {
                                                            c0646q072.b().O().b(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                                            break;
                                                        }
                                                        continue;
                                                    } else {
                                                        continue;
                                                    }
                                                } catch (NumberFormatException e15) {
                                                    c0646q072.b().O().b(e15, "Experiment ID NumberFormatException");
                                                }
                                            }
                                            it5 = it6;
                                            str11 = str15;
                                        }
                                        if (arrayList.isEmpty()) {
                                        }
                                        if (arrayList != null) {
                                            zzaE.zzaq(arrayList);
                                        }
                                        if (d0().T(null, F.f11309b1)) {
                                            zzaE.zzaP("");
                                        }
                                        j15 = a(str28).j(C0.c(100, str19));
                                        if (j15.i(b02) && o12.f11489B) {
                                            C0638n1 c0638n1 = this.f11411w;
                                            c0638n1.getClass();
                                            N10 = !j15.i(b02) ? c0638n1.N(str28) : new Pair("", Boolean.FALSE);
                                            if (!TextUtils.isEmpty((CharSequence) N10.first)) {
                                                zzaE.zzQ((String) N10.first);
                                                Object obj3 = N10.second;
                                                if (obj3 != null) {
                                                    zzaE.zzT(((Boolean) obj3).booleanValue());
                                                }
                                                if (!((String) kVar32.f9133e).equals("_fx") && !((String) N10.first).equals("00000000-0000-0000-0000-000000000000") && (N03 = f0().N0(str28)) != null) {
                                                    C0646q0 c0646q08 = N03.f11653a;
                                                    C0640o0 c0640o03 = c0646q08.f11913u;
                                                    C0646q0.l(c0640o03);
                                                    c0640o03.J();
                                                    if (N03.f11674y) {
                                                        u(str28, false, null, null);
                                                        Bundle bundle2 = new Bundle();
                                                        C0640o0 c0640o04 = c0646q08.f11913u;
                                                        C0646q0.l(c0640o04);
                                                        c0640o04.J();
                                                        Long l10 = N03.f11675z;
                                                        if (l10 != null) {
                                                            b03 = b02;
                                                            c02 = j15;
                                                            kVar = kVar32;
                                                            bundle2.putLong("_pfo", Math.max(0L, l10.longValue()));
                                                        } else {
                                                            c02 = j15;
                                                            kVar = kVar32;
                                                            b03 = b02;
                                                        }
                                                        C0640o0 c0640o05 = c0646q08.f11913u;
                                                        C0646q0.l(c0640o05);
                                                        c0640o05.J();
                                                        Long l11 = N03.f11635A;
                                                        if (l11 != null) {
                                                            bundle2.putLong("_uwa", l11.longValue());
                                                        }
                                                        str16 = "_r";
                                                        bundle2.putLong(str16, 1L);
                                                        bVar.x(str28, "_fx", bundle2);
                                                        c0646q02.p().L();
                                                        zzaE.zzF(Build.MODEL);
                                                        c0646q02.p().L();
                                                        zzaE.zzE(Build.VERSION.RELEASE);
                                                        zzaE.zzI((int) c0646q02.p().N());
                                                        zzaE.zzH(c0646q02.p().O());
                                                        zzaE.zzay(o12.f11498K);
                                                        if (c0646q02.a()) {
                                                            zzaE.zzK();
                                                            if (!TextUtils.isEmpty(null)) {
                                                                zzaE.zzam(null);
                                                            }
                                                        }
                                                        N02 = f0().N0(str28);
                                                        if (N02 == null) {
                                                            N02 = new C0601b0(c0646q02, str28);
                                                            c03 = c02;
                                                            N02.F(o(c03));
                                                            N02.K(o12.f11516y);
                                                            N02.H(str13);
                                                            if (c03.i(b03)) {
                                                                N02.I(this.f11411w.O(str28, o12.f11489B));
                                                            }
                                                            N02.e(0L);
                                                            N02.L(0L);
                                                            N02.M(0L);
                                                            N02.O(str15);
                                                            N02.Q(j13);
                                                            N02.R(str14);
                                                            N02.S(j17);
                                                            N02.a(j14);
                                                            N02.d(z10);
                                                            N02.c(j16);
                                                            i7 = 0;
                                                            f0().O0(N02, false);
                                                        } else {
                                                            c03 = c02;
                                                            i7 = 0;
                                                        }
                                                        if (c03.i(B0.ANALYTICS_STORAGE) && !TextUtils.isEmpty(N02.E())) {
                                                            String E10 = N02.E();
                                                            com.google.android.gms.common.internal.G.g(E10);
                                                            zzaE.zzW(E10);
                                                        }
                                                        if (!TextUtils.isEmpty(N02.J())) {
                                                            String J10 = N02.J();
                                                            com.google.android.gms.common.internal.G.g(J10);
                                                            zzaE.zzah(J10);
                                                        }
                                                        G02 = f0().G0(str28);
                                                        i10 = i7;
                                                        while (i10 < G02.size()) {
                                                            zzit zzm = zziu.zzm();
                                                            zzm.zzb(((L1) G02.get(i10)).f11443c);
                                                            zzm.zza(((L1) G02.get(i10)).f11444d);
                                                            i0().h0(zzm, ((L1) G02.get(i10)).f11445e);
                                                            zzaE.zzp(zzm);
                                                            if ("_sid".equals(((L1) G02.get(i10)).f11443c)) {
                                                                C0640o0 c0640o06 = N02.f11653a.f11913u;
                                                                C0646q0.l(c0640o06);
                                                                c0640o06.J();
                                                                if (N02.f11672w != 0) {
                                                                    C0598a0 i03 = i0();
                                                                    if (TextUtils.isEmpty(str332)) {
                                                                        str17 = str332;
                                                                        u02 = 0;
                                                                    } else {
                                                                        str17 = str332;
                                                                        u02 = i03.u0(str17.getBytes(Charset.forName("UTF-8")));
                                                                    }
                                                                    C0640o0 c0640o07 = N02.f11653a.f11913u;
                                                                    C0646q0.l(c0640o07);
                                                                    c0640o07.J();
                                                                    if (u02 != N02.f11672w) {
                                                                        zzaE.zzav();
                                                                    }
                                                                    i10++;
                                                                    str332 = str17;
                                                                }
                                                            }
                                                            str17 = str332;
                                                            i10++;
                                                            str332 = str17;
                                                        }
                                                        f02 = f0();
                                                        zzid zzidVar2 = (zzid) zzaE.zzbc();
                                                        f02.J();
                                                        f02.K();
                                                        com.google.android.gms.common.internal.G.g(zzidVar2);
                                                        com.google.android.gms.common.internal.G.d(zzidVar2.zzA());
                                                        byte[] zzcc3 = zzidVar2.zzcc();
                                                        long u032 = f02.f12021b.i0().u0(zzcc3);
                                                        ContentValues contentValues22 = new ContentValues();
                                                        contentValues22.put("app_id", zzidVar2.zzA());
                                                        contentValues22.put("metadata_fingerprint", Long.valueOf(u032));
                                                        contentValues22.put("metadata", zzcc3);
                                                        f02.A0().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                                        f03 = f0();
                                                        kVar2 = kVar;
                                                        r rVar22 = (r) kVar2.g;
                                                        Objects.requireNonNull(rVar22);
                                                        it = rVar22.f11922a.keySet().iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                C0628k0 e03 = e0();
                                                                String str36 = (String) kVar2.f9132d;
                                                                boolean Z7 = e03.Z(str36, (String) kVar2.f9133e);
                                                                C0624j P02 = f0().P0(g(), str36, false, false, false, false);
                                                                if (Z7 && P02.f11785e < d0().R(str36, F.f11341p)) {
                                                                }
                                                            } else if (str16.equals(it.next())) {
                                                                break;
                                                            }
                                                        }
                                                        f03.J();
                                                        f03.K();
                                                        String str342 = (String) kVar2.f9132d;
                                                        com.google.android.gms.common.internal.G.d(str342);
                                                        byte[] zzcc22 = f03.f12021b.i0().l0(kVar2).zzcc();
                                                        contentValues = new ContentValues();
                                                        contentValues.put("app_id", str342);
                                                        contentValues.put("name", (String) kVar2.f9133e);
                                                        contentValues.put("timestamp", Long.valueOf(kVar2.f9130b));
                                                        contentValues.put("metadata_fingerprint", Long.valueOf(u032));
                                                        contentValues.put("data", zzcc22);
                                                        contentValues.put("realtime", Integer.valueOf(i7));
                                                        if (f03.A0().insert(str9, null, contentValues) == -1) {
                                                            ((C0646q0) f03.f3094a).b().N().b(W.R(str342), "Failed to insert raw event (got -1). appId");
                                                        } else {
                                                            this.f11382C = 0L;
                                                        }
                                                        f0().y0();
                                                        f0().z0();
                                                        L();
                                                        b().Q().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                        str16 = "_r";
                                        c02 = j15;
                                        kVar = kVar32;
                                        b03 = b02;
                                        c0646q02.p().L();
                                        zzaE.zzF(Build.MODEL);
                                        c0646q02.p().L();
                                        zzaE.zzE(Build.VERSION.RELEASE);
                                        zzaE.zzI((int) c0646q02.p().N());
                                        zzaE.zzH(c0646q02.p().O());
                                        zzaE.zzay(o12.f11498K);
                                        if (c0646q02.a()) {
                                        }
                                        N02 = f0().N0(str28);
                                        if (N02 == null) {
                                        }
                                        if (c03.i(B0.ANALYTICS_STORAGE)) {
                                            String E102 = N02.E();
                                            com.google.android.gms.common.internal.G.g(E102);
                                            zzaE.zzW(E102);
                                        }
                                        if (!TextUtils.isEmpty(N02.J())) {
                                        }
                                        G02 = f0().G0(str28);
                                        i10 = i7;
                                        while (i10 < G02.size()) {
                                        }
                                        f02 = f0();
                                        zzid zzidVar22 = (zzid) zzaE.zzbc();
                                        f02.J();
                                        f02.K();
                                        com.google.android.gms.common.internal.G.g(zzidVar22);
                                        com.google.android.gms.common.internal.G.d(zzidVar22.zzA());
                                        byte[] zzcc32 = zzidVar22.zzcc();
                                        long u0322 = f02.f12021b.i0().u0(zzcc32);
                                        ContentValues contentValues222 = new ContentValues();
                                        contentValues222.put("app_id", zzidVar22.zzA());
                                        contentValues222.put("metadata_fingerprint", Long.valueOf(u0322));
                                        contentValues222.put("metadata", zzcc32);
                                        f02.A0().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                                        f03 = f0();
                                        kVar2 = kVar;
                                        r rVar222 = (r) kVar2.g;
                                        Objects.requireNonNull(rVar222);
                                        it = rVar222.f11922a.keySet().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                            }
                                        }
                                        f03.J();
                                        f03.K();
                                        String str3422 = (String) kVar2.f9132d;
                                        com.google.android.gms.common.internal.G.d(str3422);
                                        byte[] zzcc222 = f03.f12021b.i0().l0(kVar2).zzcc();
                                        contentValues = new ContentValues();
                                        contentValues.put("app_id", str3422);
                                        contentValues.put("name", (String) kVar2.f9133e);
                                        contentValues.put("timestamp", Long.valueOf(kVar2.f9130b));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(u0322));
                                        contentValues.put("data", zzcc222);
                                        contentValues.put("realtime", Integer.valueOf(i7));
                                        if (f03.A0().insert(str9, null, contentValues) == -1) {
                                        }
                                        f0().y0();
                                        f0().z0();
                                        L();
                                        b().Q().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                        return;
                                    }
                                    str14 = str10;
                                    str15 = str11;
                                    arrayList = null;
                                    if (arrayList != null) {
                                    }
                                    if (d0().T(null, F.f11309b1)) {
                                    }
                                    j15 = a(str28).j(C0.c(100, str19));
                                    if (j15.i(b02)) {
                                        C0638n1 c0638n12 = this.f11411w;
                                        c0638n12.getClass();
                                        if (!j15.i(b02)) {
                                        }
                                        if (!TextUtils.isEmpty((CharSequence) N10.first)) {
                                        }
                                    }
                                    str16 = "_r";
                                    c02 = j15;
                                    kVar = kVar32;
                                    b03 = b02;
                                    c0646q02.p().L();
                                    zzaE.zzF(Build.MODEL);
                                    c0646q02.p().L();
                                    zzaE.zzE(Build.VERSION.RELEASE);
                                    zzaE.zzI((int) c0646q02.p().N());
                                    zzaE.zzH(c0646q02.p().O());
                                    zzaE.zzay(o12.f11498K);
                                    if (c0646q02.a()) {
                                    }
                                    N02 = f0().N0(str28);
                                    if (N02 == null) {
                                    }
                                    if (c03.i(B0.ANALYTICS_STORAGE)) {
                                    }
                                    if (!TextUtils.isEmpty(N02.J())) {
                                    }
                                    G02 = f0().G0(str28);
                                    i10 = i7;
                                    while (i10 < G02.size()) {
                                    }
                                    f02 = f0();
                                    zzid zzidVar222 = (zzid) zzaE.zzbc();
                                    f02.J();
                                    f02.K();
                                    com.google.android.gms.common.internal.G.g(zzidVar222);
                                    com.google.android.gms.common.internal.G.d(zzidVar222.zzA());
                                    byte[] zzcc322 = zzidVar222.zzcc();
                                    long u03222 = f02.f12021b.i0().u0(zzcc322);
                                    ContentValues contentValues2222 = new ContentValues();
                                    contentValues2222.put("app_id", zzidVar222.zzA());
                                    contentValues2222.put("metadata_fingerprint", Long.valueOf(u03222));
                                    contentValues2222.put("metadata", zzcc322);
                                    f02.A0().insertWithOnConflict("raw_events_metadata", null, contentValues2222, 4);
                                    f03 = f0();
                                    kVar2 = kVar;
                                    r rVar2222 = (r) kVar2.g;
                                    Objects.requireNonNull(rVar2222);
                                    it = rVar2222.f11922a.keySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                        }
                                    }
                                    f03.J();
                                    f03.K();
                                    String str34222 = (String) kVar2.f9132d;
                                    com.google.android.gms.common.internal.G.d(str34222);
                                    byte[] zzcc2222 = f03.f12021b.i0().l0(kVar2).zzcc();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str34222);
                                    contentValues.put("name", (String) kVar2.f9133e);
                                    contentValues.put("timestamp", Long.valueOf(kVar2.f9130b));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(u03222));
                                    contentValues.put("data", zzcc2222);
                                    contentValues.put("realtime", Integer.valueOf(i7));
                                    if (f03.A0().insert(str9, null, contentValues) == -1) {
                                    }
                                    f0().y0();
                                    f0().z0();
                                    L();
                                    b().Q().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                            }
                            j13 = j12;
                            j14 = o12.f11511f;
                            if (j14 != 0) {
                            }
                            zzaE.zzar(j16);
                            C0598a0 i0222 = i0();
                            C0646q0 c0646q0722 = (C0646q0) i0222.f3094a;
                            zzjq zza22 = zzjq.zza(i0222.f12021b.f11414z.d().getContentResolver(), zzka.zza("com.google.android.gms.measurement"), D.f11233b);
                            if (zza22 == null) {
                            }
                            if (emptyMap == null) {
                            }
                            str14 = str10;
                            str15 = str11;
                            arrayList = null;
                            if (arrayList != null) {
                            }
                            if (d0().T(null, F.f11309b1)) {
                            }
                            j15 = a(str28).j(C0.c(100, str19));
                            if (j15.i(b02)) {
                            }
                            str16 = "_r";
                            c02 = j15;
                            kVar = kVar32;
                            b03 = b02;
                            c0646q02.p().L();
                            zzaE.zzF(Build.MODEL);
                            c0646q02.p().L();
                            zzaE.zzE(Build.VERSION.RELEASE);
                            zzaE.zzI((int) c0646q02.p().N());
                            zzaE.zzH(c0646q02.p().O());
                            zzaE.zzay(o12.f11498K);
                            if (c0646q02.a()) {
                            }
                            N02 = f0().N0(str28);
                            if (N02 == null) {
                            }
                            if (c03.i(B0.ANALYTICS_STORAGE)) {
                            }
                            if (!TextUtils.isEmpty(N02.J())) {
                            }
                            G02 = f0().G0(str28);
                            i10 = i7;
                            while (i10 < G02.size()) {
                            }
                            f02 = f0();
                            zzid zzidVar2222 = (zzid) zzaE.zzbc();
                            f02.J();
                            f02.K();
                            com.google.android.gms.common.internal.G.g(zzidVar2222);
                            com.google.android.gms.common.internal.G.d(zzidVar2222.zzA());
                            byte[] zzcc3222 = zzidVar2222.zzcc();
                            long u032222 = f02.f12021b.i0().u0(zzcc3222);
                            ContentValues contentValues22222 = new ContentValues();
                            contentValues22222.put("app_id", zzidVar2222.zzA());
                            contentValues22222.put("metadata_fingerprint", Long.valueOf(u032222));
                            contentValues22222.put("metadata", zzcc3222);
                            f02.A0().insertWithOnConflict("raw_events_metadata", null, contentValues22222, 4);
                            f03 = f0();
                            kVar2 = kVar;
                            r rVar22222 = (r) kVar2.g;
                            Objects.requireNonNull(rVar22222);
                            it = rVar22222.f11922a.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                }
                            }
                            f03.J();
                            f03.K();
                            String str342222 = (String) kVar2.f9132d;
                            com.google.android.gms.common.internal.G.d(str342222);
                            byte[] zzcc22222 = f03.f12021b.i0().l0(kVar2).zzcc();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str342222);
                            contentValues.put("name", (String) kVar2.f9133e);
                            contentValues.put("timestamp", Long.valueOf(kVar2.f9130b));
                            contentValues.put("metadata_fingerprint", Long.valueOf(u032222));
                            contentValues.put("data", zzcc22222);
                            contentValues.put("realtime", Integer.valueOf(i7));
                            if (f03.A0().insert(str9, null, contentValues) == -1) {
                            }
                            f0().y0();
                            f0().z0();
                            L();
                            b().Q().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            f0().z0();
                            throw th;
                        }
                    }
                    if (intValue % 1000 == 1) {
                        b().N().c("Data loss. Too many events logged. appId, count", W.R(str6), Long.valueOf(Q02.f11782b));
                    }
                    f0().y0();
                    f0().z0();
                }
                z8 = true;
            }
            String C2 = rVar.C();
            str = "raw_events";
            Bundle bundle3 = rVar.f11922a;
            if (z8) {
                double doubleValue = rVar.z().doubleValue() * 1000000.0d;
                if (doubleValue == 0.0d) {
                    str2 = "_sno";
                    doubleValue = bundle3.getLong("value") * 1000000.0d;
                } else {
                    str2 = "_sno";
                }
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                    b().O().c("Data lost. Currency value is too big. appId", W.R(str23), Double.valueOf(doubleValue));
                    f0().y0();
                    f0().z0();
                } else {
                    j = Math.round(doubleValue);
                    if ("refund".equals(str27)) {
                        j = -j;
                    }
                }
            } else {
                str2 = "_sno";
                try {
                    j = bundle3.getLong("value");
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    f0().z0();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(C2)) {
                String upperCase = C2.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String concat = "_ltv_".concat(upperCase);
                    L1 F03 = f0().F0(str23, concat);
                    try {
                        if (F03 != null) {
                            Object obj4 = F03.f11445e;
                            if (obj4 instanceof Long) {
                                long longValue = ((Long) obj4).longValue();
                                String str37 = c10.f11931c;
                                try {
                                    ((M5.b) e()).getClass();
                                    l12 = new L1(str23, str37, concat, System.currentTimeMillis(), Long.valueOf(longValue + j));
                                    str4 = str24;
                                    str3 = str2;
                                    str5 = "value";
                                    str6 = str23;
                                    if (!f0().E0(l12)) {
                                        b().N().d("Too many unique user properties are set. Ignoring user property. appId", W.R(str6), c0646q03.m().c(l12.f11443c), l12.f11445e);
                                        j0();
                                        M1.Z(bVar, str6, 9, null, null, 0);
                                    }
                                    boolean H022 = M1.H0(str27);
                                    boolean equals22 = "_err".equals(str27);
                                    j0();
                                    if (rVar == null) {
                                    }
                                    C0624j Q022 = f0().Q0(g(), str6, j10 + 1, true, H022, false, equals22, false, false, false);
                                    long j192 = Q022.f11782b;
                                    d0();
                                    intValue = j192 - ((Integer) F.f11333l.a(null)).intValue();
                                    if (intValue <= 0) {
                                    }
                                    f0().z0();
                                } catch (Throwable th6) {
                                    th = th6;
                                    th = th;
                                    f0().z0();
                                    throw th;
                                }
                            }
                        }
                        ((M5.b) e()).getClass();
                        l12 = new L1(str6, str7, concat, System.currentTimeMillis(), Long.valueOf(j));
                        if (!f0().E0(l12)) {
                        }
                        boolean H0222 = M1.H0(str27);
                        boolean equals222 = "_err".equals(str27);
                        j0();
                        if (rVar == null) {
                        }
                        C0624j Q0222 = f0().Q0(g(), str6, j10 + 1, true, H0222, false, equals222, false, false, false);
                        long j1922 = Q0222.f11782b;
                        d0();
                        intValue = j1922 - ((Integer) F.f11333l.a(null)).intValue();
                        if (intValue <= 0) {
                        }
                        f0().z0();
                    } catch (Throwable th7) {
                        th = th7;
                        th = th;
                        f0().z0();
                        throw th;
                    }
                    C0633m f06 = f0();
                    str4 = str24;
                    str5 = "value";
                    str6 = str23;
                    int R11 = d0().R(str6, F.f11290T) - 1;
                    com.google.android.gms.common.internal.G.d(str6);
                    f06.J();
                    f06.K();
                    str3 = str2;
                    f06.A0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str6, str6, String.valueOf(R11)});
                    str7 = c10.f11931c;
                }
            }
            str3 = str2;
            str5 = "value";
            str6 = str23;
            str4 = str24;
            boolean H02222 = M1.H0(str27);
            boolean equals2222 = "_err".equals(str27);
            j0();
            if (rVar == null) {
            }
            C0624j Q02222 = f0().Q0(g(), str6, j10 + 1, true, H02222, false, equals2222, false, false, false);
            long j19222 = Q02222.f11782b;
            d0();
            intValue = j19222 - ((Integer) F.f11333l.a(null)).intValue();
            if (intValue <= 0) {
            }
            f0().z0();
        } catch (Throwable th8) {
            th = th8;
            th = th;
            f0().z0();
            throw th;
        }
    }

    public final void l0(O1 o12) {
        c().J();
        k0();
        String str = o12.f11506a;
        com.google.android.gms.common.internal.G.d(str);
        C0 c10 = C0.c(o12.L, o12.f11494G);
        a(str);
        b().f11573B.c("Setting storage consent for package", str, c10);
        c().J();
        k0();
        this.f11394P.put(str, c10);
        C0633m c0633m = this.f11405c;
        S(c0633m);
        c0633m.q0(str, c10);
    }

    public final void m(C0601b0 c0601b0, zzic zzicVar) {
        R7.a aVar;
        zziu zziuVar;
        int i7;
        EnumC0618h enumC0618h;
        c().J();
        k0();
        String zzaA = zzicVar.zzaA();
        EnumMap enumMap = new EnumMap(B0.class);
        int length = zzaA.length();
        int length2 = B0.values().length;
        EnumC0618h enumC0618h2 = EnumC0618h.UNSET;
        int i10 = 0;
        if (length < length2 || zzaA.charAt(0) != '1') {
            aVar = new R7.a(13);
        } else {
            B0[] values = B0.values();
            int length3 = values.length;
            int i11 = 0;
            int i12 = 1;
            while (i11 < length3) {
                B0 b02 = values[i11];
                int i13 = i12 + 1;
                char charAt = zzaA.charAt(i12);
                EnumC0618h[] values2 = EnumC0618h.values();
                int length4 = values2.length;
                int i14 = i10;
                while (true) {
                    if (i14 >= length4) {
                        enumC0618h = enumC0618h2;
                        break;
                    }
                    enumC0618h = values2[i14];
                    if (enumC0618h.f11772a == charAt) {
                        break;
                    } else {
                        i14++;
                    }
                }
                enumMap.put((EnumMap) b02, (B0) enumC0618h);
                i11++;
                i12 = i13;
                i10 = 0;
            }
            aVar = new R7.a(enumMap);
        }
        String D10 = c0601b0.D();
        c().J();
        k0();
        C0 a9 = a(D10);
        B0 b03 = B0.AD_STORAGE;
        EnumMap enumMap2 = a9.f11230a;
        EnumC0663z0 enumC0663z0 = (EnumC0663z0) enumMap2.get(b03);
        EnumC0663z0 enumC0663z02 = EnumC0663z0.UNINITIALIZED;
        if (enumC0663z0 == null) {
            enumC0663z0 = enumC0663z02;
        }
        int ordinal = enumC0663z0.ordinal();
        EnumC0618h enumC0618h3 = EnumC0618h.REMOTE_ENFORCED_DEFAULT;
        EnumC0618h enumC0618h4 = EnumC0618h.FAILSAFE;
        int i15 = a9.f11231b;
        if (ordinal == 1) {
            aVar.M(b03, enumC0618h3);
        } else if (ordinal == 2 || ordinal == 3) {
            aVar.K(b03, i15);
        } else {
            aVar.M(b03, enumC0618h4);
        }
        B0 b04 = B0.ANALYTICS_STORAGE;
        EnumC0663z0 enumC0663z03 = (EnumC0663z0) enumMap2.get(b04);
        if (enumC0663z03 != null) {
            enumC0663z02 = enumC0663z03;
        }
        int ordinal2 = enumC0663z02.ordinal();
        if (ordinal2 == 1) {
            aVar.M(b04, enumC0618h3);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            aVar.K(b04, i15);
        } else {
            aVar.M(b04, enumC0618h4);
        }
        String D11 = c0601b0.D();
        c().J();
        k0();
        C0639o p02 = p0(D11, n0(D11), a(D11), aVar);
        Boolean bool = p02.f11860c;
        com.google.android.gms.common.internal.G.g(bool);
        zzicVar.zzaD(bool.booleanValue());
        String str = p02.f11861d;
        if (!TextUtils.isEmpty(str)) {
            zzicVar.zzaF(str);
        }
        c().J();
        k0();
        Iterator it = zzicVar.zzk().iterator();
        while (true) {
            if (it.hasNext()) {
                zziuVar = (zziu) it.next();
                if ("_npa".equals(zziuVar.zzc())) {
                    break;
                }
            } else {
                zziuVar = null;
                break;
            }
        }
        if (zziuVar != null) {
            B0 b05 = B0.AD_PERSONALIZATION;
            EnumC0618h enumC0618h5 = (EnumC0618h) ((EnumMap) aVar.f8927b).get(b05);
            if (enumC0618h5 == null) {
                enumC0618h5 = enumC0618h2;
            }
            if (enumC0618h5 == enumC0618h2) {
                C0633m c0633m = this.f11405c;
                S(c0633m);
                L1 F02 = c0633m.F0(c0601b0.D(), "_npa");
                EnumC0618h enumC0618h6 = EnumC0618h.MANIFEST;
                EnumC0618h enumC0618h7 = EnumC0618h.API;
                if (F02 != null) {
                    String str2 = F02.f11442b;
                    if ("tcf".equals(str2)) {
                        aVar.M(b05, EnumC0618h.TCF);
                    } else if ("app".equals(str2)) {
                        aVar.M(b05, enumC0618h7);
                    } else {
                        aVar.M(b05, enumC0618h6);
                    }
                } else {
                    Boolean w10 = c0601b0.w();
                    if (w10 == null || ((w10.booleanValue() && zziuVar.zzg() != 1) || !(w10.booleanValue() || zziuVar.zzg() == 0))) {
                        aVar.M(b05, enumC0618h7);
                    } else {
                        aVar.M(b05, enumC0618h6);
                    }
                }
            }
        } else {
            int D12 = D(c0601b0.D(), aVar);
            zzit zzm = zziu.zzm();
            zzm.zzb("_npa");
            ((M5.b) e()).getClass();
            zzm.zza(System.currentTimeMillis());
            zzm.zze(D12);
            zzicVar.zzo((zziu) zzm.zzbc());
            b().f11573B.c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(D12));
        }
        zzicVar.zzaB(aVar.toString());
        String D13 = c0601b0.D();
        C0628k0 c0628k0 = this.f11403a;
        c0628k0.J();
        c0628k0.P(D13);
        zzgf e02 = c0628k0.e0(D13);
        boolean z8 = e02 == null || !e02.zzd() || e02.zze();
        List zzb = zzicVar.zzb();
        for (int i16 = 0; i16 < zzb.size(); i16++) {
            if ("_tcf".equals(((zzhs) zzb.get(i16)).zzd())) {
                zzhr zzhrVar = (zzhr) ((zzhs) zzb.get(i16)).zzcl();
                List zza = zzhrVar.zza();
                int i17 = 0;
                while (true) {
                    if (i17 >= zza.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((zzhw) zza.get(i17)).zzb())) {
                        String zzd = ((zzhw) zza.get(i17)).zzd();
                        if (z8 && zzd.length() > 4) {
                            char[] charArray = zzd.toCharArray();
                            int i18 = 1;
                            while (true) {
                                if (i18 >= 64) {
                                    i7 = 1;
                                    i18 = 0;
                                    break;
                                } else {
                                    if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i18)) {
                                        i7 = 1;
                                        break;
                                    }
                                    i18++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 | i18);
                            zzd = String.valueOf(charArray);
                        }
                        zzhv zzn = zzhw.zzn();
                        zzn.zzb("_tcfd");
                        zzn.zzd(zzd);
                        zzhrVar.zze(i17, zzn);
                    } else {
                        i17++;
                    }
                }
                zzicVar.zzf(i16, zzhrVar);
                return;
            }
        }
    }

    public final void m0(O1 o12) {
        c().J();
        k0();
        String str = o12.f11506a;
        com.google.android.gms.common.internal.G.d(str);
        C0639o b2 = C0639o.b(o12.f11499M);
        b().f11573B.c("Setting DMA consent for package", str, b2);
        c().J();
        k0();
        EnumC0663z0 a9 = C0639o.c(100, o0(str)).a();
        this.f11395Q.put(str, b2);
        C0633m c0633m = this.f11405c;
        S(c0633m);
        com.google.android.gms.common.internal.G.g(str);
        com.google.android.gms.common.internal.G.g(b2);
        c0633m.J();
        c0633m.K();
        C0 e02 = c0633m.e0(str);
        C0 c02 = C0.f11229c;
        if (e02 == c02) {
            c0633m.q0(str, c02);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", b2.f11859b);
        c0633m.i0(contentValues);
        EnumC0663z0 a10 = C0639o.c(100, o0(str)).a();
        c().J();
        k0();
        EnumC0663z0 enumC0663z0 = EnumC0663z0.DENIED;
        EnumC0663z0 enumC0663z02 = EnumC0663z0.GRANTED;
        boolean z8 = a9 == enumC0663z0 && a10 == enumC0663z02;
        boolean z10 = a9 == enumC0663z02 && a10 == enumC0663z0;
        if (z8 || z10) {
            b().f11573B.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            C0633m c0633m2 = this.f11405c;
            S(c0633m2);
            if (c0633m2.P0(g(), str, false, false, false, false).f11786f < d0().R(str, F.f11336m0)) {
                bundle.putLong("_r", 1L);
                C0633m c0633m3 = this.f11405c;
                S(c0633m3);
                b().f11573B.c("_dcu realtime event count", str, Long.valueOf(c0633m3.P0(g(), str, false, false, true, false).f11786f));
            }
            this.f11402X.x(str, "_dcu", bundle);
        }
    }

    public final void n(C0601b0 c0601b0, zzic zzicVar) {
        Serializable Y2;
        c().J();
        k0();
        zzgx zzr = zzha.zzr();
        C0646q0 c0646q0 = c0601b0.f11653a;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        byte[] bArr = c0601b0.f11642H;
        if (bArr != null) {
            try {
                zzr = (zzgx) C0598a0.w0(zzr, bArr);
            } catch (zzmq unused) {
                b().f11580w.b(W.R(c0601b0.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = zzicVar.zzb().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzhs zzhsVar = (zzhs) it.next();
            if (zzhsVar.zzd().equals("_cmp")) {
                zzhw R10 = C0598a0.R(zzhsVar, "gclid");
                Serializable Y10 = R10 == null ? null : C0598a0.Y(R10);
                if (Y10 == null) {
                    Y10 = "";
                }
                String str = (String) Y10;
                zzhw R11 = C0598a0.R(zzhsVar, "gbraid");
                Serializable Y11 = R11 == null ? null : C0598a0.Y(R11);
                if (Y11 == null) {
                    Y11 = "";
                }
                String str2 = (String) Y11;
                zzhw R12 = C0598a0.R(zzhsVar, "gad_source");
                Object Y12 = R12 == null ? null : C0598a0.Y(R12);
                String str3 = (String) (Y12 != null ? Y12 : "");
                String[] split = ((String) F.f11326h1.a(null)).split(",");
                i0();
                HashMap hashMap = new HashMap();
                for (zzhw zzhwVar : zzhsVar.zza()) {
                    if (Arrays.asList(split).contains(zzhwVar.zzb()) && (Y2 = C0598a0.Y(zzhwVar)) != null) {
                        hashMap.put(zzhwVar.zzb(), Y2);
                    }
                }
                if (!hashMap.isEmpty()) {
                    zzhw R13 = C0598a0.R(zzhsVar, "click_timestamp");
                    Object Y13 = R13 == null ? null : C0598a0.Y(R13);
                    long longValue = ((Long) (Y13 != null ? Y13 : 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = zzhsVar.zzf();
                    }
                    zzhw R14 = C0598a0.R(zzhsVar, "_cis");
                    if ("referrer API v2".equals(R14 != null ? C0598a0.Y(R14) : null)) {
                        if (longValue > zzr.zzo()) {
                            if (str.isEmpty()) {
                                zzr.zzj();
                            } else {
                                zzr.zzi(str);
                            }
                            if (str2.isEmpty()) {
                                zzr.zzl();
                            } else {
                                zzr.zzk(str2);
                            }
                            if (str3.isEmpty()) {
                                zzr.zzn();
                            } else {
                                zzr.zzm(str3);
                            }
                            zzr.zzp(longValue);
                            zzr.zzs();
                            zzr.zzt(E(zzhsVar));
                        }
                    } else if (longValue > zzr.zzg()) {
                        if (str.isEmpty()) {
                            zzr.zzb();
                        } else {
                            zzr.zza(str);
                        }
                        if (str2.isEmpty()) {
                            zzr.zzd();
                        } else {
                            zzr.zzc(str2);
                        }
                        if (str3.isEmpty()) {
                            zzr.zzf();
                        } else {
                            zzr.zze(str3);
                        }
                        zzr.zzh(longValue);
                        zzr.zzq();
                        zzr.zzr(E(zzhsVar));
                    }
                }
            }
        }
        if (!((zzha) zzr.zzbc()).equals(zzha.zzs())) {
            zzicVar.zzaM((zzha) zzr.zzbc());
        }
        byte[] zzcc = ((zzha) zzr.zzbc()).zzcc();
        C0640o0 c0640o02 = c0646q0.f11913u;
        C0646q0.l(c0640o02);
        c0640o02.J();
        c0601b0.f11650Q |= c0601b0.f11642H != zzcc;
        c0601b0.f11642H = zzcc;
        if (c0601b0.o()) {
            C0633m c0633m = this.f11405c;
            S(c0633m);
            c0633m.O0(c0601b0, false);
        }
        if (d0().T(null, F.f11323g1)) {
            C0633m c0633m2 = this.f11405c;
            S(c0633m2);
            c0633m2.D0(c0601b0.D(), "_lgclid");
        }
    }

    public final C0639o n0(String str) {
        c().J();
        k0();
        HashMap hashMap = this.f11395Q;
        C0639o c0639o = (C0639o) hashMap.get(str);
        if (c0639o != null) {
            return c0639o;
        }
        C0633m c0633m = this.f11405c;
        S(c0633m);
        com.google.android.gms.common.internal.G.g(str);
        c0633m.J();
        c0633m.K();
        C0639o b2 = C0639o.b(c0633m.h0("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        hashMap.put(str, b2);
        return b2;
    }

    public final String o(C0 c02) {
        if (!c02.i(B0.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        j0().G0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle o0(String str) {
        c().J();
        k0();
        C0628k0 c0628k0 = this.f11403a;
        S(c0628k0);
        if (c0628k0.e0(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        C0 a9 = a(str);
        Bundle bundle2 = new Bundle();
        Iterator it = a9.f11230a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int ordinal = ((EnumC0663z0) entry.getValue()).ordinal();
            String str2 = ordinal != 2 ? ordinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((B0) entry.getKey()).f11227a, str2);
            }
        }
        bundle.putAll(bundle2);
        C0639o p02 = p0(str, n0(str), a9, new R7.a(13));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : p02.f11862e.entrySet()) {
            int ordinal2 = ((EnumC0663z0) entry2.getValue()).ordinal();
            String str3 = ordinal2 != 2 ? ordinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((B0) entry2.getKey()).f11227a, str3);
            }
        }
        Boolean bool = p02.f11860c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = p02.f11861d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        C0633m c0633m = this.f11405c;
        S(c0633m);
        L1 F02 = c0633m.F0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (F02 != null ? F02.f11445e.equals(1L) : D(str, new R7.a(13))) ? "granted" : "denied");
        return bundle;
    }

    public final void p(ArrayList arrayList) {
        com.google.android.gms.common.internal.G.b(!arrayList.isEmpty());
        if (this.f11391M != null) {
            b().f11577f.a("Set uploading progress before finishing the previous upload");
        } else {
            this.f11391M = new ArrayList(arrayList);
        }
    }

    public final C0639o p0(String str, C0639o c0639o, C0 c02, R7.a aVar) {
        B0 b02;
        EnumC0663z0 N10;
        C0628k0 c0628k0 = this.f11403a;
        S(c0628k0);
        zzgf e02 = c0628k0.e0(str);
        EnumC0663z0 enumC0663z0 = EnumC0663z0.DENIED;
        B0 b03 = B0.AD_USER_DATA;
        int i7 = 90;
        if (e02 == null) {
            if (c0639o.a() == enumC0663z0) {
                i7 = c0639o.f11858a;
                aVar.K(b03, i7);
            } else {
                aVar.M(b03, EnumC0618h.FAILSAFE);
            }
            return new C0639o(Boolean.FALSE, i7, Boolean.TRUE, "-");
        }
        EnumC0663z0 a9 = c0639o.a();
        EnumC0663z0 enumC0663z02 = EnumC0663z0.GRANTED;
        if (a9 == enumC0663z02 || a9 == enumC0663z0) {
            i7 = c0639o.f11858a;
            aVar.K(b03, i7);
        } else {
            EnumC0663z0 enumC0663z03 = EnumC0663z0.POLICY;
            EnumC0663z0 enumC0663z04 = EnumC0663z0.UNINITIALIZED;
            if (a9 != enumC0663z03 || (N10 = c0628k0.N(str, b03)) == enumC0663z04) {
                c0628k0.J();
                c0628k0.P(str);
                zzgf e03 = c0628k0.e0(str);
                if (e03 != null) {
                    for (zzfw zzfwVar : e03.zzb()) {
                        if (b03 == C0628k0.U(zzfwVar.zzb())) {
                            b02 = C0628k0.U(zzfwVar.zzc());
                            break;
                        }
                    }
                }
                b02 = null;
                B0 b04 = B0.AD_STORAGE;
                EnumC0663z0 enumC0663z05 = (EnumC0663z0) c02.f11230a.get(b04);
                if (enumC0663z05 != null) {
                    enumC0663z04 = enumC0663z05;
                }
                boolean z8 = enumC0663z04 == enumC0663z02 || enumC0663z04 == enumC0663z0;
                if (b02 == b04 && z8) {
                    aVar.M(b03, EnumC0618h.REMOTE_DELEGATION);
                    a9 = enumC0663z04;
                } else {
                    aVar.M(b03, EnumC0618h.REMOTE_DEFAULT);
                    a9 = true != c0628k0.d0(str, b03) ? enumC0663z0 : enumC0663z02;
                }
            } else {
                aVar.M(b03, EnumC0618h.REMOTE_ENFORCED_DEFAULT);
                a9 = N10;
            }
        }
        c0628k0.J();
        c0628k0.P(str);
        zzgf e04 = c0628k0.e0(str);
        boolean z10 = e04 == null || !e04.zzd() || e04.zze();
        S(c0628k0);
        c0628k0.J();
        c0628k0.P(str);
        TreeSet treeSet = new TreeSet();
        zzgf e05 = c0628k0.e0(str);
        if (e05 != null) {
            Iterator it = e05.zzc().iterator();
            while (it.hasNext()) {
                treeSet.add(((zzgc) it.next()).zza());
            }
        }
        if (a9 == enumC0663z0 || treeSet.isEmpty()) {
            return new C0639o(Boolean.FALSE, i7, Boolean.valueOf(z10), "-");
        }
        return new C0639o(Boolean.TRUE, i7, Boolean.valueOf(z10), z10 ? TextUtils.join("", treeSet) : "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0129, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a4, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [Y5.I1] */
    /* JADX WARN: Type inference failed for: r1v13, types: [long] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v23, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v26, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        C0633m c0633m;
        long longValue;
        SQLiteException e2;
        c().J();
        k0();
        this.f11389J = true;
        try {
            C0646q0 c0646q0 = this.f11414z;
            c0646q0.getClass();
            Boolean bool = c0646q0.o().f11816e;
            if (bool == null) {
                b().f11580w.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                b().f11577f.a("Upload called in the client side when service should be used");
            } else if (this.f11382C > 0) {
                L();
            } else {
                c().J();
                if (this.f11391M != null) {
                    b().f11573B.a("Uploading requested multiple times");
                } else {
                    C0598a0 c0598a0 = this.f11404b;
                    S(c0598a0);
                    if (c0598a0.d0()) {
                        ((M5.b) e()).getClass();
                        ?? currentTimeMillis = System.currentTimeMillis();
                        Cursor cursor = null;
                        r7 = null;
                        Cursor cursor2 = null;
                        r7 = null;
                        r7 = null;
                        String str = null;
                        int R10 = d0().R(null, F.f11328i0);
                        d0();
                        long longValue2 = currentTimeMillis - ((Long) F.f11316e.a(null)).longValue();
                        for (int i7 = 0; i7 < R10 && G(null, longValue2); i7++) {
                        }
                        zzql.zza();
                        c().J();
                        F();
                        long f4 = this.f11411w.f11854v.f();
                        if (f4 != 0) {
                            b().f11572A.b(Long.valueOf(Math.abs(currentTimeMillis - f4)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        C0633m c0633m2 = this.f11405c;
                        S(c0633m2);
                        String R11 = c0633m2.R();
                        long j = -1;
                        if (TextUtils.isEmpty(R11)) {
                            try {
                                this.f11393O = -1L;
                                c0633m = this.f11405c;
                                S(c0633m);
                                d0();
                                longValue = currentTimeMillis - ((Long) F.f11316e.a(null)).longValue();
                                c0633m.J();
                                c0633m.K();
                            } catch (Throwable th) {
                                th = th;
                                cursor = currentTimeMillis;
                            }
                            try {
                                currentTimeMillis = c0633m.A0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(longValue)});
                                try {
                                    if (currentTimeMillis.moveToFirst()) {
                                        str = currentTimeMillis.getString(0);
                                    } else {
                                        W w10 = ((C0646q0) c0633m.f3094a).f11912f;
                                        C0646q0.l(w10);
                                        w10.f11573B.a("No expired configs for apps with pending events");
                                    }
                                } catch (SQLiteException e10) {
                                    e2 = e10;
                                    W w11 = ((C0646q0) c0633m.f3094a).f11912f;
                                    C0646q0.l(w11);
                                    w11.f11577f.b(e2, "Error selecting expired configs");
                                }
                            } catch (SQLiteException e11) {
                                e2 = e11;
                                currentTimeMillis = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                            currentTimeMillis.close();
                            if (!TextUtils.isEmpty(str)) {
                                C0633m c0633m3 = this.f11405c;
                                S(c0633m3);
                                C0601b0 N02 = c0633m3.N0(str);
                                if (N02 != null) {
                                    y(N02);
                                }
                            }
                        } else {
                            if (this.f11393O == -1) {
                                C0633m c0633m4 = this.f11405c;
                                S(c0633m4);
                                try {
                                    try {
                                        cursor2 = c0633m4.A0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursor2.moveToFirst()) {
                                            j = cursor2.getLong(0);
                                        }
                                    } catch (SQLiteException e12) {
                                        W w12 = ((C0646q0) c0633m4.f3094a).f11912f;
                                        C0646q0.l(w12);
                                        w12.f11577f.b(e12, "Error querying raw events");
                                    }
                                    cursor2.close();
                                    this.f11393O = j;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            }
                            r(R11, currentTimeMillis);
                        }
                    } else {
                        b().f11573B.a("Network not connected, ignoring upload request");
                        L();
                    }
                }
            }
            this.f11389J = false;
            M();
        } catch (Throwable th3) {
            this.f11389J = false;
            M();
            throw th3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(14:43|(1:45)|46|47|48|49|50|51|52|53|54|(2:58|59)|56|57)|50|51|52|53|54|(0)|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0218, code lost:
    
        if (r11 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0355, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0790 A[EDGE_INSN: B:236:0x0790->B:237:0x0790 BREAK  A[LOOP:7: B:176:0x0624->B:205:0x077b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:353:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x033e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r35v0, types: [Y5.I1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(String str, long j) {
        Cursor cursor;
        Cursor cursor2;
        List emptyList;
        List<Pair> list;
        String str2;
        List list2;
        C0 a9;
        B0 b02;
        zzhz zzh;
        int size;
        boolean z8;
        boolean i7;
        boolean i10;
        boolean T10;
        F1 f12;
        E1 K10;
        int i11;
        C0646q0 c0646q0;
        String str3;
        String str4;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        E1 e12;
        C0598a0 c0598a0;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str5;
        String str6;
        Cursor cursor3;
        Cursor cursor4;
        List emptyList2;
        Iterator it;
        List list3;
        int i12;
        int i13;
        SQLiteDatabase A02;
        long currentTimeMillis;
        ArrayList arrayList;
        List list4;
        C0633m f02;
        ContentValues contentValues;
        C0633m c0633m;
        byte[] byteArray;
        long j10;
        long j11;
        int R10 = d0().R(str, F.f11324h);
        int i14 = 0;
        int max = Math.max(0, d0().R(str, F.f11327i));
        C0633m f03 = f0();
        C0646q0 c0646q02 = (C0646q0) f03.f3094a;
        f03.J();
        f03.K();
        int i15 = 1;
        com.google.android.gms.common.internal.G.b(R10 > 0);
        ?? r11 = max > 0 ? 1 : 0;
        com.google.android.gms.common.internal.G.b(r11);
        com.google.android.gms.common.internal.G.d(str);
        try {
            try {
                cursor2 = f03.A0().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(R10));
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    c0646q02.b().N().c("Error querying bundles. appId", W.R(str), e);
                    emptyList = Collections.emptyList();
                }
            } catch (Throwable th) {
                th = th;
                cursor = r11;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursor2 = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor2.moveToFirst()) {
            int i16 = 0;
            ?? r12 = new ArrayList();
            while (true) {
                long j12 = cursor2.getLong(i14);
                try {
                    byte[] blob = cursor2.getBlob(i15);
                    C0598a0 i02 = f03.f12021b.i0();
                    try {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        c0633m = f03;
                        r12 = r12;
                        while (true) {
                            try {
                                int read = gZIPInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                list = r12;
                                try {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                    r12 = list;
                                } catch (IOException e11) {
                                    e = e11;
                                    try {
                                        ((C0646q0) i02.f3094a).b().N().b(e, "Failed to ungzip content");
                                        throw e;
                                        break;
                                    } catch (IOException e13) {
                                        e = e13;
                                        c0646q02.b().N().c("Failed to unzip queued bundle. appId", W.R(str), e);
                                        if (cursor2.moveToNext()) {
                                            break;
                                        }
                                        f03 = c0633m;
                                        r12 = list;
                                        i14 = 0;
                                        i15 = 1;
                                        cursor2.close();
                                        if (list.isEmpty()) {
                                        }
                                    }
                                }
                            } catch (IOException e14) {
                                e = e14;
                                list = r12;
                                ((C0646q0) i02.f3094a).b().N().b(e, "Failed to ungzip content");
                                throw e;
                                break;
                                break;
                            }
                        }
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        byteArray = byteArrayOutputStream.toByteArray();
                    } catch (IOException e15) {
                        e = e15;
                        c0633m = f03;
                    }
                } catch (IOException e16) {
                    e = e16;
                    c0633m = f03;
                    list = r12;
                }
                if (!r12.isEmpty() && byteArray.length + i16 > max) {
                    break;
                }
                try {
                    zzic zzicVar = (zzic) C0598a0.w0(zzid.zzaE(), byteArray);
                    if (!r12.isEmpty()) {
                        zzid zzidVar = (zzid) ((Pair) r12.get(0)).first;
                        zzid zzidVar2 = (zzid) zzicVar.zzbc();
                        if (!zzidVar.zzaf().equals(zzidVar2.zzaf()) || !zzidVar.zzam().equals(zzidVar2.zzam()) || zzidVar.zzao() != zzidVar2.zzao() || !zzidVar.zzaq().equals(zzidVar2.zzaq())) {
                            break;
                        }
                        Iterator it2 = zzidVar.zzf().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                j10 = -1;
                                break;
                            }
                            zziu zziuVar = (zziu) it2.next();
                            Iterator it3 = it2;
                            if ("_npa".equals(zziuVar.zzc())) {
                                j10 = zziuVar.zzg();
                                break;
                            }
                            it2 = it3;
                        }
                        Iterator it4 = zzidVar2.zzf().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                j11 = -1;
                                break;
                            }
                            zziu zziuVar2 = (zziu) it4.next();
                            if ("_npa".equals(zziuVar2.zzc())) {
                                j11 = zziuVar2.zzg();
                                break;
                            }
                        }
                        if (j10 != j11) {
                            break;
                        }
                    }
                    if (!cursor2.isNull(2)) {
                        zzicVar.zzao(cursor2.getInt(2));
                    }
                    i16 += byteArray.length;
                    r12.add(Pair.create((zzid) zzicVar.zzbc(), Long.valueOf(j12)));
                } catch (IOException e17) {
                    c0646q02.b().N().c("Failed to merge queued bundle. appId", W.R(str), e17);
                }
                list = r12;
                if (cursor2.moveToNext() || i16 > max) {
                    break;
                    break;
                }
                f03 = c0633m;
                r12 = list;
                i14 = 0;
                i15 = 1;
            }
            list = r12;
            cursor2.close();
            if (list.isEmpty()) {
            }
        } else {
            emptyList = Collections.emptyList();
            cursor2.close();
            list = emptyList;
            if (list.isEmpty()) {
                return;
            }
            zzpk.zza();
            C0615g d02 = d0();
            E e18 = F.f11329i1;
            boolean T11 = d02.T(null, e18);
            B0 b03 = B0.ANALYTICS_STORAGE;
            String str7 = "_f";
            if (T11) {
                zzpk.zza();
                if (d0().T(null, e18)) {
                    if (a(str).i(b03) || !e0().O(str)) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        C0633m f04 = f0();
                        C0646q0 c0646q03 = (C0646q0) f04.f3094a;
                        com.google.android.gms.common.internal.G.d(str);
                        f04.J();
                        f04.K();
                        ArrayList arrayList3 = new ArrayList();
                        try {
                            try {
                                A02 = f04.A0();
                                ((M5.b) c0646q03.e()).getClass();
                                currentTimeMillis = System.currentTimeMillis();
                                cursor4 = A02.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(currentTimeMillis)}, null, null, "rowid", null);
                            } catch (Throwable th3) {
                                th = th3;
                                cursor3 = null;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e19) {
                            e = e19;
                            str2 = "_f";
                        }
                        try {
                            try {
                                if (cursor4.moveToFirst()) {
                                    while (true) {
                                        try {
                                            arrayList3.add((zzhs) ((zzhr) C0598a0.w0(zzhs.zzk(), cursor4.getBlob(0))).zzbc());
                                            str2 = str7;
                                            arrayList = arrayList3;
                                        } catch (zzmq e20) {
                                            arrayList = arrayList3;
                                            str2 = str7;
                                            try {
                                                c0646q03.b().f11582y.c("Failed to parse stored NO_DATA mode event, appId", W.R(str), e20);
                                            } catch (SQLiteException e21) {
                                                e = e21;
                                                c0646q03.b().N().c("Error flushing NO_DATA mode events. appId", W.R(str), e);
                                                emptyList2 = Collections.emptyList();
                                                if (cursor4 != null) {
                                                }
                                                it = list.iterator();
                                                boolean z14 = true;
                                                while (it.hasNext()) {
                                                }
                                                list = arrayList2;
                                                if (list.isEmpty()) {
                                                }
                                                list2 = list;
                                                a9 = a(str);
                                                b02 = B0.AD_STORAGE;
                                                if (a9.i(b02)) {
                                                }
                                                zzh = zzib.zzh();
                                                size = list2.size();
                                                ArrayList arrayList4 = new ArrayList(list2.size());
                                                if (d0().K(str)) {
                                                }
                                                i7 = a(str).i(b02);
                                                i10 = a(str).i(b03);
                                                zzqu.zza();
                                                T10 = d0().T(str, F.f11277M0);
                                                f12 = this.f11412x;
                                                K10 = f12.K(str);
                                                i11 = 0;
                                                while (true) {
                                                    c0646q0 = this.f11414z;
                                                    if (i11 >= size) {
                                                    }
                                                    i11++;
                                                    f12 = r0;
                                                    str2 = str5;
                                                    K10 = r17;
                                                    size = r23;
                                                    list2 = r24;
                                                    i7 = z10;
                                                    z8 = z12;
                                                    i10 = z11;
                                                    T10 = z13;
                                                }
                                                F1 f13 = f12;
                                                E1 e110 = K10;
                                                if (zzh.zzb() == 0) {
                                                }
                                            }
                                        }
                                        if (!cursor4.moveToNext()) {
                                            break;
                                        }
                                        arrayList3 = arrayList;
                                        str7 = str2;
                                    }
                                    cursor4.close();
                                    try {
                                        int delete = A02.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(currentTimeMillis)});
                                        U Q3 = c0646q03.b().Q();
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 34);
                                        sb2.append("Pruned ");
                                        sb2.append(delete);
                                        sb2.append(" NO_DATA mode events. appId");
                                        Q3.b(str, sb2.toString());
                                    } catch (SQLiteException e22) {
                                        e = e22;
                                        cursor4 = null;
                                        c0646q03.b().N().c("Error flushing NO_DATA mode events. appId", W.R(str), e);
                                        emptyList2 = Collections.emptyList();
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        it = list.iterator();
                                        boolean z142 = true;
                                        while (it.hasNext()) {
                                        }
                                        list = arrayList2;
                                        if (list.isEmpty()) {
                                        }
                                        list2 = list;
                                        a9 = a(str);
                                        b02 = B0.AD_STORAGE;
                                        if (a9.i(b02)) {
                                        }
                                        zzh = zzib.zzh();
                                        size = list2.size();
                                        ArrayList arrayList42 = new ArrayList(list2.size());
                                        if (d0().K(str)) {
                                        }
                                        i7 = a(str).i(b02);
                                        i10 = a(str).i(b03);
                                        zzqu.zza();
                                        T10 = d0().T(str, F.f11277M0);
                                        f12 = this.f11412x;
                                        K10 = f12.K(str);
                                        i11 = 0;
                                        while (true) {
                                            c0646q0 = this.f11414z;
                                            if (i11 >= size) {
                                            }
                                            i11++;
                                            f12 = r0;
                                            str2 = str5;
                                            K10 = r17;
                                            size = r23;
                                            list2 = r24;
                                            i7 = z10;
                                            z8 = z12;
                                            i10 = z11;
                                            T10 = z13;
                                        }
                                        F1 f132 = f12;
                                        E1 e1102 = K10;
                                        if (zzh.zzb() == 0) {
                                        }
                                    }
                                } else {
                                    str2 = "_f";
                                    arrayList = arrayList3;
                                    cursor4.close();
                                }
                                emptyList2 = arrayList;
                            } catch (SQLiteException e23) {
                                e = e23;
                                str2 = str7;
                            }
                            it = list.iterator();
                            boolean z1422 = true;
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                zzic zzicVar2 = (zzic) ((zzid) pair.first).zzcl();
                                if (z1422 && !emptyList2.isEmpty()) {
                                    List zzb = zzicVar2.zzb();
                                    zzicVar2.zzi();
                                    zzicVar2.zzh(emptyList2);
                                    zzicVar2.zzh(zzb);
                                    z1422 = false;
                                }
                                zzhh zzb2 = zzho.zzb();
                                zzgf e02 = e0().e0(str);
                                ArrayList arrayList5 = new ArrayList();
                                if (e02 != null) {
                                    for (zzfu zzfuVar : e02.zza()) {
                                        zzhk zza = zzhl.zza();
                                        Iterator it5 = it;
                                        int zzb3 = zzfuVar.zzb() - 1;
                                        boolean z15 = z1422;
                                        if (zzb3 == 1) {
                                            list3 = emptyList2;
                                            i12 = 3;
                                            i13 = 2;
                                        } else if (zzb3 != 2) {
                                            list3 = emptyList2;
                                            i12 = 3;
                                            i13 = zzb3 != 3 ? zzb3 != 4 ? 1 : 5 : 4;
                                        } else {
                                            list3 = emptyList2;
                                            i12 = 3;
                                            i13 = 3;
                                        }
                                        zza.zza(i13);
                                        int zzd = zzfuVar.zzd() - 1;
                                        if (zzd == 1) {
                                            i12 = 2;
                                        } else if (zzd != 2) {
                                            i12 = 1;
                                        }
                                        zza.zzb(i12);
                                        arrayList5.add((zzhl) zza.zzbc());
                                        z1422 = z15;
                                        it = it5;
                                        emptyList2 = list3;
                                    }
                                }
                                Iterator it6 = it;
                                boolean z16 = z1422;
                                List list5 = emptyList2;
                                zzb2.zza(arrayList5);
                                zzicVar2.zzaQ(zzb2);
                                arrayList2.add(Pair.create((zzid) zzicVar2.zzbc(), (Long) pair.second));
                                z1422 = z16;
                                it = it6;
                                emptyList2 = list5;
                            }
                            list = arrayList2;
                            if (list.isEmpty()) {
                                return;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cursor3 = cursor4;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    } else {
                        List asList = Arrays.asList(((String) F.f11331j1.a(null)).split(","));
                        for (Pair pair2 : list) {
                            try {
                                f0().S(((Long) pair2.second).longValue());
                                for (zzhs zzhsVar : ((zzid) pair2.first).zzc()) {
                                    if (asList.contains(zzhsVar.zzd())) {
                                        try {
                                            if (!zzhsVar.zzd().equals("_f")) {
                                                if (zzhsVar.zzd().equals("_v")) {
                                                }
                                                f02 = f0();
                                                C0646q0 c0646q04 = (C0646q0) f02.f3094a;
                                                f02.J();
                                                f02.K();
                                                com.google.android.gms.common.internal.G.g(zzhsVar);
                                                com.google.android.gms.common.internal.G.d(str);
                                                c0646q04.b().Q().b(zzhsVar, "Caching events in NO_DATA mode");
                                                contentValues = new ContentValues();
                                                contentValues.put("app_id", str);
                                                list4 = asList;
                                                contentValues.put("name", zzhsVar.zzd());
                                                contentValues.put("data", zzhsVar.zzcc());
                                                contentValues.put("timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                                                if (f02.A0().insert("no_data_mode_events", null, contentValues) == -1) {
                                                    try {
                                                        c0646q04.b().N().b(W.R(str), "Failed to insert NO_DATA mode event (got -1). appId");
                                                    } catch (SQLiteException e24) {
                                                        e = e24;
                                                        try {
                                                            c0646q04.b().N().c("Error storing NO_DATA mode event. appId", W.R(str), e);
                                                            asList = list4;
                                                        } catch (SQLiteException unused) {
                                                            b().f11582y.b(str, "Failed handling NO_DATA mode bundles. appId");
                                                            asList = list4;
                                                        }
                                                    }
                                                }
                                                asList = list4;
                                            }
                                            contentValues.put("name", zzhsVar.zzd());
                                            contentValues.put("data", zzhsVar.zzcc());
                                            contentValues.put("timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                                            if (f02.A0().insert("no_data_mode_events", null, contentValues) == -1) {
                                            }
                                            asList = list4;
                                        } catch (SQLiteException unused2) {
                                            b().f11582y.b(str, "Failed handling NO_DATA mode bundles. appId");
                                            asList = list4;
                                        }
                                        zzhr zzhrVar = (zzhr) zzhsVar.zzcl();
                                        i0();
                                        C0598a0.P(zzhrVar, "_dac", 1L);
                                        zzhsVar = (zzhs) zzhrVar.zzbc();
                                        f02 = f0();
                                        C0646q0 c0646q042 = (C0646q0) f02.f3094a;
                                        f02.J();
                                        f02.K();
                                        com.google.android.gms.common.internal.G.g(zzhsVar);
                                        com.google.android.gms.common.internal.G.d(str);
                                        c0646q042.b().Q().b(zzhsVar, "Caching events in NO_DATA mode");
                                        contentValues = new ContentValues();
                                        contentValues.put("app_id", str);
                                        list4 = asList;
                                    }
                                }
                            } catch (SQLiteException unused3) {
                                list4 = asList;
                            }
                        }
                        list = Collections.emptyList();
                    }
                }
                str2 = "_f";
                if (list.isEmpty()) {
                }
            } else {
                str2 = "_f";
            }
            list2 = list;
            a9 = a(str);
            b02 = B0.AD_STORAGE;
            if (a9.i(b02)) {
                Iterator it7 = list2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        str6 = null;
                        break;
                    }
                    zzid zzidVar3 = (zzid) ((Pair) it7.next()).first;
                    if (!zzidVar3.zzG().isEmpty()) {
                        str6 = zzidVar3.zzG();
                        break;
                    }
                }
                if (str6 != null) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= list2.size()) {
                            break;
                        }
                        zzid zzidVar4 = (zzid) ((Pair) list2.get(i17)).first;
                        if (!zzidVar4.zzG().isEmpty() && !zzidVar4.zzG().equals(str6)) {
                            list2 = list2.subList(0, i17);
                            break;
                        }
                        i17++;
                    }
                }
            }
            zzh = zzib.zzh();
            size = list2.size();
            ArrayList arrayList422 = new ArrayList(list2.size());
            z8 = !d0().K(str) && a(str).i(b02);
            i7 = a(str).i(b02);
            i10 = a(str).i(b03);
            zzqu.zza();
            T10 = d0().T(str, F.f11277M0);
            f12 = this.f11412x;
            K10 = f12.K(str);
            i11 = 0;
            while (true) {
                c0646q0 = this.f11414z;
                if (i11 >= size) {
                    break;
                }
                int i18 = size;
                zzic zzicVar3 = (zzic) ((zzid) ((Pair) list2.get(i11)).first).zzcl();
                List list6 = list2;
                arrayList422.add((Long) ((Pair) list2.get(i11)).second);
                d0().O();
                F1 f14 = f12;
                E1 e111 = K10;
                zzicVar3.zzO(130000L);
                zzicVar3.zzs(j);
                c0646q0.getClass();
                zzicVar3.zzae(false);
                if (!z8) {
                    zzicVar3.zzan();
                }
                if (!i7) {
                    zzicVar3.zzR();
                    zzicVar3.zzU();
                }
                if (!i10) {
                    zzicVar3.zzX();
                }
                v(zzicVar3, str);
                if (!T10) {
                    zzicVar3.zzav();
                }
                if (!i10) {
                    zzicVar3.zzag();
                }
                String zzP = zzicVar3.zzP();
                if (TextUtils.isEmpty(zzP) || zzP.equals("00000000-0000-0000-0000-000000000000")) {
                    ArrayList arrayList6 = new ArrayList(zzicVar3.zzb());
                    Iterator it8 = arrayList6.iterator();
                    z10 = i7;
                    boolean z17 = false;
                    boolean z18 = false;
                    Long l10 = null;
                    Long l11 = null;
                    while (it8.hasNext()) {
                        boolean z19 = i10;
                        zzhs zzhsVar2 = (zzhs) it8.next();
                        boolean z20 = z8;
                        boolean z21 = T10;
                        if ("_fx".equals(zzhsVar2.zzd())) {
                            it8.remove();
                            z8 = z20;
                            i10 = z19;
                            T10 = z21;
                            z17 = true;
                        } else {
                            String str8 = str2;
                            if (str8.equals(zzhsVar2.zzd())) {
                                i0();
                                zzhw R11 = C0598a0.R(zzhsVar2, "_pfo");
                                if (R11 != null) {
                                    l11 = Long.valueOf(R11.zzf());
                                }
                                i0();
                                zzhw R12 = C0598a0.R(zzhsVar2, "_uwa");
                                if (R12 != null) {
                                    l10 = Long.valueOf(R12.zzf());
                                }
                                str2 = str8;
                                z8 = z20;
                                i10 = z19;
                                T10 = z21;
                            } else {
                                str2 = str8;
                                z8 = z20;
                                i10 = z19;
                                T10 = z21;
                            }
                        }
                        z18 = true;
                    }
                    z11 = i10;
                    z12 = z8;
                    z13 = T10;
                    str5 = str2;
                    if (z17) {
                        zzicVar3.zzi();
                        zzicVar3.zzh(arrayList6);
                    }
                    if (z18) {
                        u(zzicVar3.zzK(), true, l11, l10);
                    }
                } else {
                    z10 = i7;
                    z11 = i10;
                    z12 = z8;
                    z13 = T10;
                    str5 = str2;
                }
                if (zzicVar3.zzc() != 0) {
                    if (d0().T(str, F.C0)) {
                        zzicVar3.zzas(i0().u0(((zzid) zzicVar3.zzbc()).zzcc()));
                    }
                    zzis b2 = e111.b();
                    if (b2 != null) {
                        zzicVar3.zzaN(b2);
                    }
                    zzh.zze(zzicVar3);
                }
                i11++;
                f12 = f14;
                str2 = str5;
                K10 = e111;
                size = i18;
                list2 = list6;
                i7 = z10;
                z8 = z12;
                i10 = z11;
                T10 = z13;
            }
            F1 f1322 = f12;
            E1 e11022 = K10;
            if (zzh.zzb() == 0) {
                p(arrayList422);
                x(false, 204, null, null, str, Collections.emptyList());
                return;
            }
            zzib zzibVar = (zzib) zzh.zzbc();
            ArrayList arrayList7 = new ArrayList();
            Y0 y02 = e11022.f11252c;
            boolean z22 = y02 == Y0.SGTM_CLIENT;
            if (y02 != Y0.SGTM) {
                if (!z22) {
                    str4 = null;
                    c0598a0 = this.f11404b;
                    S(c0598a0);
                    if (c0598a0.d0()) {
                        return;
                    }
                    if (Log.isLoggable(b().T(), 2)) {
                        str4 = i0().m0(zzibVar);
                    }
                    i0();
                    byte[] zzcc = zzibVar.zzcc();
                    p(arrayList422);
                    this.f11411w.f11855w.g(j);
                    b().Q().d("Uploading data. app, uncompressed size, data", str, Integer.valueOf(zzcc.length), str4);
                    this.f11388I = true;
                    S(c0598a0);
                    c0598a0.i0(str, e11022, zzibVar, new Q7.h((I1) this, str, arrayList7));
                    return;
                }
                z22 = true;
            }
            Iterator it9 = ((zzib) zzh.zzbc()).zza().iterator();
            while (true) {
                if (it9.hasNext()) {
                    if (((zzid) it9.next()).zzY()) {
                        str3 = UUID.randomUUID().toString();
                        break;
                    }
                } else {
                    str3 = null;
                    break;
                }
            }
            zzib zzibVar2 = (zzib) zzh.zzbc();
            c().J();
            k0();
            zzhz zzi = zzib.zzi(zzibVar2);
            if (!TextUtils.isEmpty(str3)) {
                zzi.zzi(str3);
            }
            String W10 = e0().W(str);
            if (!TextUtils.isEmpty(W10)) {
                zzi.zzj(W10);
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it10 = zzibVar2.zza().iterator();
            while (it10.hasNext()) {
                zzic zzaF = zzid.zzaF((zzid) it10.next());
                zzaF.zzan();
                arrayList8.add((zzid) zzaF.zzbc());
            }
            zzi.zzg();
            zzi.zzf(arrayList8);
            b().Q().b(TextUtils.isEmpty(str3) ? "null" : zzi.zzh(), "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
            zzib zzibVar3 = (zzib) zzi.zzbc();
            if (TextUtils.isEmpty(str3)) {
                str4 = null;
            } else {
                zzib zzibVar4 = (zzib) zzh.zzbc();
                c().J();
                k0();
                zzhz zzh2 = zzib.zzh();
                b().Q().b(str3, "[sgtm] Processing Google Signal, sgtmJoinId:");
                zzh2.zzi(str3);
                for (zzid zzidVar5 : zzibVar4.zza()) {
                    zzic zzaE = zzid.zzaE();
                    zzaE.zzam(zzidVar5.zzZ());
                    zzaE.zzaJ(zzidVar5.zzav());
                    zzh2.zze(zzaE);
                }
                zzib zzibVar5 = (zzib) zzh2.zzbc();
                String W11 = f1322.f12021b.e0().W(str);
                boolean isEmpty = TextUtils.isEmpty(W11);
                Y0 y03 = Y0.GOOGLE_SIGNAL;
                Y0 y04 = Y0.GOOGLE_SIGNAL_PENDING;
                if (isEmpty) {
                    str4 = null;
                    e12 = new E1((String) F.f11347s.a(null), Collections.emptyMap(), z22 ? y04 : y03, null);
                } else {
                    Uri parse = Uri.parse((String) F.f11347s.a(null));
                    Uri.Builder buildUpon = parse.buildUpon();
                    String authority = parse.getAuthority();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(W11).length() + 1 + String.valueOf(authority).length());
                    sb3.append(W11);
                    sb3.append(".");
                    sb3.append(authority);
                    buildUpon.authority(sb3.toString());
                    String uri = buildUpon.build().toString();
                    str4 = null;
                    e12 = new E1(uri, Collections.emptyMap(), z22 ? y04 : y03, null);
                }
                arrayList7.add(Pair.create(zzibVar5, e12));
            }
            if (z22) {
                zzhz zzhzVar = (zzhz) zzibVar3.zzcl();
                for (int i19 = 0; i19 < zzibVar3.zzb(); i19++) {
                    zzic zzicVar4 = (zzic) zzibVar3.zzc(i19).zzcl();
                    zzicVar4.zzt();
                    zzicVar4.zzaO(j);
                    zzhzVar.zzd(i19, zzicVar4);
                }
                arrayList7.add(Pair.create((zzib) zzhzVar.zzbc(), e11022));
                p(arrayList422);
                x(false, 204, null, null, str, arrayList7);
                if (s(str, e11022.a())) {
                    b().Q().b(str, "[sgtm] Sending sgtm batches available notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    intent.setPackage(str);
                    Context d10 = c0646q0.d();
                    if (Build.VERSION.SDK_INT < 34) {
                        d10.sendBroadcast(intent);
                        return;
                    }
                    makeBasic = BroadcastOptions.makeBasic();
                    shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                    bundle = shareIdentityEnabled.toBundle();
                    d10.sendBroadcast(intent, null, bundle);
                    return;
                }
                return;
            }
            zzibVar = zzibVar3;
            c0598a0 = this.f11404b;
            S(c0598a0);
            if (c0598a0.d0()) {
            }
        }
    }

    public final boolean s(String str, String str2) {
        C0633m c0633m = this.f11405c;
        S(c0633m);
        C0601b0 N02 = c0633m.N0(str);
        HashMap hashMap = this.f11397S;
        if (N02 != null && j0().j0(str, N02.C())) {
            hashMap.remove(str2);
            return true;
        }
        H1 h12 = (H1) hashMap.get(str2);
        if (h12 == null) {
            return true;
        }
        ((M5.b) h12.f11374a.e()).getClass();
        return System.currentTimeMillis() >= h12.f11376c;
    }

    public final void t(String str) {
        zzib zzibVar;
        c().J();
        k0();
        this.f11389J = true;
        try {
            C0646q0 c0646q0 = this.f11414z;
            c0646q0.getClass();
            Boolean bool = c0646q0.o().f11816e;
            if (bool == null) {
                b().f11580w.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                b().f11577f.a("Upload called in the client side when service should be used");
            } else if (this.f11382C > 0) {
                L();
            } else {
                C0598a0 c0598a0 = this.f11404b;
                S(c0598a0);
                if (c0598a0.d0()) {
                    C0633m c0633m = this.f11405c;
                    S(c0633m);
                    if (c0633m.P(str)) {
                        C0633m c0633m2 = this.f11405c;
                        S(c0633m2);
                        com.google.android.gms.common.internal.G.d(str);
                        c0633m2.J();
                        c0633m2.K();
                        List O10 = c0633m2.O(str, B1.t(Y0.GOOGLE_SIGNAL), 1);
                        J1 j12 = O10.isEmpty() ? null : (J1) O10.get(0);
                        if (j12 != null && (zzibVar = j12.f11418b) != null) {
                            b().f11573B.d("[sgtm] Uploading data from upload queue. appId, type, url", str, j12.f11421e, j12.f11419c);
                            byte[] zzcc = zzibVar.zzcc();
                            if (Log.isLoggable(b().T(), 2)) {
                                C0598a0 c0598a02 = this.f11409u;
                                S(c0598a02);
                                b().f11573B.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(zzcc.length), c0598a02.m0(zzibVar));
                            }
                            E1 e12 = new E1(j12.f11419c, j12.f11420d, j12.f11421e, null);
                            this.f11388I = true;
                            C0598a0 c0598a03 = this.f11404b;
                            S(c0598a03);
                            c0598a03.i0(str, e12, zzibVar, new Q7.h(this, str, j12));
                        }
                    } else {
                        b().f11573B.b(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    b().f11573B.a("Network not connected, ignoring upload request");
                    L();
                }
            }
            this.f11389J = false;
            M();
        } catch (Throwable th) {
            this.f11389J = false;
            M();
            throw th;
        }
    }

    public final void u(String str, boolean z8, Long l10, Long l11) {
        C0633m c0633m = this.f11405c;
        S(c0633m);
        C0601b0 N02 = c0633m.N0(str);
        if (N02 != null) {
            C0646q0 c0646q0 = N02.f11653a;
            C0640o0 c0640o0 = c0646q0.f11913u;
            C0646q0.l(c0640o0);
            c0640o0.J();
            N02.f11650Q |= N02.f11674y != z8;
            N02.f11674y = z8;
            C0640o0 c0640o02 = c0646q0.f11913u;
            C0646q0.l(c0640o02);
            c0640o02.J();
            N02.f11650Q |= !Objects.equals(N02.f11675z, l10);
            N02.f11675z = l10;
            C0640o0 c0640o03 = c0646q0.f11913u;
            C0646q0.l(c0640o03);
            c0640o03.J();
            N02.f11650Q |= !Objects.equals(N02.f11635A, l11);
            N02.f11635A = l11;
            if (N02.o()) {
                C0633m c0633m2 = this.f11405c;
                S(c0633m2);
                c0633m2.O0(N02, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        if (r4 < android.os.SystemClock.elapsedRealtime()) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(zzic zzicVar, String str) {
        int x02;
        int indexOf;
        C0628k0 c0628k0 = this.f11403a;
        S(c0628k0);
        c0628k0.J();
        c0628k0.P(str);
        C2052e c2052e = c0628k0.f11799e;
        Set set = (Set) c2052e.get(str);
        if (set != null) {
            zzicVar.zzaw(set);
        }
        S(c0628k0);
        c0628k0.J();
        c0628k0.P(str);
        if (c2052e.get(str) != null && (((Set) c2052e.get(str)).contains("device_model") || ((Set) c2052e.get(str)).contains("device_info"))) {
            zzicVar.zzG();
        }
        S(c0628k0);
        if (c0628k0.b0(str)) {
            String zzD = zzicVar.zzD();
            if (!TextUtils.isEmpty(zzD) && (indexOf = zzD.indexOf(".")) != -1) {
                zzicVar.zzE(zzD.substring(0, indexOf));
            }
        }
        S(c0628k0);
        c0628k0.J();
        c0628k0.P(str);
        if (c2052e.get(str) != null && ((Set) c2052e.get(str)).contains("user_id") && (x02 = C0598a0.x0(zzicVar, "_id")) != -1) {
            zzicVar.zzr(x02);
        }
        S(c0628k0);
        c0628k0.J();
        c0628k0.P(str);
        if (c2052e.get(str) != null && ((Set) c2052e.get(str)).contains("google_signals")) {
            zzicVar.zzan();
        }
        S(c0628k0);
        if (c0628k0.c0(str)) {
            zzicVar.zzX();
            if (a(str).i(B0.ANALYTICS_STORAGE)) {
                HashMap hashMap = this.f11396R;
                G1 g12 = (G1) hashMap.get(str);
                if (g12 != null) {
                    long Q3 = d0().Q(str, F.f11332k0) + g12.f11370b;
                    ((M5.b) e()).getClass();
                }
                g12 = new G1(this, j0().B0());
                hashMap.put(str, g12);
                zzicVar.zzax(g12.f11369a);
            }
        }
        S(c0628k0);
        c0628k0.J();
        c0628k0.P(str);
        if (c2052e.get(str) == null || !((Set) c2052e.get(str)).contains("enhanced_user_id")) {
            return;
        }
        zzicVar.zzav();
    }

    public final void w(String str, zzhv zzhvVar, Bundle bundle, String str2) {
        int max;
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (M1.h0(zzhvVar.zza()) || M1.h0(str)) {
            C0615g d02 = d0();
            d02.getClass();
            max = Math.max(Math.max(Math.min(d02.R(str2, F.f11325h0), 500), 100), 256);
        } else {
            C0615g d03 = d0();
            d03.getClass();
            max = Math.max(Math.min(d03.R(str2, F.f11325h0), 500), 100);
        }
        long j = max;
        long codePointCount = zzhvVar.zzc().codePointCount(0, zzhvVar.zzc().length());
        j0();
        String zza = zzhvVar.zza();
        d0();
        String O10 = M1.O(zza, 40, true);
        if (codePointCount <= j || unmodifiableList.contains(zzhvVar.zza())) {
            return;
        }
        if ("_ev".equals(zzhvVar.zza())) {
            j0();
            String zzc = zzhvVar.zzc();
            C0615g d04 = d0();
            d04.getClass();
            bundle.putString("_ev", M1.O(zzc, Math.max(Math.max(Math.min(d04.R(str2, F.f11325h0), 500), 100), 256), true));
            return;
        }
        b().f11582y.c("Param value is too long; discarded. Name, value length", O10, Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", O10);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(zzhvVar.zza());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r22 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(boolean z8, int i7, IOException iOException, byte[] bArr, String str, List list) {
        byte[] bArr2;
        Y0 y02;
        int i10 = i7;
        C0598a0 c0598a0 = this.f11404b;
        c().J();
        k0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th) {
                this.f11388I = false;
                M();
                throw th;
            }
        } else {
            bArr2 = bArr;
        }
        ArrayList<Long> arrayList = this.f11391M;
        com.google.android.gms.common.internal.G.g(arrayList);
        this.f11391M = null;
        try {
            if (z8) {
                if (i10 != 200) {
                    if (i10 == 204) {
                        i10 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    b().f11582y.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), iOException, str2.substring(0, Math.min(32, str2.length())));
                    C0610e0 c0610e0 = this.f11411w.f11855w;
                    ((M5.b) e()).getClass();
                    c0610e0.g(System.currentTimeMillis());
                    if (i10 == 503 || i10 == 429) {
                        C0610e0 c0610e02 = this.f11411w.f11853u;
                        ((M5.b) e()).getClass();
                        c0610e02.g(System.currentTimeMillis());
                    }
                    C0633m c0633m = this.f11405c;
                    S(c0633m);
                    c0633m.U(arrayList);
                    L();
                    this.f11388I = false;
                    M();
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                y02 = Y0.SGTM_CLIENT;
                if (!hasNext) {
                    break;
                }
                Pair pair = (Pair) it.next();
                zzib zzibVar = (zzib) pair.first;
                E1 e12 = (E1) pair.second;
                if (e12.f11252c != y02) {
                    C0633m c0633m2 = this.f11405c;
                    S(c0633m2);
                    String str3 = e12.f11250a;
                    Map map = e12.f11251b;
                    if (map == null) {
                        map = Collections.emptyMap();
                    }
                    Map map2 = map;
                    Y0 y03 = e12.f11252c;
                    long N10 = c0633m2.N(str, zzibVar, str3, map2, y03, null);
                    if (y03 == Y0.GOOGLE_SIGNAL_PENDING && N10 != -1 && !zzibVar.zze().isEmpty()) {
                        hashMap.put(zzibVar.zze(), Long.valueOf(N10));
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                zzib zzibVar2 = (zzib) pair2.first;
                E1 e13 = (E1) pair2.second;
                if (e13.f11252c == y02) {
                    Long l10 = (Long) hashMap.get(zzibVar2.zze());
                    C0633m c0633m3 = this.f11405c;
                    S(c0633m3);
                    String str4 = e13.f11250a;
                    Map map3 = e13.f11251b;
                    if (map3 == null) {
                        map3 = Collections.emptyMap();
                    }
                    c0633m3.N(str, zzibVar2, str4, map3, e13.f11252c, l10);
                    y02 = y02;
                }
            }
            C0633m c0633m4 = this.f11405c;
            S(c0633m4);
            List O10 = c0633m4.O(str, B1.t(y02), 1);
            if (!O10.isEmpty()) {
                long j = ((J1) O10.get(0)).f11422f;
                ((M5.b) e()).getClass();
                if (System.currentTimeMillis() > ((Long) F.f11263F.a(null)).longValue() + j) {
                    b().f11580w.c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j));
                }
            }
            for (Long l11 : arrayList) {
                try {
                    C0633m c0633m5 = this.f11405c;
                    S(c0633m5);
                    c0633m5.S(l11.longValue());
                } catch (SQLiteException e2) {
                    ArrayList arrayList2 = this.f11392N;
                    if (arrayList2 == null || !arrayList2.contains(l11)) {
                        throw e2;
                    }
                }
            }
            C0633m c0633m6 = this.f11405c;
            S(c0633m6);
            c0633m6.y0();
            C0633m c0633m7 = this.f11405c;
            S(c0633m7);
            c0633m7.z0();
            this.f11392N = null;
            S(c0598a0);
            if (c0598a0.d0()) {
                C0633m c0633m8 = this.f11405c;
                S(c0633m8);
                if (c0633m8.P(str)) {
                    t(str);
                    this.f11382C = 0L;
                    this.f11388I = false;
                    M();
                    return;
                }
            }
            S(c0598a0);
            if (c0598a0.d0() && J()) {
                q();
            } else {
                this.f11393O = -1L;
                L();
            }
            this.f11382C = 0L;
            this.f11388I = false;
            M();
            return;
        } catch (Throwable th2) {
            C0633m c0633m9 = this.f11405c;
            S(c0633m9);
            c0633m9.z0();
            throw th2;
        }
        U u3 = b().f11573B;
        Integer valueOf = Integer.valueOf(i10);
        u3.c("Network upload successful with code, uploadAttempted", valueOf, Boolean.valueOf(z8));
        if (z8) {
            try {
                C0610e0 c0610e03 = this.f11411w.f11854v;
                ((M5.b) e()).getClass();
                c0610e03.g(System.currentTimeMillis());
            } catch (SQLiteException e10) {
                b().f11577f.b(e10, "Database error while trying to delete uploaded bundles");
                ((M5.b) e()).getClass();
                this.f11382C = SystemClock.elapsedRealtime();
                b().f11573B.b(Long.valueOf(this.f11382C), "Disable upload, time");
            }
        }
        this.f11411w.f11855w.g(0L);
        L();
        if (z8) {
            b().f11573B.c("Successful upload. Got network response. code, size", valueOf, Integer.valueOf(bArr2.length));
        } else {
            b().f11573B.a("Purged empty bundles");
        }
        C0633m c0633m10 = this.f11405c;
        S(c0633m10);
        c0633m10.x0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [u.T] */
    /* JADX WARN: Type inference failed for: r2v12, types: [u.T] */
    public final void y(C0601b0 c0601b0) {
        Map map;
        Map map2;
        c().J();
        if (TextUtils.isEmpty(c0601b0.G())) {
            String D10 = c0601b0.D();
            com.google.android.gms.common.internal.G.g(D10);
            z(D10, 204, null, null, null);
            return;
        }
        String D11 = c0601b0.D();
        com.google.android.gms.common.internal.G.g(D11);
        b().f11573B.b(D11, "Fetching remote configuration");
        C0628k0 c0628k0 = this.f11403a;
        S(c0628k0);
        zzgl V7 = c0628k0.V(D11);
        S(c0628k0);
        c0628k0.J();
        String str = (String) c0628k0.f11796A.get(D11);
        if (V7 != null) {
            if (TextUtils.isEmpty(str)) {
                map2 = null;
            } else {
                ?? t5 = new u.T(0);
                t5.put("If-Modified-Since", str);
                map2 = t5;
            }
            S(c0628k0);
            c0628k0.J();
            String str2 = (String) c0628k0.f11797B.get(D11);
            Map map3 = map2;
            Map map4 = map2;
            if (!TextUtils.isEmpty(str2)) {
                if (map2 == null) {
                    map3 = new u.T(0);
                }
                map3.put("If-None-Match", str2);
                map4 = map3;
            }
            map = map4;
        } else {
            map = null;
        }
        this.f11387H = true;
        C0598a0 c0598a0 = this.f11404b;
        S(c0598a0);
        C0463k c0463k = new C0463k(this, 15);
        C0646q0 c0646q0 = (C0646q0) c0598a0.f3094a;
        c0598a0.J();
        c0598a0.K();
        F1 f12 = c0598a0.f12021b.f11412x;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) F.f11319f.a(null)).encodedAuthority((String) F.g.a(null)).path("config/app/".concat(String.valueOf(c0601b0.G()))).appendQueryParameter("platform", "android");
        ((C0646q0) f12.f3094a).f11910d.O();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(130000L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            URL url = new URI(uri).toURL();
            C0640o0 c0640o0 = c0646q0.f11913u;
            C0646q0.l(c0640o0);
            c0640o0.V(new Z(c0598a0, c0601b0.D(), url, (byte[]) null, map, c0463k));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.c("Failed to parse config URL. Not fetching. appId", W.R(c0601b0.D()), uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0165, B:23:0x006c, B:27:0x00ce, B:28:0x00ba, B:29:0x00d3, B:33:0x00e4, B:34:0x00fa, B:36:0x0114, B:37:0x012f, B:39:0x0138, B:41:0x013e, B:42:0x0142, B:44:0x014b, B:46:0x015a, B:47:0x0162, B:48:0x0120, B:49:0x00eb, B:51:0x00f4), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0165, B:23:0x006c, B:27:0x00ce, B:28:0x00ba, B:29:0x00d3, B:33:0x00e4, B:34:0x00fa, B:36:0x0114, B:37:0x012f, B:39:0x0138, B:41:0x013e, B:42:0x0142, B:44:0x014b, B:46:0x015a, B:47:0x0162, B:48:0x0120, B:49:0x00eb, B:51:0x00f4), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0165, B:23:0x006c, B:27:0x00ce, B:28:0x00ba, B:29:0x00d3, B:33:0x00e4, B:34:0x00fa, B:36:0x0114, B:37:0x012f, B:39:0x0138, B:41:0x013e, B:42:0x0142, B:44:0x014b, B:46:0x015a, B:47:0x0162, B:48:0x0120, B:49:0x00eb, B:51:0x00f4), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0165, B:23:0x006c, B:27:0x00ce, B:28:0x00ba, B:29:0x00d3, B:33:0x00e4, B:34:0x00fa, B:36:0x0114, B:37:0x012f, B:39:0x0138, B:41:0x013e, B:42:0x0142, B:44:0x014b, B:46:0x015a, B:47:0x0162, B:48:0x0120, B:49:0x00eb, B:51:0x00f4), top: B:4:0x0030, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(String str, int i7, IOException iOException, byte[] bArr, Map map) {
        boolean z8;
        C0598a0 c0598a0 = this.f11404b;
        c().J();
        k0();
        com.google.android.gms.common.internal.G.d(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th) {
                this.f11387H = false;
                M();
                throw th;
            }
        }
        U u3 = b().f11573B;
        Integer valueOf = Integer.valueOf(bArr.length);
        u3.b(valueOf, "onConfigFetched. Response size");
        C0633m c0633m = this.f11405c;
        S(c0633m);
        c0633m.x0();
        try {
            C0633m c0633m2 = this.f11405c;
            S(c0633m2);
            C0601b0 N02 = c0633m2.N0(str);
            if (i7 != 200 && i7 != 204) {
                if (i7 == 304) {
                    i7 = 304;
                }
                z8 = false;
                if (N02 == null) {
                    b().f11580w.b(W.R(str), "App does not exist in onConfigFetched. appId");
                } else {
                    C0628k0 c0628k0 = this.f11403a;
                    if (z8 || i7 == 404) {
                        String K10 = K("Last-Modified", map);
                        String K11 = K("ETag", map);
                        if (i7 != 404 && i7 != 304) {
                            S(c0628k0);
                            c0628k0.X(str, K10, K11, bArr);
                            ((M5.b) e()).getClass();
                            N02.f(System.currentTimeMillis());
                            C0633m c0633m3 = this.f11405c;
                            S(c0633m3);
                            c0633m3.O0(N02, false);
                            if (i7 != 404) {
                                b().f11582y.b(str, "Config not found. Using empty config. appId");
                            } else {
                                b().f11573B.c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i7), valueOf);
                            }
                            S(c0598a0);
                            if (c0598a0.d0() || !J()) {
                                S(c0598a0);
                                if (c0598a0.d0()) {
                                    C0633m c0633m4 = this.f11405c;
                                    S(c0633m4);
                                    if (c0633m4.P(N02.D())) {
                                        t(N02.D());
                                    }
                                }
                                L();
                            } else {
                                q();
                            }
                        }
                        S(c0628k0);
                        if (c0628k0.V(str) == null) {
                            S(c0628k0);
                            c0628k0.X(str, null, null, null);
                        }
                        ((M5.b) e()).getClass();
                        N02.f(System.currentTimeMillis());
                        C0633m c0633m32 = this.f11405c;
                        S(c0633m32);
                        c0633m32.O0(N02, false);
                        if (i7 != 404) {
                        }
                        S(c0598a0);
                        if (c0598a0.d0()) {
                        }
                        S(c0598a0);
                        if (c0598a0.d0()) {
                        }
                        L();
                    } else {
                        ((M5.b) e()).getClass();
                        N02.g(System.currentTimeMillis());
                        C0633m c0633m5 = this.f11405c;
                        S(c0633m5);
                        c0633m5.O0(N02, false);
                        b().f11573B.c("Fetching config failed. code, error", Integer.valueOf(i7), iOException);
                        S(c0628k0);
                        c0628k0.J();
                        c0628k0.f11796A.put(str, null);
                        C0610e0 c0610e0 = this.f11411w.f11855w;
                        ((M5.b) e()).getClass();
                        c0610e0.g(System.currentTimeMillis());
                        if (i7 == 503 || i7 == 429) {
                            C0610e0 c0610e02 = this.f11411w.f11853u;
                            ((M5.b) e()).getClass();
                            c0610e02.g(System.currentTimeMillis());
                        }
                        L();
                    }
                }
                C0633m c0633m6 = this.f11405c;
                S(c0633m6);
                c0633m6.y0();
                this.f11387H = false;
                M();
            }
            if (iOException == null) {
                z8 = true;
                if (N02 == null) {
                }
                C0633m c0633m62 = this.f11405c;
                S(c0633m62);
                c0633m62.y0();
                this.f11387H = false;
                M();
            }
            z8 = false;
            if (N02 == null) {
            }
            C0633m c0633m622 = this.f11405c;
            S(c0633m622);
            c0633m622.y0();
            this.f11387H = false;
            M();
        } finally {
            C0633m c0633m7 = this.f11405c;
            S(c0633m7);
            c0633m7.z0();
        }
    }
}
