package A4;

import N6.H;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.UUID;
import n5.AbstractC1705a;
import s4.InterfaceC1983k;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f443a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f444b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static K4.e b(int i7, n5.v vVar) {
        int h10 = vVar.h();
        if (vVar.h() == 1684108385) {
            vVar.H(8);
            String r10 = vVar.r(h10 - 16);
            return new K4.e("und", r10, r10);
        }
        AbstractC1705a.S("MetadataUtil", "Failed to parse comment attribute: " + c.g(i7));
        return null;
    }

    public static K4.a c(n5.v vVar) {
        int h10 = vVar.h();
        if (vVar.h() != 1684108385) {
            AbstractC1705a.S("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int h11 = vVar.h() & 16777215;
        String str = h11 == 13 ? "image/jpeg" : h11 == 14 ? "image/png" : null;
        if (str == null) {
            h3.o.u(h11, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        vVar.H(4);
        int i7 = h10 - 16;
        byte[] bArr = new byte[i7];
        vVar.f(0, bArr, i7);
        return new K4.a(3, str, null, bArr);
    }

    public static K4.o d(int i7, String str, n5.v vVar) {
        int h10 = vVar.h();
        if (vVar.h() == 1684108385 && h10 >= 22) {
            vVar.H(10);
            int A10 = vVar.A();
            if (A10 > 0) {
                String l10 = h3.o.l(A10, "");
                int A11 = vVar.A();
                if (A11 > 0) {
                    l10 = l10 + "/" + A11;
                }
                return new K4.o(str, null, H.K(l10));
            }
        }
        AbstractC1705a.S("MetadataUtil", "Failed to parse index/count attribute: " + c.g(i7));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static s e(byte[] bArr) {
        n5.v vVar = new n5.v(bArr);
        if (vVar.f21231c < 32) {
            return null;
        }
        vVar.G(0);
        if (vVar.h() != vVar.a() + 4 || vVar.h() != 1886614376) {
            return null;
        }
        int F10 = c.F(vVar.h());
        if (F10 > 1) {
            h3.o.u(F10, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(vVar.p(), vVar.p());
        if (F10 == 1) {
            vVar.H(vVar.y() * 16);
        }
        int y10 = vVar.y();
        if (y10 != vVar.a()) {
            return null;
        }
        ?? r22 = new byte[y10];
        vVar.f(0, r22, y10);
        return new s(uuid, F10, (Serializable) r22);
    }

    public static byte[] f(byte[] bArr, UUID uuid) {
        s e2 = e(bArr);
        if (e2 == null) {
            return null;
        }
        UUID uuid2 = (UUID) e2.f471b;
        if (uuid.equals(uuid2)) {
            return (byte[]) e2.f472c;
        }
        AbstractC1705a.S("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static K4.o g(int i7, String str, n5.v vVar) {
        int h10 = vVar.h();
        if (vVar.h() == 1684108385) {
            vVar.H(8);
            return new K4.o(str, null, H.K(vVar.r(h10 - 16)));
        }
        AbstractC1705a.S("MetadataUtil", "Failed to parse text attribute: " + c.g(i7));
        return null;
    }

    public static K4.j h(int i7, String str, n5.v vVar, boolean z8, boolean z10) {
        int i10 = i(vVar);
        if (z10) {
            i10 = Math.min(1, i10);
        }
        if (i10 >= 0) {
            return z8 ? new K4.o(str, null, H.K(Integer.toString(i10))) : new K4.e("und", str, Integer.toString(i10));
        }
        AbstractC1705a.S("MetadataUtil", "Failed to parse uint8 attribute: " + c.g(i7));
        return null;
    }

    public static int i(n5.v vVar) {
        vVar.H(4);
        if (vVar.h() == 1684108385) {
            vVar.H(8);
            return vVar.v();
        }
        AbstractC1705a.S("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static boolean j(InterfaceC1983k interfaceC1983k, boolean z8, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        boolean z14;
        long k = interfaceC1983k.k();
        long j = -1;
        int i10 = (k > (-1L) ? 1 : (k == (-1L) ? 0 : -1));
        long j10 = 4096;
        if (i10 != 0 && k <= 4096) {
            j10 = k;
        }
        int i11 = (int) j10;
        n5.v vVar = new n5.v(64);
        boolean z15 = false;
        int i12 = 0;
        boolean z16 = false;
        while (i12 < i11) {
            vVar.D(8);
            if (!interfaceC1983k.x(vVar.f21229a, z15 ? 1 : 0, 8, true)) {
                break;
            }
            long w10 = vVar.w();
            int h10 = vVar.h();
            if (w10 == 1) {
                interfaceC1983k.m(8, vVar.f21229a, 8);
                vVar.F(16);
                i7 = 16;
                w10 = vVar.p();
            } else {
                if (w10 == 0) {
                    long k7 = interfaceC1983k.k();
                    if (k7 != j) {
                        w10 = (k7 - interfaceC1983k.A()) + 8;
                    }
                }
                i7 = 8;
            }
            long j11 = i7;
            if (w10 < j11) {
                return z15;
            }
            i12 += i7;
            if (h10 == 1836019574) {
                i11 += (int) w10;
                if (i10 != 0 && i11 > k) {
                    i11 = (int) k;
                }
            } else {
                if (h10 == 1836019558 || h10 == 1836475768) {
                    z11 = z15 ? 1 : 0;
                    z12 = true;
                    z13 = true;
                    break;
                }
                int i13 = i10;
                if ((i12 + w10) - j11 >= i11) {
                    z11 = false;
                    z12 = true;
                    break;
                }
                int i14 = (int) (w10 - j11);
                i12 += i14;
                if (h10 != 1718909296) {
                    z14 = false;
                    z16 = z16;
                    if (i14 != 0) {
                        interfaceC1983k.C(i14);
                        z16 = z16;
                    }
                } else {
                    if (i14 < 8) {
                        return false;
                    }
                    vVar.D(i14);
                    interfaceC1983k.m(0, vVar.f21229a, i14);
                    int i15 = i14 / 4;
                    for (int i16 = 0; i16 < i15; i16++) {
                        if (i16 != 1) {
                            int h11 = vVar.h();
                            if ((h11 >>> 8) != 3368816 && (h11 != 1751476579 || !z10)) {
                                int[] iArr = f444b;
                                for (int i17 = 0; i17 < 29; i17++) {
                                    if (iArr[i17] != h11) {
                                    }
                                }
                            }
                            z16 = true;
                            break;
                        }
                        vVar.H(4);
                    }
                    if (!z16) {
                        return false;
                    }
                    z14 = false;
                    z16 = z16;
                }
                z15 = z14;
                i10 = i13;
            }
            j = -1;
            z16 = z16;
        }
        z11 = z15 ? 1 : 0;
        z12 = true;
        z13 = z11;
        return (z16 && z8 == z13) ? z12 : z11;
    }
}
