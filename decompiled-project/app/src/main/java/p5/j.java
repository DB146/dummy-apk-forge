package p5;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.journeyapps.barcodescanner.CaptureActivity;
import i1.C1290a;
import i3.p;
import ia.C1358d;
import j8.InterfaceC1386a;
import j8.InterfaceC1387b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import m4.L;
import m4.SurfaceHolderCallbackC1596z;
import o7.o;
import p7.n;
import p9.C1860a;
import p9.s;
import q7.ScheduledFutureC1903g;
import q7.ThreadFactoryC1897a;
import r4.C1933e;
import r4.C1934f;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23088c;

    public /* synthetic */ j(int i7, Object obj, Object obj2) {
        this.f23086a = i7;
        this.f23087b = obj;
        this.f23088c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1386a interfaceC1386a;
        String str = null;
        int i7 = 0;
        switch (this.f23086a) {
            case 0:
                l lVar = (l) this.f23087b;
                SurfaceTexture surfaceTexture = lVar.f23107u;
                Surface surface = lVar.f23108v;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.f23088c;
                Surface surface2 = new Surface(surfaceTexture2);
                lVar.f23107u = surfaceTexture2;
                lVar.f23108v = surface2;
                Iterator it = lVar.f23101a.iterator();
                while (it.hasNext()) {
                    ((SurfaceHolderCallbackC1596z) it.next()).f20525a.v0(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 1:
                n nVar = (n) this.f23087b;
                InterfaceC1387b interfaceC1387b = (InterfaceC1387b) this.f23088c;
                if (nVar.f23151b != n.f23149d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (nVar) {
                    interfaceC1386a = nVar.f23150a;
                    nVar.f23150a = null;
                    nVar.f23151b = interfaceC1387b;
                }
                interfaceC1386a.f(interfaceC1387b);
                return;
            case 2:
                p7.m mVar = (p7.m) this.f23087b;
                InterfaceC1387b interfaceC1387b2 = (InterfaceC1387b) this.f23088c;
                synchronized (mVar) {
                    try {
                        if (mVar.f23147b == null) {
                            mVar.f23146a.add(interfaceC1387b2);
                        } else {
                            mVar.f23147b.add(interfaceC1387b2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                p9.i iVar = (p9.i) ((o) this.f23087b).f22101b;
                boolean z8 = iVar.f23194d;
                C1860a c1860a = (C1860a) this.f23088c;
                CaptureActivity captureActivity = iVar.f23191a;
                if (z8) {
                    s sVar = c1860a.f23155b;
                    V8.c cVar = sVar.f23216a;
                    Rect rect = new Rect(0, 0, cVar.f10198a, cVar.f10199b);
                    YuvImage yuvImage = new YuvImage(cVar.f10200c, sVar.f23217b, cVar.f10198a, cVar.f10199b, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    int i10 = sVar.f23218c;
                    if (i10 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i10);
                        decodeByteArray = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                    }
                    try {
                        File createTempFile = File.createTempFile("barcodeimage", ".jpg", captureActivity.getCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        str = createTempFile.getAbsolutePath();
                    } catch (IOException e2) {
                        Log.w("i", "Unable to create temporary file and store bitmap! " + e2);
                    }
                }
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.addFlags(524288);
                intent.putExtra("SCAN_RESULT", c1860a.f23154a.f8230a);
                P8.n nVar2 = c1860a.f23154a;
                intent.putExtra("SCAN_RESULT_FORMAT", nVar2.f8233d.toString());
                byte[] bArr = nVar2.f8231b;
                if (bArr != null && bArr.length > 0) {
                    intent.putExtra("SCAN_RESULT_BYTES", bArr);
                }
                EnumMap enumMap = nVar2.f8234e;
                if (enumMap != null) {
                    P8.o oVar = P8.o.f8245w;
                    if (enumMap.containsKey(oVar)) {
                        intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", enumMap.get(oVar).toString());
                    }
                    Number number = (Number) enumMap.get(P8.o.f8237a);
                    if (number != null) {
                        intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                    }
                    String str2 = (String) enumMap.get(P8.o.f8239c);
                    if (str2 != null) {
                        intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
                    }
                    Iterable iterable = (Iterable) enumMap.get(P8.o.f8238b);
                    if (iterable != null) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i7, (byte[]) it2.next());
                            i7++;
                        }
                    }
                }
                if (str != null) {
                    intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
                }
                captureActivity.setResult(-1, intent);
                iVar.a();
                return;
            case 4:
                ThreadFactoryC1897a threadFactoryC1897a = (ThreadFactoryC1897a) this.f23087b;
                Process.setThreadPriority(threadFactoryC1897a.f23517c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC1897a.f23518d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f23088c).run();
                return;
            case 5:
                Callable callable = (Callable) this.f23087b;
                ScheduledFutureC1903g scheduledFutureC1903g = (ScheduledFutureC1903g) ((C1358d) this.f23088c).f18487b;
                try {
                    scheduledFutureC1903g.t(callable.call());
                    return;
                } catch (Exception e10) {
                    scheduledFutureC1903g.u(e10);
                    return;
                }
            case 6:
                String uuid = ((UUID) this.f23088c).toString();
                kotlin.jvm.internal.l.d(uuid, "id.toString()");
                r3.f.a((p) this.f23087b, uuid);
                return;
            case 7:
                C1933e c1933e = (C1933e) this.f23087b;
                C1934f c1934f = c1933e.f23735d;
                if (c1934f.f23747p == 0 || c1933e.f23734c) {
                    return;
                }
                Looper looper = c1934f.f23751t;
                looper.getClass();
                c1933e.f23733b = c1934f.f(looper, c1933e.f23732a, (L) this.f23088c, false);
                c1934f.f23745n.add(c1933e);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((La.f) this.f23087b).a((Intent) this.f23088c);
                return;
            case 9:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f23088c;
                C1290a c1290a = FirebaseMessaging.k;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f23087b;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
            case 10:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f23088c;
                try {
                    taskCompletionSource2.setResult(((r8.k) this.f23087b).l());
                    return;
                } catch (Exception e12) {
                    taskCompletionSource2.setException(e12);
                    return;
                }
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                ((v7.l) this.f23087b).c((String) this.f23088c, Boolean.FALSE);
                return;
            default:
                B7.d dVar = (B7.d) this.f23087b;
                ((x7.h) dVar.f2211b).i((String) dVar.f2210a, (List) this.f23088c);
                return;
        }
    }
}
