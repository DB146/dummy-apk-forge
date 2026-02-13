package E5;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import j0.AbstractC1362A;
import j0.AbstractC1363a;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class o implements V6.a {

    /* renamed from: e, reason: collision with root package name */
    public static o f3711e;

    /* renamed from: a, reason: collision with root package name */
    public int f3712a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3713b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3714c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3715d;

    public o(Paint paint) {
        this.f3713b = paint;
        this.f3712a = 3;
    }

    public o(String str, SecretKeySpec secretKeySpec) {
        X6.c cVar = new X6.c(this);
        this.f3713b = cVar;
        this.f3714c = str;
        this.f3715d = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c10 = 1;
                    break;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c10 = 2;
                    break;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f3712a = 20;
                break;
            case 1:
                this.f3712a = 32;
                break;
            case 2:
                this.f3712a = 48;
                break;
            case 3:
                this.f3712a = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        cVar.get();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E5.o, java.lang.Object] */
    public static synchronized o j(Context context) {
        o oVar;
        synchronized (o.class) {
            try {
                if (f3711e == null) {
                    zze.zza();
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new N5.a("MessengerIpcClient")));
                    ?? obj = new Object();
                    obj.f3715d = new m(obj);
                    obj.f3712a = 1;
                    obj.f3714c = unconfigurableScheduledExecutorService;
                    obj.f3713b = context.getApplicationContext();
                    f3711e = obj;
                }
                oVar = f3711e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public String a(String str, long j, long j10, int i7) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            String[] strArr = (String[]) this.f3713b;
            int i11 = this.f3712a;
            if (i10 >= i11) {
                sb2.append(strArr[i11]);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            int i12 = ((int[]) this.f3714c)[i10];
            if (i12 == 1) {
                sb2.append(str);
            } else {
                String[] strArr2 = (String[]) this.f3715d;
                if (i12 == 2) {
                    sb2.append(String.format(Locale.US, strArr2[i10], Long.valueOf(j)));
                } else if (i12 == 3) {
                    sb2.append(String.format(Locale.US, strArr2[i10], Integer.valueOf(i7)));
                } else if (i12 == 4) {
                    sb2.append(String.format(Locale.US, strArr2[i10], Long.valueOf(j10)));
                }
            }
            i10++;
        }
    }

    public void b(float f4) {
        ((Paint) this.f3713b).setAlpha((int) Math.rint(f4 * 255.0f));
    }

    public void c(int i7) {
        if (AbstractC1362A.j(this.f3712a, i7)) {
            return;
        }
        this.f3712a = i7;
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = (Paint) this.f3713b;
        if (i10 >= 29) {
            AbstractC1363a.i(paint, AbstractC1362A.w(i7));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC1362A.B(i7)));
        }
    }

    public void d(long j) {
        ((Paint) this.f3713b).setColor(AbstractC1362A.z(j));
    }

    @Override // V6.a
    public byte[] e(int i7, byte[] bArr) {
        if (i7 > this.f3712a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        X6.c cVar = (X6.c) this.f3713b;
        ((Mac) cVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) cVar.get()).doFinal(), i7);
    }

    public void f(j0.i iVar) {
        this.f3715d = iVar;
        ((Paint) this.f3713b).setColorFilter(iVar != null ? iVar.f18543a : null);
    }

    public void g(int i7) {
        ((Paint) this.f3713b).setStrokeCap(AbstractC1362A.m(i7, 2) ? Paint.Cap.SQUARE : AbstractC1362A.m(i7, 1) ? Paint.Cap.ROUND : AbstractC1362A.m(i7, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void h(int i7) {
        ((Paint) this.f3713b).setStrokeJoin(AbstractC1362A.n(i7, 0) ? Paint.Join.MITER : AbstractC1362A.n(i7, 2) ? Paint.Join.BEVEL : AbstractC1362A.n(i7, 1) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void i(int i7) {
        ((Paint) this.f3713b).setStyle(i7 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public synchronized Task k(n nVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(nVar.toString()));
            }
            if (!((m) this.f3715d).d(nVar)) {
                m mVar = new m(this);
                this.f3715d = mVar;
                mVar.d(nVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return nVar.f3707b.getTask();
    }
}
