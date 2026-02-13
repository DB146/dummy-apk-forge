package W4;

import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.C1586o0;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f10651a = Pattern.compile("([a-z])=\\s?(.+)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f10652b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f10653c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x00f9. Please report as an issue. */
    public static E a(String str) {
        char c10;
        char c11;
        D d10 = new D();
        String str2 = z.f10813h;
        if (!str.contains(str2)) {
            str2 = z.g;
        }
        int i7 = n5.D.f21141a;
        char c12 = 65535;
        String[] split = str.split(str2, -1);
        int length = split.length;
        C0583a c0583a = null;
        int i10 = 0;
        while (true) {
            N6.E e2 = d10.f10634b;
            if (i10 >= length) {
                if (c0583a != null) {
                    try {
                        e2.a(c0583a.a());
                    } catch (IllegalArgumentException | IllegalStateException e10) {
                        throw C1586o0.b(null, e10);
                    }
                }
                try {
                    return new E(d10);
                } catch (IllegalArgumentException | IllegalStateException e11) {
                    throw C1586o0.b(null, e11);
                }
            }
            String str3 = split[i10];
            if ("".equals(str3)) {
                c11 = c12;
            } else {
                Matcher matcher = f10651a.matcher(str3);
                if (!matcher.matches()) {
                    throw C1586o0.b("Malformed SDP line: " + str3, null);
                }
                String group = matcher.group(1);
                group.getClass();
                String group2 = matcher.group(2);
                group2.getClass();
                switch (group.hashCode()) {
                    case 97:
                        if (group.equals("a")) {
                            c10 = 11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 98:
                        if (group.equals("b")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 99:
                        if (group.equals("c")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                    case 106:
                    case 108:
                    case 110:
                    case 113:
                    case 119:
                    case 120:
                    case 121:
                    default:
                        c10 = 65535;
                        break;
                    case 101:
                        if (group.equals("e")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 105:
                        if (group.equals("i")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 107:
                        if (group.equals("k")) {
                            c10 = '\n';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 109:
                        if (group.equals("m")) {
                            c10 = '\f';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 111:
                        if (group.equals("o")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 112:
                        if (group.equals("p")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 114:
                        if (group.equals("r")) {
                            c10 = '\r';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 115:
                        if (group.equals("s")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 116:
                        if (group.equals("t")) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 117:
                        if (group.equals("u")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 118:
                        if (group.equals("v")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 122:
                        if (group.equals("z")) {
                            c10 = 14;
                            break;
                        }
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        c11 = 65535;
                        if (!"0".equals(group2)) {
                            throw C1586o0.b("SDP version " + group2 + " is not supported.", null);
                        }
                        break;
                    case 1:
                        c11 = 65535;
                        d10.f10637e = group2;
                        break;
                    case 2:
                        c11 = 65535;
                        d10.f10636d = group2;
                        break;
                    case 3:
                        c11 = 65535;
                        if (c0583a != null) {
                            c0583a.g = group2;
                            break;
                        } else {
                            d10.j = group2;
                            break;
                        }
                    case 4:
                        c11 = 65535;
                        d10.g = Uri.parse(group2);
                        break;
                    case 5:
                        c11 = 65535;
                        d10.k = group2;
                        break;
                    case 6:
                        c11 = 65535;
                        d10.f10641l = group2;
                        break;
                    case 7:
                        c11 = 65535;
                        if (c0583a != null) {
                            c0583a.f10666h = group2;
                            break;
                        } else {
                            d10.f10639h = group2;
                            break;
                        }
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        c11 = 65535;
                        String[] split2 = group2.split(":\\s?", -1);
                        AbstractC1705a.h(split2.length == 2);
                        int parseInt = Integer.parseInt(split2[1]);
                        if (c0583a != null) {
                            c0583a.f10665f = parseInt * 1000;
                            break;
                        } else {
                            d10.f10635c = parseInt * 1000;
                            break;
                        }
                    case '\t':
                        d10.f10638f = group2;
                        c11 = 65535;
                        break;
                    case '\n':
                        if (c0583a == null) {
                            d10.f10640i = group2;
                        } else {
                            c0583a.f10667i = group2;
                        }
                        c11 = 65535;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        Matcher matcher2 = f10652b.matcher(group2);
                        if (!matcher2.matches()) {
                            throw C1586o0.b("Malformed Attribute line: " + str3, null);
                        }
                        String group3 = matcher2.group(1);
                        group3.getClass();
                        String group4 = matcher2.group(2);
                        int i11 = M6.l.f6805a;
                        String str4 = group4 != null ? group4 : "";
                        if (c0583a == null) {
                            d10.f10633a.put(group3, str4);
                        } else {
                            c0583a.f10664e.put(group3, str4);
                        }
                        c11 = 65535;
                        break;
                    case '\f':
                        if (c0583a != null) {
                            try {
                                e2.a(c0583a.a());
                            } catch (IllegalArgumentException | IllegalStateException e12) {
                                throw C1586o0.b(null, e12);
                            }
                        }
                        Matcher matcher3 = f10653c.matcher(group2);
                        if (!matcher3.matches()) {
                            throw C1586o0.b("Malformed SDP media description line: ".concat(group2), null);
                        }
                        String group5 = matcher3.group(1);
                        group5.getClass();
                        String group6 = matcher3.group(2);
                        group6.getClass();
                        String group7 = matcher3.group(3);
                        group7.getClass();
                        String group8 = matcher3.group(4);
                        group8.getClass();
                        try {
                            c0583a = new C0583a(Integer.parseInt(group6), Integer.parseInt(group8), group5, group7);
                            c11 = 65535;
                            break;
                        } catch (NumberFormatException e13) {
                            throw C1586o0.b("Malformed SDP media description line: ".concat(group2), e13);
                        }
                    default:
                        c11 = 65535;
                        break;
                }
            }
            i10++;
            c12 = c11;
        }
    }
}
