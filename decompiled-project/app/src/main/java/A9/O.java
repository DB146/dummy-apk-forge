package A9;

import A0.C0005a;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseBooleanArray;
import com.kt.apps.media.xemtv.beta.R;
import java.io.IOException;
import n5.AbstractC1705a;
import t0.InterfaceC2015a;
import w1.AbstractC2202f;
import w1.C2201e;
import z.C2558h0;

/* loaded from: classes2.dex */
public final class O implements x7.k, InterfaceC2015a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f920a;

    /* renamed from: b, reason: collision with root package name */
    public Object f921b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O(int i7) {
        this((Object) null, false);
        switch (i7) {
            case 4:
                return;
            case 5:
            default:
                this.f921b = new Handler(Looper.getMainLooper(), new A6.a(1));
                return;
            case 6:
                this.f921b = new SparseBooleanArray();
                return;
        }
    }

    public O(W w10) {
        this.f921b = w10;
        this.f920a = false;
    }

    public /* synthetic */ O(Object obj, boolean z8) {
        this.f920a = z8;
        this.f921b = obj;
    }

    public O(C2201e c2201e, boolean z8) {
        this.f921b = c2201e;
        this.f920a = z8;
    }

    @Override // t0.InterfaceC2015a
    public long A(int i7, long j, long j10) {
        if (!this.f920a) {
            return 0L;
        }
        z.w0 w0Var = (z.w0) this.f921b;
        if (w0Var.f28121a.f3375h.r()) {
            return 0L;
        }
        E.A a9 = w0Var.f28121a;
        float c10 = w0Var.c(w0Var.f(j10));
        T6.a aVar = a9.f3375h;
        return w0Var.g(w0Var.c(((Number) ((C0005a) aVar.f9320a).invoke(Float.valueOf(c10))).floatValue()));
    }

    @Override // x7.k
    public void a(x7.j jVar, int i7) {
        boolean z8 = this.f920a;
        StringBuilder sb2 = (StringBuilder) this.f921b;
        if (z8) {
            this.f920a = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // t0.InterfaceC2015a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b0(long j, long j10, Hb.d dVar) {
        C2558h0 c2558h0;
        int i7;
        long j11;
        long j12;
        if (dVar instanceof C2558h0) {
            c2558h0 = (C2558h0) dVar;
            int i10 = c2558h0.f27994d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2558h0.f27994d = i10 - Integer.MIN_VALUE;
                Object obj = c2558h0.f27992b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c2558h0.f27994d;
                if (i7 == 0) {
                    if (i7 == 1) {
                        j10 = c2558h0.f27991a;
                        com.bumptech.glide.c.c0(obj);
                        j12 = ((V0.p) obj).f9990a;
                        j11 = V0.p.d(j10, j12);
                        return new V0.p(j11);
                    }
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = c2558h0.f27991a;
                    com.bumptech.glide.c.c0(obj);
                    j12 = ((V0.p) obj).f9990a;
                    j11 = V0.p.d(j10, j12);
                    return new V0.p(j11);
                }
                com.bumptech.glide.c.c0(obj);
                j11 = 0;
                if (this.f920a) {
                    z.w0 w0Var = (z.w0) this.f921b;
                    if (w0Var.f28127h) {
                        j12 = 0;
                        j11 = V0.p.d(j10, j12);
                    } else {
                        c2558h0.f27991a = j10;
                        c2558h0.f27994d = 1;
                        obj = w0Var.b(j10, c2558h0);
                        if (obj == aVar) {
                            return aVar;
                        }
                        j12 = ((V0.p) obj).f9990a;
                        j11 = V0.p.d(j10, j12);
                    }
                }
                return new V0.p(j11);
            }
        }
        c2558h0 = new C2558h0(this, (Jb.c) dVar);
        Object obj2 = c2558h0.f27992b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c2558h0.f27994d;
        if (i7 == 0) {
        }
    }

    public void c(int i7) {
        AbstractC1705a.m(!this.f920a);
        ((SparseBooleanArray) this.f921b).append(i7, true);
    }

    public n5.f d() {
        AbstractC1705a.m(!this.f920a);
        this.f920a = true;
        return new n5.f((SparseBooleanArray) this.f921b);
    }

    public boolean e() {
        return this.f920a;
    }

    public boolean f(CharSequence charSequence, int i7) {
        if (charSequence == null || i7 < 0 || charSequence.length() - i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (((C2201e) this.f921b) == null) {
            return e();
        }
        char c10 = 2;
        for (int i10 = 0; i10 < i7 && c10 == 2; i10++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i10));
            O o10 = AbstractC2202f.f25654a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c10 = 2;
                            break;
                    }
                }
                c10 = 0;
            }
            c10 = 1;
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 != 1) {
            return e();
        }
        return false;
    }

    public void g() {
        W w10 = (W) this.f921b;
        Q q10 = w10.f999M0;
        if (q10 != null && q10.f937c == this && w10.f1020h1) {
            w10.f785E0.g(w10.f997K0);
        }
    }

    public void h() {
        W w10 = (W) this.f921b;
        w10.f785E0.g(w10.f996J0);
        if (w10.f1020h1) {
            return;
        }
        w10.f785E0.g(w10.f997K0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, android.media.MediaPlayer$OnCompletionListener] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.media.MediaPlayer$OnErrorListener, java.lang.Object] */
    public void i() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new Object());
        mediaPlayer.setOnErrorListener(new Object());
        try {
            AssetFileDescriptor openRawResourceFd = ((Context) this.f921b).getResources().openRawResourceFd(R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (Throwable th) {
                openRawResourceFd.close();
                throw th;
            }
        } catch (IOException e2) {
            Log.w("O", e2);
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    public synchronized void j(C3.A a9, boolean z8) {
        try {
            if (!this.f920a && !z8) {
                this.f920a = true;
                a9.d();
                this.f920a = false;
            }
            ((Handler) this.f921b).obtainMessage(1, a9).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
