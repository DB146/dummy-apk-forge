package m4;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import o4.C1791e;

/* renamed from: m4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1563d {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f20331a;

    /* renamed from: b, reason: collision with root package name */
    public final C1561c f20332b;

    /* renamed from: c, reason: collision with root package name */
    public SurfaceHolderCallbackC1596z f20333c;

    /* renamed from: d, reason: collision with root package name */
    public C1791e f20334d;

    /* renamed from: e, reason: collision with root package name */
    public int f20335e;

    /* renamed from: f, reason: collision with root package name */
    public int f20336f;
    public float g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f20337h;

    public C1563d(Context context, Handler handler, SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f20331a = audioManager;
        this.f20333c = surfaceHolderCallbackC1596z;
        this.f20332b = new C1561c(this, handler);
        this.f20335e = 0;
    }

    public final void a() {
        if (this.f20335e == 0) {
            return;
        }
        int i7 = n5.D.f21141a;
        AudioManager audioManager = this.f20331a;
        if (i7 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f20337h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f20332b);
        }
        b(0);
    }

    public final void b(int i7) {
        if (this.f20335e == i7) {
            return;
        }
        this.f20335e = i7;
        float f4 = i7 == 3 ? 0.2f : 1.0f;
        if (this.g == f4) {
            return;
        }
        this.g = f4;
        SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z = this.f20333c;
        if (surfaceHolderCallbackC1596z != null) {
            C1549C c1549c = surfaceHolderCallbackC1596z.f20525a;
            c1549c.o0(Float.valueOf(c1549c.f19862p0 * c1549c.f19829N.g), 1, 2);
        }
    }

    public final int c(int i7, boolean z8) {
        int i10;
        int requestAudioFocus;
        AudioFocusRequest.Builder k;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int i11 = 1;
        if (i7 == 1 || this.f20336f != 1) {
            a();
            return z8 ? 1 : -1;
        }
        if (!z8) {
            return -1;
        }
        if (this.f20335e != 1) {
            int i12 = n5.D.f21141a;
            AudioManager audioManager = this.f20331a;
            C1561c c1561c = this.f20332b;
            if (i12 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f20337h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        j0.p.w();
                        k = j0.p.g(this.f20336f);
                    } else {
                        j0.p.w();
                        k = j0.p.k(this.f20337h);
                    }
                    C1791e c1791e = this.f20334d;
                    boolean z10 = c1791e != null && c1791e.f21839a == 1;
                    c1791e.getClass();
                    audioAttributes = k.setAudioAttributes((AudioAttributes) c1791e.a().f8929b);
                    willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z10);
                    onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(c1561c);
                    build = onAudioFocusChangeListener.build();
                    this.f20337h = build;
                }
                requestAudioFocus = audioManager.requestAudioFocus(this.f20337h);
            } else {
                C1791e c1791e2 = this.f20334d;
                c1791e2.getClass();
                int i13 = c1791e2.f21841c;
                if (i13 != 13) {
                    switch (i13) {
                        case 2:
                            i10 = 0;
                            break;
                        case 3:
                            i10 = 8;
                            break;
                        case 4:
                            i10 = 4;
                            break;
                        case 5:
                        case 7:
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 10:
                            i10 = 5;
                            break;
                        case 6:
                            i10 = 2;
                            break;
                        default:
                            i10 = 3;
                            break;
                    }
                } else {
                    i10 = 1;
                }
                requestAudioFocus = audioManager.requestAudioFocus(c1561c, i10, this.f20336f);
            }
            if (requestAudioFocus == 1) {
                b(1);
            } else {
                b(0);
                i11 = -1;
            }
        }
        return i11;
    }
}
