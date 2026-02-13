package O1;

import M1.InterfaceC0387b;
import a.AbstractC0672a;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.l;
import rc.AbstractC1958b;
import rc.C;
import rc.w;
import rc.z;

/* loaded from: classes.dex */
public class c implements InterfaceC0387b {

    /* renamed from: a, reason: collision with root package name */
    public final w f7426a;

    /* renamed from: b, reason: collision with root package name */
    public final z f7427b;

    /* renamed from: c, reason: collision with root package name */
    public final a f7428c;

    public c(w fileSystem, z path) {
        l.e(fileSystem, "fileSystem");
        l.e(path, "path");
        this.f7426a = fileSystem;
        this.f7427b = path;
        this.f7428c = new a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(4:11|12|(2:19|20)|(2:15|16)(1:18))(2:24|25))(3:26|27|28))(2:48|(5:52|53|54|55|(1:57)(1:58))(2:50|51))|(2:35|36)|30|(2:32|33)(1:34)))|81|6|7|(0)(0)|(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0032, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c3, code lost:
    
        if (r8 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cd, code lost:
    
        r6 = r9;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c5, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ca, code lost:
    
        a.AbstractC0672a.c(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008f, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: FileNotFoundException -> 0x008f, TryCatch #3 {FileNotFoundException -> 0x008f, blocks: (B:32:0x0095, B:34:0x0099, B:47:0x008b, B:44:0x0086), top: B:7:0x0023, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: FileNotFoundException -> 0x008f, TRY_LEAVE, TryCatch #3 {FileNotFoundException -> 0x008f, blocks: (B:32:0x0095, B:34:0x0099, B:47:0x008b, B:44:0x0086), top: B:7:0x0023, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [O1.c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [O1.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v4, types: [O1.c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(c cVar, Jb.c cVar2) {
        b bVar;
        ?? r22;
        C c10;
        Throwable th;
        Throwable th2;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i7 = bVar.f7425e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f7425e = i7 - Integer.MIN_VALUE;
                Object obj = bVar.f7423c;
                Ib.a aVar = Ib.a.f5345a;
                r22 = bVar.f7425e;
                Q1.f fVar = Q1.f.f8611a;
                Throwable th3 = null;
                if (r22 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    if (cVar.f7428c.f7420a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        C c11 = AbstractC1958b.c(cVar.f7426a.K(cVar.f7427b));
                        try {
                            bVar.f7421a = cVar;
                            bVar.f7422b = c11;
                            bVar.f7425e = 1;
                            Q1.b b2 = fVar.b(c11);
                            if (b2 == aVar) {
                                return aVar;
                            }
                            c10 = c11;
                            obj = b2;
                        } catch (Throwable th4) {
                            r22 = cVar;
                            c10 = c11;
                            th = th4;
                            if (c10 != null) {
                                try {
                                    c10.close();
                                } catch (Throwable th5) {
                                    AbstractC0672a.c(th, th5);
                                }
                            }
                            th2 = th;
                            obj = null;
                            if (th2 == null) {
                            }
                        }
                    } catch (FileNotFoundException unused) {
                        w wVar = cVar.f7426a;
                        z zVar = cVar.f7427b;
                        if (!wVar.l(zVar)) {
                            return new Q1.b(true);
                        }
                        C c12 = AbstractC1958b.c(cVar.f7426a.K(zVar));
                        bVar.f7421a = c12;
                        bVar.f7422b = null;
                        bVar.f7425e = 2;
                        obj = fVar.b(c12);
                        cVar = c12;
                        if (obj == aVar) {
                            return aVar;
                        }
                        if (cVar != 0) {
                        }
                        if (th3 == null) {
                        }
                    }
                } else {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Closeable closeable = (Closeable) bVar.f7421a;
                        com.bumptech.glide.c.c0(obj);
                        cVar = closeable;
                        if (cVar != 0) {
                            try {
                                cVar.close();
                            } catch (Throwable th6) {
                                th3 = th6;
                            }
                        }
                        if (th3 == null) {
                            throw th3;
                        }
                        l.b(obj);
                        return obj;
                    }
                    c10 = bVar.f7422b;
                    r22 = (c) bVar.f7421a;
                    try {
                        com.bumptech.glide.c.c0(obj);
                    } catch (Throwable th7) {
                        th = th7;
                        if (c10 != null) {
                        }
                        th2 = th;
                        obj = null;
                        if (th2 == null) {
                        }
                    }
                }
                if (c10 != null) {
                    try {
                        c10.close();
                    } catch (Throwable th8) {
                        th2 = th8;
                    }
                }
                th2 = null;
                if (th2 == null) {
                    throw th2;
                }
                l.b(obj);
                return obj;
            }
        }
        bVar = new b(cVar, cVar2);
        Object obj2 = bVar.f7423c;
        Ib.a aVar2 = Ib.a.f5345a;
        r22 = bVar.f7425e;
        Q1.f fVar2 = Q1.f.f8611a;
        Throwable th32 = null;
        if (r22 != 0) {
        }
        if (c10 != null) {
        }
        th2 = null;
        if (th2 == null) {
        }
    }

    @Override // M1.InterfaceC0387b
    public final void close() {
        this.f7428c.f7420a.set(true);
    }
}
