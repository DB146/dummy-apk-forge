package x4;

import N6.B;
import N6.F;
import N6.H;
import N6.r;
import N6.t0;
import a5.e;
import java.io.StringReader;
import java.util.Arrays;
import m4.C1586o0;
import n5.AbstractC1705a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: x4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2266d {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f26216a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f26217b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f26218c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r8 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(String str) {
        long j;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!AbstractC1705a.G(newPullParser, "x:xmpmeta")) {
            throw C1586o0.a("Couldn't find xmp metadata", null);
        }
        F f4 = H.f7232b;
        t0 t0Var = t0.f7341e;
        long j10 = -9223372036854775807L;
        loop0: do {
            newPullParser.next();
            if (AbstractC1705a.G(newPullParser, "rdf:Description")) {
                String[] strArr = f26216a;
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break loop0;
                    }
                    String y10 = AbstractC1705a.y(newPullParser, strArr[i10]);
                    if (y10 == null) {
                        i10++;
                    } else if (Integer.parseInt(y10) == 1) {
                        String[] strArr2 = f26217b;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 4) {
                                break;
                            }
                            String y11 = AbstractC1705a.y(newPullParser, strArr2[i11]);
                            if (y11 != null) {
                                j = Long.parseLong(y11);
                            } else {
                                i11++;
                            }
                        }
                        j = -9223372036854775807L;
                        String[] strArr3 = f26218c;
                        while (true) {
                            if (i7 >= 2) {
                                F f10 = H.f7232b;
                                t0Var = t0.f7341e;
                                break;
                            }
                            String y12 = AbstractC1705a.y(newPullParser, strArr3[i7]);
                            if (y12 != null) {
                                t0Var = H.L(new C2264b(0L, 0L, "image/jpeg"), new C2264b(Long.parseLong(y12), 0L, "video/mp4"));
                                break;
                            }
                            i7++;
                        }
                        j10 = j;
                    }
                }
                return null;
            }
            if (AbstractC1705a.G(newPullParser, "Container:Directory")) {
                t0Var = b(newPullParser, "Container", "Item");
            } else if (AbstractC1705a.G(newPullParser, "GContainer:Directory")) {
                t0Var = b(newPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC1705a.E(newPullParser, "x:xmpmeta"));
        if (t0Var.isEmpty()) {
            return null;
        }
        return new e(j10, t0Var);
    }

    public static t0 b(XmlPullParser xmlPullParser, String str, String str2) {
        F f4 = H.f7232b;
        r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i7 = 0;
        boolean z8 = false;
        do {
            xmlPullParser.next();
            if (AbstractC1705a.G(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String y10 = AbstractC1705a.y(xmlPullParser, concat3);
                String y11 = AbstractC1705a.y(xmlPullParser, concat4);
                String y12 = AbstractC1705a.y(xmlPullParser, concat5);
                String y13 = AbstractC1705a.y(xmlPullParser, concat6);
                if (y10 == null || y11 == null) {
                    return t0.f7341e;
                }
                C2264b c2264b = new C2264b(y12 != null ? Long.parseLong(y12) : 0L, y13 != null ? Long.parseLong(y13) : 0L, y10);
                int i10 = i7 + 1;
                if (objArr.length < i10) {
                    objArr = Arrays.copyOf(objArr, B.f(objArr.length, i10));
                } else {
                    if (z8) {
                        objArr = (Object[]) objArr.clone();
                    }
                    objArr[i7] = c2264b;
                    i7++;
                }
                z8 = false;
                objArr[i7] = c2264b;
                i7++;
            }
        } while (!AbstractC1705a.E(xmlPullParser, concat2));
        return H.D(i7, objArr);
    }
}
