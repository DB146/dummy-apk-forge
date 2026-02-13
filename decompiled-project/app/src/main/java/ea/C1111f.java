package ea;

import A9.B2;
import Eb.o;
import P3.p;
import P4.B;
import P4.C0474w;
import P4.E;
import P4.G;
import P4.I;
import P4.r;
import P8.j;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.Xml;
import androidx.cardview.widget.CardView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaem;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.core.utils.UtilsKt;
import gb.q;
import hb.InterfaceC1269b;
import i1.C1290a;
import j8.InterfaceC1387b;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kb.EnumC1437b;
import kotlin.jvm.internal.l;
import l1.AbstractC1449a;
import l2.H;
import m4.B0;
import m4.C1582m0;
import m4.C1584n0;
import m4.RunnableC1574i0;
import m4.RunnableC1576j0;
import m4.RunnableC1578k0;
import n5.AbstractC1705a;
import n5.D;
import n5.z;
import n9.C1717a;
import n9.C1718b;
import org.xmlpull.v1.XmlPullParserException;
import q3.i;
import r4.n;
import r7.C1948d;
import s4.InterfaceC1982j;
import u1.ExecutorC2092b;
import y7.u0;

/* renamed from: ea.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1111f implements InterfaceC1393d, a5.g, I, n, OnCompleteListener, gb.b, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16836a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16837b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16838c;

    public /* synthetic */ C1111f(int i7) {
        this.f16836a = i7;
    }

    public /* synthetic */ C1111f(int i7, Object obj, Object obj2) {
        this.f16836a = i7;
        this.f16837b = obj;
        this.f16838c = obj2;
    }

    public C1111f(V8.b bVar) {
        this.f16836a = 7;
        this.f16837b = bVar;
    }

    public C1111f(CardView cardView) {
        this.f16836a = 13;
        this.f16838c = cardView;
    }

    public C1111f(i3.d processor, i workTaskExecutor) {
        this.f16836a = 4;
        l.e(processor, "processor");
        l.e(workTaskExecutor, "workTaskExecutor");
        this.f16837b = processor;
        this.f16838c = workTaskExecutor;
    }

    public C1111f(InterfaceC1387b interfaceC1387b) {
        this.f16836a = 16;
        this.f16838c = Collections.synchronizedMap(new HashMap());
        this.f16837b = interfaceC1387b;
    }

    public C1111f(URL url) {
        this.f16836a = 17;
        this.f16837b = url;
        if (url.getQuery() != null) {
            StringBuilder b2 = wc.l.b();
            b2.append(((URL) this.f16837b).getQuery());
            this.f16838c = b2;
        }
    }

    public C1111f(C1584n0 c1584n0, C1582m0 c1582m0) {
        this.f16836a = 6;
        this.f16838c = c1584n0;
        this.f16837b = c1582m0;
    }

    public C1111f(C1948d c1948d) {
        this.f16836a = 12;
        this.f16837b = c1948d;
        this.f16838c = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1111f g(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e2) {
                e = e2;
                fileLock = null;
            }
            try {
                return new C1111f(5, fileChannel, fileLock);
            } catch (IOException e10) {
                e = e10;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                    try {
                        fileLock.release();
                    } catch (IOException unused) {
                    }
                }
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused2) {
                    }
                }
                return null;
            } catch (Error e11) {
                e = e11;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                }
                if (fileChannel != null) {
                }
                return null;
            } catch (OverlappingFileLockException e12) {
                e = e12;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                }
                if (fileChannel != null) {
                }
                return null;
            }
        } catch (IOException | Error | OverlappingFileLockException e13) {
            e = e13;
            fileChannel = null;
            fileLock = null;
        }
    }

    public static void k(String str, StringBuilder sb2, boolean z8) {
        int i7 = 0;
        while (i7 < str.length()) {
            int codePointAt = str.codePointAt(i7);
            if (codePointAt == 32) {
                sb2.append(z8 ? '+' : "%20");
            } else if (codePointAt == 37) {
                if (i7 < str.length() - 2) {
                    int i10 = i7 + 1;
                    if (u(str.charAt(i10))) {
                        int i11 = i7 + 2;
                        if (u(str.charAt(i11))) {
                            sb2.append('%');
                            sb2.append(str.charAt(i10));
                            sb2.append(str.charAt(i11));
                            i7 = i11;
                        }
                    }
                }
                sb2.append("%25");
            } else if (codePointAt > 127 || "<>\"{}|\\^[]`".indexOf(codePointAt) != -1) {
                sb2.append(URLEncoder.encode(new String(Character.toChars(codePointAt)), vc.b.f25446b.name()));
                if (Character.charCount(codePointAt) == 2) {
                    i7++;
                }
            } else {
                sb2.append((char) codePointAt);
            }
            i7++;
        }
    }

    public static String n(String str) {
        try {
            return URLDecoder.decode(str, vc.b.f25446b.name());
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean u(char c10) {
        return (c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'F') || (c10 >= 'a' && c10 <= 'f');
    }

    public void A(int i7, int i10, int i11, int i12) {
        CardView cardView = (CardView) this.f16838c;
        cardView.f13110d.set(i7, i10, i11, i12);
        Rect rect = cardView.f13109c;
        CardView.a(cardView, i7 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }

    @Override // P4.I
    public void B(int i7, B b2, r rVar, C0474w c0474w) {
        Pair q10 = q(i7, b2);
        if (q10 != null) {
            ((z) ((C1584n0) this.f16838c).j).c(new RunnableC1574i0(this, q10, rVar, c0474w, 2));
        }
    }

    @Override // r4.n
    public void C(int i7, B b2) {
        Pair q10 = q(i7, b2);
        if (q10 != null) {
            ((z) ((C1584n0) this.f16838c).j).c(new RunnableC1576j0(this, q10, 2));
        }
    }

    @Override // r4.n
    public void D(int i7, B b2, Exception exc) {
        Pair q10 = q(i7, b2);
        if (q10 != null) {
            ((z) ((C1584n0) this.f16838c).j).c(new G(this, q10, exc, 9));
        }
    }

    @Override // P4.I
    public void E(int i7, B b2, r rVar, C0474w c0474w) {
        Pair q10 = q(i7, b2);
        if (q10 != null) {
            ((z) ((C1584n0) this.f16838c).j).c(new RunnableC1574i0(this, q10, rVar, c0474w, 1));
        }
    }

    @Override // P4.I
    public void F(int i7, B b2, r rVar, C0474w c0474w) {
        Pair q10 = q(i7, b2);
        if (q10 != null) {
            ((z) ((C1584n0) this.f16838c).j).c(new RunnableC1574i0(this, q10, rVar, c0474w, 0));
        }
    }

    public float G(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        C1111f c1111f;
        boolean z8;
        int i19;
        int i20 = 1;
        boolean z10 = Math.abs(i12 - i10) > Math.abs(i11 - i7);
        if (z10) {
            i14 = i7;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i7;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int abs = Math.abs(i15 - i13);
        int abs2 = Math.abs(i16 - i14);
        int i21 = 2;
        int i22 = (-abs) / 2;
        int i23 = i13 < i15 ? 1 : -1;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 + i23;
        int i26 = i13;
        int i27 = i14;
        int i28 = 0;
        while (true) {
            if (i26 == i25) {
                i17 = i25;
                i18 = i21;
                break;
            }
            int i29 = z10 ? i27 : i26;
            int i30 = z10 ? i26 : i27;
            if (i28 == i20) {
                z8 = z10;
                i19 = i20;
                i17 = i25;
                c1111f = this;
            } else {
                c1111f = this;
                z8 = z10;
                i17 = i25;
                i19 = 0;
            }
            if (i19 == ((V8.b) c1111f.f16837b).b(i29, i30)) {
                if (i28 == 2) {
                    return O5.b.m(i26, i27, i13, i14);
                }
                i28++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i27 == i16) {
                    i18 = 2;
                    break;
                }
                i27 += i24;
                i22 -= abs;
            }
            i26 += i23;
            i25 = i17;
            z10 = z8;
            i20 = 1;
            i21 = 2;
        }
        if (i28 == i18) {
            return O5.b.m(i17, i16, i13, i14);
        }
        return Float.NaN;
    }

    @Override // P4.I
    public void H(int i7, B b2, C0474w c0474w) {
        Pair q10 = q(i7, b2);
        if (q10 != null) {
            ((z) ((C1584n0) this.f16838c).j).c(new RunnableC1578k0(this, q10, c0474w, 1));
        }
    }

    @Override // P4.I
    public void I(int i7, B b2, C0474w c0474w) {
        Pair q10 = q(i7, b2);
        if (q10 != null) {
            ((z) ((C1584n0) this.f16838c).j).c(new RunnableC1578k0(this, q10, c0474w, 0));
        }
    }

    public float J(int i7, int i10, int i11, int i12) {
        float f4;
        float f10;
        float G9 = G(i7, i10, i11, i12);
        int i13 = i7 - (i11 - i7);
        V8.b bVar = (V8.b) this.f16837b;
        int i14 = 0;
        if (i13 < 0) {
            f4 = i7 / (i7 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.f10194a;
            if (i13 >= i15) {
                float f11 = ((i15 - 1) - i7) / (i13 - i7);
                int i16 = i15 - 1;
                f4 = f11;
                i13 = i16;
            } else {
                f4 = 1.0f;
            }
        }
        float f12 = i10;
        int i17 = (int) (f12 - ((i12 - i10) * f4));
        if (i17 < 0) {
            f10 = f12 / (i10 - i17);
        } else {
            int i18 = bVar.f10195b;
            if (i17 >= i18) {
                f10 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f10 = 1.0f;
            }
        }
        return (G(i7, i10, (int) (((i13 - i7) * f10) + i7), i14) + G9) - 1.0f;
    }

    public void K(i3.i workSpecId, int i7) {
        l.e(workSpecId, "workSpecId");
        ((i) this.f16838c).r(new r3.i((i3.d) this.f16837b, workSpecId, false, i7));
    }

    public String L() {
        StringBuilder sb2 = (StringBuilder) this.f16838c;
        if (sb2 == null) {
            String str = (String) this.f16837b;
            return str != null ? str : "";
        }
        this.f16837b = sb2.toString();
        wc.l.l((StringBuilder) this.f16838c);
        this.f16838c = null;
        return (String) this.f16837b;
    }

    @Override // gb.b
    public void a() {
        ((gb.b) this.f16838c).a();
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        H access$get_programmeForChannelLiveData;
        switch (this.f16836a) {
            case 0:
                List it = (List) obj;
                BaseTVChannelViewModel baseTVChannelViewModel = (BaseTVChannelViewModel) this.f16837b;
                l.e(it, "it");
                try {
                    access$get_programmeForChannelLiveData = BaseTVChannelViewModel.access$get_programmeForChannelLiveData(baseTVChannelViewModel);
                } catch (Exception unused) {
                    BaseTVChannelViewModel.access$get_programmeForChannelLiveData(baseTVChannelViewModel).l(new y9.H(BaseTVChannelViewModel.access$toDefaultProgramme(baseTVChannelViewModel, (TVChannel) this.f16838c)));
                }
                for (Object obj2 : it) {
                    if (((N9.a) obj2).c()) {
                        access$get_programmeForChannelLiveData.l(new y9.G(obj2));
                        BaseTVChannelViewModel.access$get_listProgramForChannel(baseTVChannelViewModel).l(new y9.G(it));
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                Map it2 = (Map) obj;
                l.e(it2, "it");
                ConcurrentMap K10 = ((ha.i) this.f16837b).K();
                String str = (String) this.f16838c;
                ha.i iVar = (ha.i) this.f16837b;
                synchronized (K10) {
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    l.d(lowerCase, "toLowerCase(...)");
                    String obj3 = ac.g.v0(UtilsKt.removeAllSpecialChars(lowerCase)).toString();
                    ConcurrentMap K11 = iVar.K();
                    Collection values = it2.values();
                    l.e(values, "<this>");
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = values.iterator();
                    while (it3.hasNext()) {
                        o.U(arrayList, (Iterable) it3.next());
                    }
                    K11.put(obj3, arrayList);
                }
                return;
        }
    }

    @Override // a5.g
    public int b(long j) {
        int i7;
        Long valueOf = Long.valueOf(j);
        int i10 = D.f21141a;
        ArrayList arrayList = (ArrayList) this.f16838c;
        int binarySearch = Collections.binarySearch(arrayList, valueOf);
        if (binarySearch < 0) {
            i7 = ~binarySearch;
        } else {
            int size = arrayList.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
            i7 = binarySearch;
        }
        if (i7 < arrayList.size()) {
            return i7;
        }
        return -1;
    }

    @Override // gb.b, gb.q
    public void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f16836a) {
            case 9:
                EnumC1437b.f((nb.e) this.f16837b, interfaceC1269b);
                return;
            case 10:
            default:
                ((q) this.f16837b).c(interfaceC1269b);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                EnumC1437b.j((nb.e) this.f16838c, interfaceC1269b);
                return;
        }
    }

    @Override // a5.g
    public long d(int i7) {
        AbstractC1705a.h(i7 >= 0);
        ArrayList arrayList = (ArrayList) this.f16838c;
        AbstractC1705a.h(i7 < arrayList.size());
        return ((Long) arrayList.get(i7)).longValue();
    }

    @Override // P4.I
    public void e(int i7, B b2, r rVar, C0474w c0474w, IOException iOException, boolean z8) {
        Pair q10 = q(i7, b2);
        if (q10 != null) {
            ((z) ((C1584n0) this.f16838c).j).c(new E(this, q10, rVar, c0474w, iOException, z8, 1));
        }
    }

    @Override // r4.n
    public void f(int i7, B b2) {
        Pair q10 = q(i7, b2);
        if (q10 != null) {
            ((z) ((C1584n0) this.f16838c).j).c(new RunnableC1576j0(this, q10, 1));
        }
    }

    public void h(char c10) {
        StringBuilder sb2 = (StringBuilder) this.f16838c;
        if (sb2 != null) {
            sb2.append(c10);
            return;
        }
        if (((String) this.f16837b) == null) {
            this.f16837b = String.valueOf(c10);
            return;
        }
        StringBuilder b2 = wc.l.b();
        this.f16838c = b2;
        b2.append((String) this.f16837b);
        this.f16837b = null;
        ((StringBuilder) this.f16838c).append(c10);
    }

    public void i(String str) {
        StringBuilder sb2 = (StringBuilder) this.f16838c;
        if (sb2 != null) {
            sb2.append(str);
            return;
        }
        if (((String) this.f16837b) == null) {
            this.f16837b = str;
            return;
        }
        StringBuilder b2 = wc.l.b();
        this.f16838c = b2;
        b2.append((String) this.f16837b);
        this.f16837b = null;
        ((StringBuilder) this.f16838c).append(str);
    }

    @Override // a5.g
    public List j(long j) {
        int c10 = D.c((ArrayList) this.f16838c, Long.valueOf(j), false);
        return c10 == -1 ? Collections.emptyList() : (List) ((ArrayList) this.f16837b).get(c10);
    }

    public URL l() {
        try {
            URI uri = new URI(((URL) this.f16837b).getProtocol(), ((URL) this.f16837b).getUserInfo(), IDN.toASCII(n(((URL) this.f16837b).getHost())), ((URL) this.f16837b).getPort(), null, null, null);
            StringBuilder b2 = wc.l.b();
            b2.append(uri.toASCIIString());
            k(((URL) this.f16837b).getPath(), b2, false);
            if (((StringBuilder) this.f16838c) != null) {
                b2.append('?');
                k(wc.l.l((StringBuilder) this.f16838c), b2, true);
            }
            if (((URL) this.f16837b).getRef() != null) {
                b2.append('#');
                k(((URL) this.f16837b).getRef(), b2, false);
            }
            URL url = new URL(wc.l.l(b2));
            this.f16837b = url;
            return url;
        } catch (UnsupportedEncodingException | MalformedURLException | URISyntaxException unused) {
            return (URL) this.f16837b;
        }
    }

    public float m(n9.c cVar, n9.c cVar2) {
        int i7 = (int) cVar.f8249a;
        int i10 = (int) cVar.f8250b;
        int i11 = (int) cVar2.f8249a;
        int i12 = (int) cVar2.f8250b;
        float J10 = J(i7, i10, i11, i12);
        float J11 = J((int) cVar2.f8249a, i12, (int) cVar.f8249a, i10);
        return Float.isNaN(J10) ? J11 / 7.0f : Float.isNaN(J11) ? J10 / 7.0f : (J10 + J11) / 14.0f;
    }

    @Override // a5.g
    public int o() {
        return ((ArrayList) this.f16838c).size();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i7 = GenericIdpActivity.f15847P;
        Intent intent = new Intent("android.intent.action.VIEW");
        GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f16837b;
        ResolveInfo resolveActivity = genericIdpActivity.getPackageManager().resolveActivity(intent, 0);
        String str = (String) this.f16838c;
        if (resolveActivity == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaem.zzb(genericIdpActivity, str);
            return;
        }
        List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent2.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent2.addFlags(1073741824);
            intent2.addFlags(268435456);
            genericIdpActivity.startActivity(intent2);
            return;
        }
        o7.o b2 = new p(7).b();
        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
        Uri uri = (Uri) task.getResult();
        Intent intent3 = (Intent) b2.f22101b;
        intent3.setData(uri);
        AbstractC1449a.startActivity(genericIdpActivity, intent3, null);
    }

    @Override // gb.b, gb.q
    public void onError(Throwable th) {
        switch (this.f16836a) {
            case 9:
                ((gb.b) this.f16838c).onError(th);
                return;
            case 10:
            default:
                ((q) this.f16837b).onError(th);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                ((q) this.f16837b).onError(th);
                return;
        }
    }

    @Override // gb.q
    public void onSuccess(Object obj) {
        switch (this.f16836a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                ((q) this.f16837b).onSuccess(obj);
                return;
            default:
                try {
                    Object apply = ((InterfaceC1394e) this.f16838c).apply(obj);
                    Objects.requireNonNull(apply, "The mapper function returned a null value.");
                    ((q) this.f16837b).onSuccess(apply);
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    onError(th);
                    return;
                }
        }
    }

    public C1717a p(float f4, int i7, int i10, float f10) {
        V8.b bVar;
        C1717a b2;
        C1717a b10;
        int i11 = (int) (f10 * f4);
        int max = Math.max(0, i7 - i11);
        V8.b bVar2 = (V8.b) this.f16837b;
        int min = Math.min(bVar2.f10194a - 1, i7 + i11) - max;
        float f11 = 3.0f * f4;
        if (min < f11) {
            throw j.a();
        }
        int max2 = Math.max(0, i10 - i11);
        int min2 = Math.min(bVar2.f10195b - 1, i10 + i11) - max2;
        if (min2 < f11) {
            throw j.a();
        }
        C1718b c1718b = new C1718b((V8.b) this.f16837b, max, max2, min, min2, f4, (P8.q) this.f16838c);
        int i12 = c1718b.f21317e;
        int i13 = c1718b.f21315c;
        int i14 = i12 + i13;
        int i15 = c1718b.f21318f;
        int i16 = (i15 / 2) + c1718b.f21316d;
        int[] iArr = new int[3];
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = ((i17 & 1) == 0 ? (i17 + 1) / 2 : -((i17 + 1) / 2)) + i16;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i19 = i13;
            while (true) {
                bVar = c1718b.f21313a;
                if (i19 >= i14 || bVar.b(i19, i18)) {
                    break;
                }
                i19++;
            }
            int i20 = 0;
            while (i19 < i14) {
                if (!bVar.b(i19, i18)) {
                    if (i20 == 1) {
                        i20++;
                    }
                    iArr[i20] = iArr[i20] + 1;
                } else if (i20 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i20 != 2) {
                    i20++;
                    iArr[i20] = iArr[i20] + 1;
                } else {
                    if (c1718b.a(iArr) && (b10 = c1718b.b(i18, i19, iArr)) != null) {
                        return b10;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i20 = 1;
                }
                i19++;
            }
            if (c1718b.a(iArr) && (b2 = c1718b.b(i18, i14, iArr)) != null) {
                return b2;
            }
        }
        ArrayList arrayList = c1718b.f21314b;
        if (arrayList.isEmpty()) {
            throw j.a();
        }
        return (C1717a) arrayList.get(0);
    }

    public Pair q(int i7, B b2) {
        B b10;
        C1582m0 c1582m0 = (C1582m0) this.f16837b;
        B b11 = null;
        if (b2 != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= c1582m0.f20437c.size()) {
                    b10 = null;
                    break;
                }
                if (((B) c1582m0.f20437c.get(i10)).f8160d == b2.f8160d) {
                    Object obj = c1582m0.f20436b;
                    int i11 = B0.f19807y;
                    b10 = b2.b(Pair.create(obj, b2.f8157a));
                    break;
                }
                i10++;
            }
            if (b10 == null) {
                return null;
            }
            b11 = b10;
        }
        return Pair.create(Integer.valueOf(i7 + c1582m0.f20438d), b11);
    }

    public InterfaceC1982j r(Object... objArr) {
        Constructor e2;
        synchronized (((AtomicBoolean) this.f16838c)) {
            if (!((AtomicBoolean) this.f16838c).get()) {
                try {
                    e2 = ((C1948d) this.f16837b).e();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f16838c).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            e2 = null;
        }
        if (e2 == null) {
            return null;
        }
        try {
            return (InterfaceC1982j) e2.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    @Override // r4.n
    public void s(int i7, B b2) {
        Pair q10 = q(i7, b2);
        if (q10 != null) {
            ((z) ((C1584n0) this.f16838c).j).c(new RunnableC1576j0(this, q10, 0));
        }
    }

    public boolean t() {
        return (((StringBuilder) this.f16838c) == null && ((String) this.f16837b) == null) ? false : true;
    }

    public String toString() {
        switch (this.f16836a) {
            case 19:
                StringBuilder sb2 = (StringBuilder) this.f16838c;
                if (sb2 != null) {
                    return sb2.toString();
                }
                String str = (String) this.f16837b;
                return str != null ? str : "";
            default:
                return super.toString();
        }
    }

    public void v(v1.f fVar) {
        int i7 = fVar.f24948b;
        ExecutorC2092b executorC2092b = (ExecutorC2092b) this.f16838c;
        C1290a c1290a = (C1290a) this.f16837b;
        if (i7 != 0) {
            executorC2092b.execute(new B2(c1290a, i7, 3));
        } else {
            executorC2092b.execute(new hc.i(15, c1290a, fVar.f24947a, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        g1.i iVar;
        char c10;
        g1.n nVar = new g1.n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlResourceParser.getAttributeName(i7);
            String attributeValue = xmlResourceParser.getAttributeValue(i7);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    iVar = null;
                } catch (IOException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                } catch (XmlPullParserException e10) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e10);
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c11 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c11 = 6;
                                        break;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c11 = 7;
                                        break;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c11 = 1;
                                        break;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c11 = 4;
                                        break;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c11 = 5;
                                        break;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c11 = 2;
                                        break;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c11 = '\t';
                                        break;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c11 = '\b';
                                        break;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c11 = 0;
                                        break;
                                    }
                                    break;
                            }
                            c11 = 65535;
                            switch (c11) {
                                case 0:
                                    iVar = g1.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    iVar = g1.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    iVar = g1.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.f17326d.f17355a = true;
                                    break;
                                case 3:
                                    iVar = g1.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.f17326d.f17369h0 = 1;
                                    break;
                                case 4:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f17324b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f17327e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f17326d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f17325c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                case '\t':
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    g1.b.a(context, xmlResourceParser, iVar.f17328f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c10 = 3;
                                        break;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c10 = 1;
                                        break;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c10 = 2;
                                        break;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c10 = 0;
                                        break;
                                    }
                                    break;
                            }
                            c10 = 65535;
                            if (c10 == 0) {
                                ((SparseArray) this.f16838c).put(identifier, nVar);
                                return;
                            } else if (c10 == 1 || c10 == 2 || c10 == 3) {
                                nVar.f17421c.put(Integer.valueOf(iVar.f17323a), iVar);
                                iVar = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f16838c).put(identifier, nVar);
                return;
            }
        }
    }

    @Override // r4.n
    public void x(int i7, B b2, int i10) {
        Pair q10 = q(i7, b2);
        if (q10 != null) {
            ((z) ((C1584n0) this.f16838c).j).c(new F2.a(this, q10, i10, 3));
        }
    }

    public void y() {
        try {
            ((FileLock) this.f16838c).release();
            ((FileChannel) this.f16837b).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    public void z() {
        StringBuilder sb2 = (StringBuilder) this.f16838c;
        if (sb2 != null) {
            String[] strArr = wc.l.f25891a;
            if (sb2.length() <= 8192) {
                sb2.delete(0, sb2.length());
                wc.l.f25895e.o(sb2);
            }
            this.f16838c = null;
        }
        this.f16837b = null;
    }
}
