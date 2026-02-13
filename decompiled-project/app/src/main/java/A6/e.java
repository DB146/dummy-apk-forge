package A6;

import E5.m;
import N3.g;
import P8.i;
import P8.k;
import P8.n;
import P8.p;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.Iterator;
import p9.j;
import p9.s;
import q9.C1908b;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f528b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f527a = i7;
        this.f528b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Type inference failed for: r2v11, types: [Bc.o, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v13, types: [Bc.o, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, p9.a] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        V8.c cVar;
        k kVar;
        n nVar;
        Handler handler;
        switch (this.f527a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                f fVar = (f) this.f528b;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (fVar.f530a) {
                    throw null;
                }
            case 1:
                int i7 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i7);
                }
                m mVar = (m) this.f528b;
                synchronized (mVar) {
                    try {
                        E5.n nVar2 = (E5.n) mVar.f3704e.get(i7);
                        if (nVar2 != 0) {
                            mVar.f3704e.remove(i7);
                            mVar.c();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (nVar2.f3710e) {
                                    case 0:
                                        if (data.getBoolean("ack", false)) {
                                            nVar2.c(null);
                                            break;
                                        } else {
                                            nVar2.b(new Exception("Invalid response to one way request", null));
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        nVar2.c(bundle);
                                        break;
                                }
                            } else {
                                nVar2.b(new Exception("Not supported by GmsCore", null));
                            }
                        } else {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i7);
                        }
                    } finally {
                    }
                }
                return true;
            case 2:
                int i10 = message.what;
                g gVar = (g) this.f528b;
                if (i10 == 1) {
                    gVar.b((N3.e) message.obj);
                    return true;
                }
                if (i10 == 2) {
                    gVar.f7191d.n((N3.e) message.obj);
                }
                return false;
            case 3:
                int i11 = message.what;
                p9.m mVar2 = (p9.m) this.f528b;
                if (i11 == R.id.zxing_decode) {
                    s sVar = (s) message.obj;
                    mVar2.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    Rect rect = mVar2.f23209f;
                    sVar.f23219d = rect;
                    V8.c cVar2 = sVar.f23216a;
                    if (rect == null) {
                        kVar = null;
                    } else {
                        byte[] bArr = cVar2.f10200c;
                        int i12 = sVar.f23218c;
                        int i13 = cVar2.f10199b;
                        int i14 = cVar2.f10198a;
                        if (i12 == 90) {
                            byte[] bArr2 = new byte[i14 * i13];
                            int i15 = 0;
                            for (int i16 = 0; i16 < i14; i16++) {
                                for (int i17 = i13 - 1; i17 >= 0; i17--) {
                                    bArr2[i15] = bArr[(i17 * i14) + i16];
                                    i15++;
                                }
                            }
                            cVar = new V8.c(bArr2, i13, i14);
                        } else if (i12 == 180) {
                            int i18 = i14 * i13;
                            byte[] bArr3 = new byte[i18];
                            int i19 = i18 - 1;
                            for (int i20 = 0; i20 < i18; i20++) {
                                bArr3[i19] = bArr[i20];
                                i19--;
                            }
                            cVar = new V8.c(bArr3, i14, i13);
                        } else if (i12 != 270) {
                            cVar = cVar2;
                        } else {
                            int i21 = i14 * i13;
                            byte[] bArr4 = new byte[i21];
                            int i22 = i21 - 1;
                            for (int i23 = 0; i23 < i14; i23++) {
                                for (int i24 = i13 - 1; i24 >= 0; i24--) {
                                    bArr4[i22] = bArr[(i24 * i14) + i23];
                                    i22--;
                                }
                            }
                            cVar = new V8.c(bArr4, i13, i14);
                        }
                        Rect rect2 = sVar.f23219d;
                        int width = rect2.width();
                        int height = rect2.height();
                        int i25 = rect2.top;
                        byte[] bArr5 = new byte[width * height];
                        int i26 = cVar.f10198a;
                        int i27 = (i25 * i26) + rect2.left;
                        for (int i28 = 0; i28 < height; i28++) {
                            System.arraycopy(cVar.f10200c, i27, bArr5, i28 * width, width);
                            i27 += i26;
                        }
                        kVar = new k(bArr5, width, height, width, height);
                    }
                    if (kVar != null) {
                        j jVar = mVar2.f23207d;
                        P8.b b2 = jVar.b(kVar);
                        i iVar = jVar.f23201a;
                        jVar.f23202b.clear();
                        try {
                            if (iVar != null) {
                                if (iVar.f8223b == null) {
                                    iVar.c(null);
                                }
                                nVar = iVar.b(b2);
                            } else {
                                iVar.c(null);
                                nVar = iVar.b(b2);
                            }
                            iVar.reset();
                        } catch (Exception unused) {
                            iVar.reset();
                        } catch (Throwable th) {
                            iVar.reset();
                            throw th;
                        }
                        handler = mVar2.f23208e;
                        if (nVar == null) {
                            Log.d("m", "Found barcode in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                            if (handler != null) {
                                ?? obj = new Object();
                                obj.f23154a = nVar;
                                obj.f23155b = sVar;
                                Message obtain = Message.obtain(handler, R.id.zxing_decode_succeeded, obj);
                                obtain.setData(new Bundle());
                                obtain.sendToTarget();
                            }
                        } else if (handler != null) {
                            Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                        }
                        if (handler != null) {
                            j jVar2 = mVar2.f23207d;
                            jVar2.getClass();
                            ArrayList arrayList = new ArrayList(jVar2.f23202b);
                            ArrayList arrayList2 = new ArrayList(arrayList.size());
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                p pVar = (p) it.next();
                                float f4 = 1;
                                float f10 = pVar.f8249a * f4;
                                Rect rect3 = sVar.f23219d;
                                float f11 = f10 + rect3.left;
                                float f12 = (pVar.f8250b * f4) + rect3.top;
                                if (sVar.f23220e) {
                                    f11 = cVar2.f10198a - f11;
                                }
                                arrayList2.add(new p(f11, f12));
                            }
                            Message.obtain(handler, R.id.zxing_possible_result_points, arrayList2).sendToTarget();
                        }
                        q9.f fVar2 = mVar2.f23204a;
                        fVar2.f23571h.post(new q9.d(fVar2, mVar2.j, 0));
                    }
                    nVar = null;
                    handler = mVar2.f23208e;
                    if (nVar == null) {
                    }
                    if (handler != null) {
                    }
                    q9.f fVar22 = mVar2.f23204a;
                    fVar22.f23571h.post(new q9.d(fVar22, mVar2.j, 0));
                } else {
                    int i29 = 0;
                    if (i11 == R.id.zxing_preview_failed) {
                        q9.f fVar3 = mVar2.f23204a;
                        fVar3.f23571h.post(new q9.d(fVar3, mVar2.j, i29));
                    }
                }
                return true;
            default:
                int i30 = message.what;
                C1908b c1908b = (C1908b) this.f528b;
                c1908b.getClass();
                if (i30 != 1) {
                    return false;
                }
                c1908b.b();
                return true;
        }
    }
}
