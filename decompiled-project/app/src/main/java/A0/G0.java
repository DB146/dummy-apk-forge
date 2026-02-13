package A0;

import A9.C0112m1;
import J3.C0340d;
import L7.C0385e;
import Q.InterfaceC0482c;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.Surface;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import jb.InterfaceC1392c;
import jb.InterfaceC1393d;
import m4.C1586o0;
import m5.InterfaceC1616m;
import n5.AbstractC1705a;
import n5.C1704A;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import q4.C1889b;
import s4.C1979g;
import s4.InterfaceC1982j;
import s4.InterfaceC1984l;
import s4.InterfaceC1985m;
import t8.C2034c;
import va.C2161e;

/* loaded from: classes.dex */
public class G0 implements InterfaceC0482c, A1.h, Bc.i, C4.B, E4.j, OnCompleteListener, F6.c, InterfaceC1393d, InterfaceC1392c, O3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27b;

    /* renamed from: c, reason: collision with root package name */
    public Object f28c;

    /* renamed from: d, reason: collision with root package name */
    public Object f29d;

    public G0(int i7) {
        this.f26a = 18;
        this.f27b = new String[i7];
        this.f28c = new int[i7];
        this.f29d = new int[i7];
    }

    public G0(int i7, byte b2) {
        this.f26a = i7;
        switch (i7) {
            case 29:
                this.f29d = new Hc.e(14);
                return;
            default:
                this.f27b = new C0112m1(1);
                C0112m1 c0112m1 = new C0112m1(0);
                this.f28c = c0112m1;
                this.f29d = c0112m1;
                return;
        }
    }

    public /* synthetic */ G0(int i7, char c10) {
        this.f26a = i7;
    }

    public G0(int i7, String str, ArrayList arrayList, byte[] bArr) {
        this.f26a = 10;
        this.f27b = str;
        this.f28c = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f29d = bArr;
    }

    public G0(L l10) {
        this.f26a = 0;
        this.f27b = l10;
        this.f28c = new ArrayList();
        this.f29d = l10;
    }

    public G0(A3.d dVar, Object obj, A3.l lVar) {
        this.f26a = 6;
        this.f27b = dVar;
        this.f29d = obj;
        this.f28c = lVar;
    }

    public G0(Bc.i iVar) {
        this.f26a = 5;
        this.f27b = new StringBuilder();
        this.f29d = new ArrayList(6);
        this.f28c = iVar;
    }

    public G0(C3.n nVar, S3.g gVar, C3.r rVar) {
        this.f26a = 8;
        this.f29d = nVar;
        this.f28c = gVar;
        this.f27b = rVar;
    }

    public G0(W3.l lVar, ArrayList arrayList, D3.f fVar) {
        this.f26a = 20;
        W3.g.c(fVar, "Argument must not be null");
        this.f29d = fVar;
        W3.g.c(arrayList, "Argument must not be null");
        this.f28c = arrayList;
        this.f27b = new com.bumptech.glide.load.data.h(lVar, fVar);
    }

    public G0(MediaCodec mediaCodec) {
        this.f26a = 12;
        this.f27b = mediaCodec;
        if (n5.D.f21141a < 21) {
            this.f28c = mediaCodec.getInputBuffers();
            this.f29d = mediaCodec.getOutputBuffers();
        }
    }

    public G0(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, D3.f fVar) {
        this.f26a = 21;
        W3.g.c(fVar, "Argument must not be null");
        this.f27b = fVar;
        W3.g.c(arrayList, "Argument must not be null");
        this.f28c = arrayList;
        this.f29d = new com.bumptech.glide.load.data.h(parcelFileDescriptor);
    }

    public /* synthetic */ G0(Object obj, Object obj2, Object obj3, int i7) {
        this.f26a = i7;
        this.f27b = obj;
        this.f28c = obj2;
        this.f29d = obj3;
    }

    public G0(String str, int i7) {
        this.f26a = i7;
        switch (i7) {
            case 24:
                G0 g02 = new G0(23, (char) 0);
                this.f28c = g02;
                this.f29d = g02;
                this.f27b = str;
                return;
            default:
                m4.K k = new m4.K();
                k.k = str;
                this.f27b = new m4.L(k);
                return;
        }
    }

    public G0(String str, HashMap hashMap) {
        this.f26a = 2;
        this.f27b = str;
        this.f28c = hashMap;
        this.f29d = new HashMap();
    }

    public G0(q3.l lVar, Q7.h hVar) {
        this.f26a = 16;
        this.f29d = lVar;
        this.f28c = hVar;
        O7.b bVar = new O7.b(this, new O7.d(this, 0));
        this.f27b = bVar;
        bVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    public G0(InterfaceC1985m interfaceC1985m) {
        this.f26a = 28;
        this.f27b = interfaceC1985m;
    }

    public static String E(String str, HashMap hashMap) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return X.c.i(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = "&".concat(sb3);
        }
        return X.c.h(str, sb3);
    }

    private final void O() {
    }

    private final void P() {
    }

    @Override // Q.InterfaceC0482c
    public void A() {
        this.f29d = ((ArrayList) this.f28c).remove(r0.size() - 1);
    }

    @Override // O3.a
    public C3.A B(C3.A a9, A3.l lVar) {
        Drawable drawable = (Drawable) a9.get();
        if (drawable instanceof BitmapDrawable) {
            return ((A7.a) this.f28c).B(C0340d.e((D3.a) this.f27b, ((BitmapDrawable) drawable).getBitmap()), lVar);
        }
        if (drawable instanceof N3.c) {
            return ((O3.d) this.f29d).B(a9, lVar);
        }
        return null;
    }

    @Override // E4.j
    public void C(int i7, int i10, long j, int i11) {
        ((MediaCodec) this.f27b).queueInputBuffer(i7, 0, i10, j, i11);
    }

    public void D() {
        ((ArrayList) this.f28c).clear();
        this.f29d = (L) this.f27b;
        ((L) this.f27b).M();
    }

    public Bitmap F(BitmapFactory.Options options) {
        switch (this.f26a) {
            case 19:
                return BitmapFactory.decodeStream(new W3.a(W3.b.c((ByteBuffer) this.f27b)), null, options);
            case 20:
                J3.x xVar = (J3.x) ((com.bumptech.glide.load.data.h) this.f27b).f14680b;
                xVar.reset();
                return BitmapFactory.decodeStream(xVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.h) this.f29d).d().getFileDescriptor(), null, options);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A7.a G() {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        String E10;
        String str;
        w7.d.b();
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            try {
                E10 = E((String) this.f27b, (HashMap) this.f28c);
                str = "GET Request URL: " + E10;
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = null;
                if (inputStream != null) {
                }
                if (httpsURLConnection != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(E10).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.f29d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb3.append(cArr, 0, read);
                        }
                        sb2 = sb3.toString();
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new A7.a(responseCode, sb2);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            th = th;
            httpsURLConnection = null;
            if (inputStream != null) {
            }
            if (httpsURLConnection != null) {
            }
            throw th;
        }
    }

    public long H() {
        C1979g c1979g = (C1979g) this.f29d;
        if (c1979g != null) {
            return c1979g.f24055d;
        }
        return -1L;
    }

    public ImageHeaderParser$ImageType I() {
        switch (this.f26a) {
            case 19:
                return E6.b.t((ArrayList) this.f28c, W3.b.c((ByteBuffer) this.f27b));
            case 20:
                J3.x xVar = (J3.x) ((com.bumptech.glide.load.data.h) this.f27b).f14680b;
                xVar.reset();
                return E6.b.s((ArrayList) this.f28c, xVar, (D3.f) this.f29d);
            default:
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.f29d;
                D3.f fVar = (D3.f) this.f27b;
                ArrayList arrayList = (ArrayList) this.f28c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    A3.g gVar = (A3.g) arrayList.get(i7);
                    J3.x xVar2 = null;
                    try {
                        J3.x xVar3 = new J3.x(new FileInputStream(hVar.d().getFileDescriptor()), fVar);
                        try {
                            ImageHeaderParser$ImageType d10 = gVar.d(xVar3);
                            xVar3.n();
                            hVar.d();
                            if (d10 != ImageHeaderParser$ImageType.UNKNOWN) {
                                return d10;
                            }
                        } catch (Throwable th) {
                            th = th;
                            xVar2 = xVar3;
                            if (xVar2 != null) {
                                xVar2.n();
                            }
                            hVar.d();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public C0385e J() {
        T7.c cVar = (T7.c) this.f27b;
        G0 g02 = (G0) this.f28c;
        if (g02 == null) {
            return cVar != null ? new C0385e(cVar) : C0385e.f6337d;
        }
        O7.k.c(cVar != null);
        return g02.J().o(cVar);
    }

    public void K(Throwable th) {
        String str = th instanceof OutOfMemoryError ? "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data" : th instanceof NoClassDefFoundError ? "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk" : th instanceof G7.c ? "" : "Uncaught exception in Firebase Database runloop (21.0.0). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
        ((Q7.h) this.f28c).u(str, th);
        new Handler(((Context) ((q3.l) this.f29d).f23391b).getMainLooper()).post(new E5.k(3, str, th));
        ((O7.b) this.f27b).shutdownNow();
    }

    public void L(InterfaceC1616m interfaceC1616m, Uri uri, Map map, long j, long j10, P4.T t5) {
        boolean z8;
        boolean z10 = true;
        C1979g c1979g = new C1979g(interfaceC1616m, j, j10);
        this.f29d = c1979g;
        if (((InterfaceC1982j) this.f28c) != null) {
            return;
        }
        InterfaceC1982j[] f4 = ((InterfaceC1985m) this.f27b).f(uri, map);
        if (f4.length == 1) {
            this.f28c = f4[0];
        } else {
            int length = f4.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                InterfaceC1982j interfaceC1982j = f4[i7];
                try {
                } catch (EOFException unused) {
                    z8 = ((InterfaceC1982j) this.f28c) != null || c1979g.f24055d == j;
                } catch (Throwable th) {
                    if (((InterfaceC1982j) this.f28c) == null && c1979g.f24055d != j) {
                        z10 = false;
                    }
                    AbstractC1705a.m(z10);
                    c1979g.f24057f = 0;
                    throw th;
                }
                if (interfaceC1982j.c(c1979g)) {
                    this.f28c = interfaceC1982j;
                    c1979g.f24057f = 0;
                    break;
                } else {
                    z8 = ((InterfaceC1982j) this.f28c) != null || c1979g.f24055d == j;
                    AbstractC1705a.m(z8);
                    c1979g.f24057f = 0;
                    i7++;
                }
            }
            if (((InterfaceC1982j) this.f28c) == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i10 = n5.D.f21141a;
                StringBuilder sb3 = new StringBuilder();
                for (int i11 = 0; i11 < f4.length; i11++) {
                    sb3.append(f4[i11].getClass().getSimpleName());
                    if (i11 < f4.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                String sb4 = sb2.toString();
                uri.getClass();
                throw new C1586o0(sb4, null, false, 1);
            }
        }
        ((InterfaceC1982j) this.f28c).f(t5);
    }

    public void M() {
        B0.D d10 = ((L) this.f27b).f44B;
        if (d10 != null) {
            d10.w();
        }
    }

    public Bc.k N(Bc.k kVar) {
        Bc.m mVar = (Bc.m) this.f29d;
        if (!(mVar.contains(kVar) || mVar.isEmpty())) {
            return null;
        }
        Bc.i iVar = (Bc.i) this.f28c;
        for (Bc.h next = iVar.next(); next != null; next = iVar.next()) {
            if (next.B()) {
                int size = mVar.size();
                if ((size <= 0 ? null : mVar.remove(size - 1)) == kVar) {
                    return null;
                }
            } else if (next.f()) {
                Bc.k kVar2 = new Bc.k(this, next);
                StringBuilder sb2 = (StringBuilder) this.f27b;
                if (sb2.length() > 0) {
                    sb2.setLength(0);
                }
                if (next.f()) {
                    mVar.add(kVar2);
                }
                return kVar2;
            }
        }
        return null;
    }

    @Override // E4.j
    public int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f27b;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && n5.D.f21141a < 21) {
                this.f29d = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        List tvList = (List) obj;
        kotlin.jvm.internal.l.e(tvList, "tvList");
        C2161e c2161e = (C2161e) this.f27b;
        c2161e.getClass();
        String id = (String) this.f28c;
        kotlin.jvm.internal.l.e(id, "id");
        String message = "id = ".concat(id);
        kotlin.jvm.internal.l.e(message, "message");
        ((Map) c2161e.f25320h.getValue()).put(id, new WeakReference(tvList));
        ((l2.H) this.f29d).l(new y9.G(tvList));
    }

    @Override // C4.B
    public void b(n5.v vVar) {
        long c10;
        long j;
        AbstractC1705a.n((C1704A) this.f28c);
        int i7 = n5.D.f21141a;
        C1704A c1704a = (C1704A) this.f28c;
        synchronized (c1704a) {
            try {
                long j10 = c1704a.f21138c;
                c10 = j10 != -9223372036854775807L ? j10 + c1704a.f21137b : c1704a.c();
            } finally {
            }
        }
        C1704A c1704a2 = (C1704A) this.f28c;
        synchronized (c1704a2) {
            j = c1704a2.f21137b;
        }
        if (c10 == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        m4.L l10 = (m4.L) this.f27b;
        if (j != l10.f20067D) {
            m4.K a9 = l10.a();
            a9.f19987o = j;
            m4.L l11 = new m4.L(a9);
            this.f27b = l11;
            ((s4.v) this.f29d).a(l11);
        }
        int a10 = vVar.a();
        ((s4.v) this.f29d).c(a10, vVar);
        ((s4.v) this.f29d).e(c10, 1, a10, 0, null);
    }

    @Override // C4.B
    public void c(C1704A c1704a, InterfaceC1984l interfaceC1984l, C4.F f4) {
        this.f28c = c1704a;
        f4.a();
        f4.b();
        s4.v u3 = interfaceC1984l.u(f4.f2683d, 5);
        this.f29d = u3;
        u3.a((m4.L) this.f27b);
    }

    @Override // E4.j
    public void d(int i7, boolean z8) {
        ((MediaCodec) this.f27b).releaseOutputBuffer(i7, z8);
    }

    @Override // Q.InterfaceC0482c
    public void e(int i7, Object obj) {
        ((L) this.f29d).z(i7, (L) obj);
    }

    @Override // Q.InterfaceC0482c
    public void f(Object obj) {
        ((ArrayList) this.f28c).add(this.f29d);
        this.f29d = obj;
    }

    @Override // E4.j
    public void flush() {
        ((MediaCodec) this.f27b).flush();
    }

    @Override // Q.InterfaceC0482c
    public void g() {
        ((L) this.f29d).d();
    }

    @Override // A1.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.f28c;
    }

    @Override // E4.j
    public void h(int i7) {
        ((MediaCodec) this.f27b).setVideoScalingMode(i7);
    }

    @Override // E4.j
    public void i(o5.h hVar, Handler handler) {
        ((MediaCodec) this.f27b).setOnFrameRenderedListener(new E4.a(this, hVar, 1), handler);
    }

    @Override // Q.InterfaceC0482c
    public /* bridge */ /* synthetic */ void j(int i7, Object obj) {
    }

    @Override // Q.InterfaceC0482c
    public void k(int i7, int i10, int i11) {
        ((L) this.f29d).J(i7, i10, i11);
    }

    @Override // Q.InterfaceC0482c
    public Object l() {
        return this.f29d;
    }

    @Override // Q.InterfaceC0482c
    public void m(int i7, int i10) {
        ((L) this.f29d).N(i7, i10);
    }

    @Override // A1.h
    public Object n() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [Bc.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [Bc.h, java.lang.Object] */
    @Override // Bc.i
    public Bc.h next() {
        int size;
        Bc.h hVar = (Bc.h) this.f29d;
        if (hVar != null) {
            this.f29d = null;
            return hVar;
        }
        Bc.p pVar = (Bc.p) this.f27b;
        Node node = (Node) pVar.peek();
        if (node == null) {
            return new Object();
        }
        Node parentNode = node.getParentNode();
        Bc.m mVar = (Bc.m) this.f28c;
        int size2 = mVar.size();
        Node node2 = (Node) (size2 > 0 ? mVar.get(size2 - 1) : null);
        if (parentNode != node2) {
            if (node2 != null && (size = mVar.size()) > 0) {
                mVar.remove(size - 1);
            }
            return new Object();
        }
        pVar.poll();
        if (node.getNodeType() != 1) {
            return new Bc.e(node);
        }
        mVar.add(node);
        Bc.d dVar = new Bc.d(node);
        if (!dVar.isEmpty()) {
            return dVar;
        }
        NamedNodeMap attributes = ((Element) dVar.f2307b).getAttributes();
        int length = attributes.getLength();
        for (int i7 = 0; i7 < length; i7++) {
            Bc.c cVar = new Bc.c(attributes.item(i7));
            if (!cVar.f()) {
                dVar.add(cVar);
            }
        }
        return dVar;
    }

    @Override // A1.h
    public Uri o() {
        return (Uri) this.f27b;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        E5.b bVar = (E5.b) this.f27b;
        String str = (String) this.f28c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f29d;
        synchronized (bVar.f3673a) {
            bVar.f3673a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // E4.j
    public MediaFormat p() {
        return ((MediaCodec) this.f27b).getOutputFormat();
    }

    @Override // Bc.i
    public Bc.h peek() {
        if (((Bc.h) this.f29d) == null) {
            this.f29d = next();
        }
        return (Bc.h) this.f29d;
    }

    @Override // E4.j
    public ByteBuffer q(int i7) {
        return n5.D.f21141a >= 21 ? ((MediaCodec) this.f27b).getInputBuffer(i7) : ((ByteBuffer[]) this.f28c)[i7];
    }

    @Override // A1.h
    public void r() {
    }

    @Override // E4.j
    public void release() {
        this.f28c = null;
        this.f29d = null;
        ((MediaCodec) this.f27b).release();
    }

    @Override // E4.j
    public void s(Surface surface) {
        ((MediaCodec) this.f27b).setOutputSurface(surface);
    }

    @Override // E4.j
    public void t(Bundle bundle) {
        ((MediaCodec) this.f27b).setParameters(bundle);
    }

    public String toString() {
        switch (this.f26a) {
            case 24:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f27b);
                sb2.append('{');
                G0 g02 = (G0) ((G0) this.f28c).f28c;
                String str = "";
                while (g02 != null) {
                    Object obj = g02.f29d;
                    boolean z8 = g02 instanceof M6.j;
                    sb2.append(str);
                    String str2 = (String) g02.f27b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    g02 = (G0) g02.f28c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 27:
                T7.c cVar = (T7.c) this.f27b;
                StringBuilder n6 = X.c.n("", cVar == null ? "<anon>" : cVar.f9331a, "\n");
                n6.append(((O7.j) this.f29d).a("\t"));
                return n6.toString();
            default:
                return super.toString();
        }
    }

    @Override // A1.h
    public Uri u() {
        return (Uri) this.f29d;
    }

    @Override // E4.j
    public ByteBuffer v(int i7) {
        return n5.D.f21141a >= 21 ? ((MediaCodec) this.f27b).getOutputBuffer(i7) : ((ByteBuffer[]) this.f29d)[i7];
    }

    @Override // jb.InterfaceC1392c
    public boolean w(Integer num, Throwable throwable) {
        boolean z8;
        kotlin.jvm.internal.l.e(throwable, "throwable");
        String message = X.c.t("Retry ", ((M9.d) this.f28c).f6851b);
        M9.t t5 = (M9.t) this.f27b;
        kotlin.jvm.internal.l.e(t5, "t");
        kotlin.jvm.internal.l.e(message, "message");
        if (throwable instanceof M9.n) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (num.intValue() > 1) {
            ((kotlin.jvm.internal.r) this.f29d).f19130a = true;
        }
        return num.intValue() < 3 && z8 && !Thread.currentThread().isInterrupted();
    }

    @Override // E4.j
    public void x(int i7, C1889b c1889b, long j) {
        ((MediaCodec) this.f27b).queueSecureInputBuffer(i7, 0, c1889b.f23447i, j, 0);
    }

    @Override // E4.j
    public void y(int i7, long j) {
        ((MediaCodec) this.f27b).releaseOutputBuffer(i7, j);
    }

    @Override // E4.j
    public int z() {
        return ((MediaCodec) this.f27b).dequeueInputBuffer(0L);
    }

    @Override // F6.c
    public Object zza() {
        return new E6.d((E6.i) ((F6.c) this.f27b).zza(), (E6.c) ((F6.c) this.f28c).zza(), ((E6.e) ((C2034c) this.f29d).f24513b).f3734b);
    }
}
