package r7;

import K4.g;
import Q7.h;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.kt.apps.media.xemtv.ui.main.MainActivity;
import e8.InterfaceC1098a;
import f.InterfaceC1118b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Set;
import p7.p;
import r8.l;
import s4.InterfaceC1982j;
import s4.InterfaceC1985m;
import t8.C2032a;
import t8.C2033b;
import t8.C2034c;
import v4.C2141b;
import w4.C2215b;
import x.r;
import yc.InterfaceC2478a;

/* renamed from: r7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1948d implements OnFailureListener, Continuation, InterfaceC1098a, Y3.e, p7.c, SuccessContinuation, InterfaceC1985m, r, InterfaceC2478a, g, InterfaceC1118b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23805a;

    public /* synthetic */ C1948d(int i7) {
        this.f23805a = i7;
    }

    @Override // K4.g
    public boolean a(int i7, int i10, int i11, int i12, int i13) {
        return (i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i7 == 2)) || (i10 == 77 && i11 == 76 && i12 == 76 && (i13 == 84 || i7 == 2));
    }

    @Override // Y3.e
    public Object apply(Object obj) {
        s8.e eVar = (s8.e) obj;
        h hVar = l.f23849a;
        hVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            hVar.s(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // yc.InterfaceC2478a
    public boolean b(char c10) {
        return (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ' || c10 == '/' || c10 == '>') ? false : true;
    }

    @Override // s4.InterfaceC1985m
    public InterfaceC1982j[] c() {
        switch (this.f23805a) {
            case 12:
                return new InterfaceC1982j[]{new C2141b()};
            default:
                return new InterfaceC1982j[]{new C2215b()};
        }
    }

    @Override // x.r
    public float d(float f4) {
        return f4;
    }

    public Constructor e() {
        switch (this.f23805a) {
            case 5:
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC1982j.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(InterfaceC1982j.class).getConstructor(null);
        }
    }

    @Override // p7.c
    public Object g(T6.a aVar) {
        Set b2 = aVar.b(p.a(C2032a.class));
        C2034c c2034c = C2034c.f24511c;
        if (c2034c == null) {
            synchronized (C2034c.class) {
                try {
                    c2034c = C2034c.f24511c;
                    if (c2034c == null) {
                        c2034c = new C2034c(0, (byte) 0);
                        C2034c.f24511c = c2034c;
                    }
                } finally {
                }
            }
        }
        return new C2033b(b2, c2034c);
    }

    @Override // f.InterfaceC1118b
    public void h(Object obj) {
        ((Boolean) obj).getClass();
        int i7 = MainActivity.f16195f0;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f23805a) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return Tasks.forResult(null);
            case 9:
                return Tasks.forResult(null);
            default:
                return Tasks.forResult(null);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f23805a) {
            case 1:
                return 403;
            default:
                return -1;
        }
    }
}
