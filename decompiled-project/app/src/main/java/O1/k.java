package O1;

import Db.q;
import a.AbstractC0672a;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.l;
import rc.AbstractC1958b;
import rc.B;
import rc.v;
import rc.z;

/* loaded from: classes.dex */
public final class k extends c {
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8 A[Catch: all -> 0x00b4, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b4, blocks: (B:17:0x00a8, B:29:0x00b6, B:60:0x0064), top: B:59:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[Catch: all -> 0x00b4, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b4, blocks: (B:17:0x00a8, B:29:0x00b6, B:60:0x0064), top: B:59:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Jb.c cVar) {
        j jVar;
        int i7;
        v vVar;
        v vVar2;
        Throwable th;
        B b2;
        v vVar3;
        q qVar;
        Throwable th2;
        v vVar4;
        q qVar2;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i10 = jVar.f7462f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f7462f = i10 - Integer.MIN_VALUE;
                Object obj2 = jVar.f7460d;
                Ib.a aVar = Ib.a.f5345a;
                i7 = jVar.f7462f;
                q qVar3 = q.f3365a;
                Throwable th3 = null;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj2);
                    if (this.f7428c.f7420a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    this.f7426a.getClass();
                    z file = this.f7427b;
                    l.e(file, "file");
                    vVar = new v(true, new RandomAccessFile(file.i(), "rw"));
                    try {
                        B b10 = AbstractC1958b.b(v.l(vVar));
                        try {
                            Q1.f fVar = Q1.f.f8611a;
                            jVar.f7457a = vVar;
                            jVar.f7458b = vVar;
                            jVar.f7459c = b10;
                            jVar.f7462f = 1;
                            fVar.c(obj, b10);
                            if (qVar3 == aVar) {
                                return aVar;
                            }
                            b2 = b10;
                            vVar2 = vVar;
                            vVar3 = vVar2;
                        } catch (Throwable th4) {
                            vVar2 = vVar;
                            th = th4;
                            b2 = b10;
                            if (b2 != null) {
                            }
                            th2 = th;
                            vVar4 = vVar2;
                            qVar2 = null;
                            if (th2 == null) {
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (vVar != null) {
                        }
                        th3 = th;
                        qVar = null;
                        if (th3 != null) {
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b2 = jVar.f7459c;
                    vVar3 = jVar.f7458b;
                    vVar2 = jVar.f7457a;
                    try {
                        com.bumptech.glide.c.c0(obj2);
                    } catch (Throwable th6) {
                        th = th6;
                        if (b2 != null) {
                            try {
                                b2.close();
                            } catch (Throwable th7) {
                                try {
                                    AbstractC0672a.c(th, th7);
                                } catch (Throwable th8) {
                                    th = th8;
                                    vVar = vVar2;
                                    if (vVar != null) {
                                        try {
                                            vVar.close();
                                        } catch (Throwable th9) {
                                            AbstractC0672a.c(th, th9);
                                        }
                                    }
                                    th3 = th;
                                    qVar = null;
                                    if (th3 != null) {
                                    }
                                }
                            }
                        }
                        th2 = th;
                        vVar4 = vVar2;
                        qVar2 = null;
                        if (th2 == null) {
                        }
                    }
                }
                vVar3.flush();
                if (b2 != null) {
                    try {
                        b2.close();
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                th2 = null;
                vVar4 = vVar2;
                qVar2 = qVar3;
                if (th2 == null) {
                    throw th2;
                }
                l.b(qVar2);
                if (vVar4 != null) {
                    try {
                        vVar4.close();
                    } catch (Throwable th11) {
                        th3 = th11;
                    }
                }
                qVar = qVar3;
                if (th3 != null) {
                    throw th3;
                }
                l.b(qVar);
                return qVar3;
            }
        }
        jVar = new j(this, cVar);
        Object obj22 = jVar.f7460d;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = jVar.f7462f;
        q qVar32 = q.f3365a;
        Throwable th32 = null;
        if (i7 != 0) {
        }
        vVar3.flush();
        if (b2 != null) {
        }
        th2 = null;
        vVar4 = vVar2;
        qVar2 = qVar32;
        if (th2 == null) {
        }
    }
}
