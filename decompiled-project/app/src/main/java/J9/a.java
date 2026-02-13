package J9;

import J1.k;
import android.view.View;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class a extends k {

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f5740C;

    /* renamed from: D, reason: collision with root package name */
    public final View f5741D;

    /* renamed from: E, reason: collision with root package name */
    public long f5742E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(J1.d dVar, View view, View view2, int i7) {
        super(dVar, view, 0);
        this.f5740C = i7;
        this.f5741D = view2;
    }

    @Override // J1.k
    public final void b() {
        long j;
        switch (this.f5740C) {
            case 0:
                synchronized (this) {
                    this.f5742E = 0L;
                }
                return;
            case 1:
                synchronized (this) {
                    this.f5742E = 0L;
                }
                return;
            case 2:
                synchronized (this) {
                    this.f5742E = 0L;
                }
                return;
            case 3:
                synchronized (this) {
                    this.f5742E = 0L;
                }
                return;
            case 4:
                synchronized (this) {
                    this.f5742E = 0L;
                }
                return;
            case 5:
                synchronized (this) {
                    this.f5742E = 0L;
                }
                return;
            case 6:
                synchronized (this) {
                    this.f5742E = 0L;
                }
                return;
            default:
                synchronized (this) {
                    j = this.f5742E;
                    this.f5742E = 0L;
                }
                long j10 = j & 6;
                String str = j10 != 0 ? "Link null" : null;
                if (j10 != 0) {
                    Q5.e.Q((MaterialButton) this.f5741D, str);
                    return;
                }
                return;
        }
    }

    @Override // J1.k
    public final boolean e() {
        switch (this.f5740C) {
            case 0:
                synchronized (this) {
                    try {
                        return this.f5742E != 0;
                    } finally {
                    }
                }
            case 1:
                synchronized (this) {
                    try {
                        return this.f5742E != 0;
                    } finally {
                    }
                }
            case 2:
                synchronized (this) {
                    try {
                        return this.f5742E != 0;
                    } finally {
                    }
                }
            case 3:
                synchronized (this) {
                    try {
                        return this.f5742E != 0;
                    } finally {
                    }
                }
            case 4:
                synchronized (this) {
                    try {
                        return this.f5742E != 0;
                    } finally {
                    }
                }
            case 5:
                synchronized (this) {
                    try {
                        return this.f5742E != 0;
                    } finally {
                    }
                }
            case 6:
                synchronized (this) {
                    try {
                        return this.f5742E != 0;
                    } finally {
                    }
                }
            default:
                synchronized (this) {
                    try {
                        return this.f5742E != 0;
                    } finally {
                    }
                }
        }
    }

    @Override // J1.k
    public final void f() {
        switch (this.f5740C) {
            case 0:
                synchronized (this) {
                    this.f5742E = 1L;
                }
                j();
                return;
            case 1:
                synchronized (this) {
                    this.f5742E = 1L;
                }
                j();
                return;
            case 2:
                synchronized (this) {
                    this.f5742E = 1L;
                }
                j();
                return;
            case 3:
                synchronized (this) {
                    this.f5742E = 1L;
                }
                j();
                return;
            case 4:
                synchronized (this) {
                    this.f5742E = 1L;
                }
                j();
                return;
            case 5:
                synchronized (this) {
                    this.f5742E = 1L;
                }
                j();
                return;
            case 6:
                synchronized (this) {
                    this.f5742E = 1L;
                }
                j();
                return;
            default:
                synchronized (this) {
                    this.f5742E = 4L;
                }
                j();
                return;
        }
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        switch (this.f5740C) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return false;
            default:
                return false;
        }
    }
}
