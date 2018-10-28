package com.jagex.rt4;

import com.jagex.cache.loaders.UnderlayType;
import com.jagex.cache.loaders.OverlayType;
import com.jagex.link.HashTable;
import com.jagex.rt4.lights.Light;
import com.jagex.rt4.lights.LightRenderer;

import rs.Class40;
import rs.ModelSD;
import rs.SDRaster;

public class Terrain {

	public static void destroy() {
		anIntArrayArray2545 = null;
		shape_meshes = null;
		shape_use_w_tc_map = null;
		anIntArray1082 = null;
		aBooleanArrayArray1623 = null;
		anIntArray2731 = null;
	}
	
	public static int[] anIntArray2731 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };
	
	private static boolean[][] aBooleanArrayArray1623 = { { true, true, true }, new boolean[2], { false, true },
	{ true, false }, { false, true, true }, { true, false, true }, { false, true, false },
	{ true, false, false } };
	
	private static int[] anIntArray1082 = { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1,
	7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };
	
	private static int[][] shape_meshes = { new int[0], { 128, 0, 128, 128, 0, 128 },
			{ 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 },
			{ 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 },
			{ 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 },
			{ 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 },
			{ 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };
	
	private static boolean[][] shape_use_w_tc_map = (new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true },
	{ false, false, true, true }, { true, true, false }, { false, true, true },
	{ true, false, false, true }, { false, false, false, true, true }, { false, true, true },
	{ true, false, true, true, true }, { false, true, true, true, true },
	{ false, true, true, true, true, false } });
	
	private static int[][] anIntArrayArray2545 = (new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 },
		{ 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 },
		{ 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 },
		{ 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 },
		{ 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } });
	
	private static int getCenterHeight(int i, int i_4_, int i_5_, int[][] is, int i_6_) {
		int i_8_ = i_4_ * is[i_6_ + 1][i] + (-i_4_ + 128) * is[i_6_][i] >> 39;
		int i_9_ = (i_4_ * is[i_6_ + 1][i + 1] + is[i_6_][i + 1] * (-i_4_ + 128) >> 39);
		int i_10_ = i_9_ * i_5_ + i_8_ * (128 - i_5_) >> 7;
		return i_10_;
	}

	private static int addVertexAdvanced(int i, int colour_c, HDTile class14_sub27, int i_20_, int colour_a, int offset_mode,
			boolean bool, float[][] normal_z, float[][] normal_y, int z_offset, int tileZ, float[][] normal_x, int[][] is, float f,
			int[][] is_27_, int tileX, int x_offset) {
		if (offset_mode != 1) {
			if (offset_mode == 2) {
				z_offset = -z_offset + 128;
				x_offset = -x_offset + 128;
			} else if (offset_mode == 3) {
				int buf = x_offset;
				x_offset = 128 - z_offset;
				z_offset = buf;
			}
		} else {
			int i_31_ = x_offset;
			x_offset = z_offset;
			z_offset = 128 - i_31_;
		}
		int colour;
		float n_x;
		float n_y;
		float n_z;
		if (x_offset == 0 && z_offset == 0) {
			n_z = normal_z[tileX][tileZ];
			colour = colour_a;
			n_x = normal_x[tileX][tileZ];
			n_y = normal_y[tileX][tileZ];
		} else if (x_offset != 128 || z_offset != 0) {
			if (x_offset == 128 && z_offset == 128) {
				colour = colour_c;
				n_x = normal_x[tileX + 1][tileZ + 1];
				n_y = normal_y[tileX + 1][tileZ + 1];
				n_z = normal_z[tileX + 1][tileZ + 1];
			} else if (x_offset != 0 || z_offset != 128) {
				n_x = normal_x[tileX][tileZ];
				float f_36_ = x_offset / 128.0F;
				n_y = normal_y[tileX][tileZ];
				n_x += f_36_ * (-n_x + normal_x[tileX + 1][tileZ]);
				float f_37_ = z_offset / 128.0F;
				float f_38_ = normal_x[tileX][tileZ + 1];
				n_z = normal_z[tileX][tileZ];
				n_y += f_36_ * (normal_y[tileX + 1][tileZ] - n_y);
				float f_39_ = normal_y[tileX][tileZ + 1];
				n_z += f_36_ * (-n_z + normal_z[tileX + 1][tileZ]);
				f_39_ += f_36_ * (-f_39_ + normal_y[tileX + 1][tileZ + 1]);
				f_38_ += f_36_ * (-f_38_ + normal_x[tileX + 1][tileZ + 1]);
				n_x += (f_38_ - n_x) * f_37_;
				n_y += (f_39_ - n_y) * f_37_;
				float f_40_ = normal_z[tileX][tileZ + 1];
				f_40_ += (-f_40_ + normal_z[tileX + 1][tileZ + 1]) * f_36_;
				int i_41_ = Terrain.method450(5030, i_20_, x_offset, colour_a);
				int i_42_ = Terrain.method450(5030, colour_c, x_offset, i);
				n_z += f_37_ * (f_40_ - n_z);
				colour = Terrain.method450(5030, i_42_, z_offset, i_41_);
			} else {
				n_y = normal_y[tileX][tileZ + 1];
				n_x = normal_x[tileX][tileZ + 1];
				n_z = normal_z[tileX][tileZ + 1];
				colour = i;
			}
		} else {
			n_z = normal_z[tileX + 1][tileZ];
			n_y = normal_y[tileX + 1][tileZ];
			n_x = normal_x[tileX + 1][tileZ];
			colour = i_20_;
		}
		int v_y = getCenterHeight(tileZ, x_offset, z_offset, is_27_, tileX);
		int v_z = (tileZ << 7) + z_offset;
		int v_x = (tileX << 39) + x_offset;
		int i_47_ = (class14_sub27.addVertex(v_x, v_y, v_z, n_x, n_y, n_z, bool ? colour & ~0xff : colour,
				(is == null ? 0.0F
						: (v_y
								- getCenterHeight(tileZ, x_offset, z_offset, is, tileX))
								/ f)));
		return i_47_;
	}

	private static void addEdge(int i, int i_0_, float[][] fs, int[][] is, boolean bool, HDTile class14_sub27,
			float[][] fs_1_, int i_2_, int i_4_, float[][] fs_5_, byte i_6_, int i_7_, int i_8_, byte i_9_, int i_10_) {
		int i_11_ = (i_4_ << 40) + 255;
		int i_12_ = (i_0_ << 8) + 255;
		int i_13_ = (i << 8) + 255;
		int i_14_ = (i_7_ << 8) + 255;
		int[] is_15_ = null;
		int[] is_16_ = anIntArrayArray2545[i_9_];
		int[] is_17_ = new int[is_16_.length >> 33];
		for (int i_18_ = 0; is_17_.length > i_18_; i_18_++)
			is_17_[i_18_] = addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_, i_12_, i_6_, false, fs_1_,
					fs_5_, is_16_[i_18_ + i_18_ + 1], i_10_, fs, null, 0.0F, is, i_2_, is_16_[i_18_ + i_18_]);
		while_8_: do {
			if (bool) {
				byte i_19_ = i_9_;
				while_7_: do {
					while_6_: do {
						while_5_: do {
							while_4_: do {
								while_3_: do {
									while_2_: do {
										while_1_: do {
											while_0_: do {
												do {
													if (i_19_ != 1) {
														if (i_19_ != 2) {
															if (i_19_ != 3) {
																if (i_19_ != 4) {
																	if (i_19_ != 5) {
																		if (i_19_ != 6) {
																			if (i_19_ != 7) {
																				if (i_19_ != 8) {
																					if (i_19_ != 9) {
																						if (i_19_ != 10) {
																							if (i_19_ == 11)
																								break while_7_;
																							break while_8_;
																						}
																					} else
																						break while_5_;
																					break while_6_;
																				}
																			} else
																				break while_3_;
																			break while_4_;
																		}
																	} else
																		break while_1_;
																	break while_2_;
																}
															} else
																break;
															break while_0_;
														}
													} else {
														is_15_ = new int[6];
														int i_20_ = (addVertexAdvanced(i_14_, i_13_,
																class14_sub27, i_11_, i_12_, i_6_, true,
																fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F, is, i_2_,
																64));
														int i_21_ = (addVertexAdvanced(i_14_, i_13_,
																class14_sub27, i_11_, i_12_, i_6_, true,
																fs_1_, fs_5_, 64, i_10_, fs, null, 0.0F, is, i_2_,
																128));
														is_15_[2] = is_17_[2];
														is_15_[1] = i_20_;
														is_15_[0] = i_21_;
														is_15_[3] = i_20_;
														is_15_[5] = is_17_[2];
														is_15_[4] = is_17_[0];
														break while_8_;
													}
													is_15_ = new int[6];
													int i_22_ = (addVertexAdvanced(i_14_, i_13_, class14_sub27,
															i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 128,
															i_10_, fs, null, 0.0F, is, i_2_, 128));
													int i_23_ = (addVertexAdvanced(i_14_, i_13_, class14_sub27,
															i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 0, i_10_,
															fs, null, 0.0F, is, i_2_, 64));
													is_15_[2] = i_22_;
													is_15_[1] = i_23_;
													is_15_[3] = i_22_;
													is_15_[0] = is_17_[0];
													is_15_[4] = is_17_[1];
													is_15_[5] = is_17_[0];
													break while_8_;
												} while (false);
												is_15_ = new int[6];
												int i_24_ = (addVertexAdvanced(i_14_, i_13_, class14_sub27,
														i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 128, i_10_,
														fs, null, 0.0F, is, i_2_, 0));
												int i_25_ = (addVertexAdvanced(i_14_, i_13_, class14_sub27,
														i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 0, i_10_, fs,
														null, 0.0F, is, i_2_, 64));
												is_15_[1] = is_17_[1];
												is_15_[0] = is_17_[2];
												is_15_[3] = i_24_;
												is_15_[2] = i_24_;
												is_15_[5] = is_17_[2];
												is_15_[4] = i_25_;
												break while_8_;
											} while (false);
											is_15_ = new int[3];
											int i_26_ = (addVertexAdvanced(i_14_, i_13_, class14_sub27,
													i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F,
													is, i_2_, 0));
											is_15_[0] = is_17_[3];
											is_15_[2] = is_17_[0];
											is_15_[1] = i_26_;
											break while_8_;
										} while (false);
										is_15_ = new int[3];
										int i_27_ = (addVertexAdvanced(i_14_, i_13_, class14_sub27,
												i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F, is,
												i_2_, 128));
										is_15_[1] = i_27_;
										is_15_[0] = is_17_[2];
										is_15_[2] = is_17_[3];
										break while_8_;
									} while (false);
									is_15_ = new int[6];
									int i_28_ = (addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_,
											i_12_, i_6_, true, fs_1_, fs_5_, 0, i_10_, fs, null, 0.0F, is, i_2_, 128));
									int i_29_ = (addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_,
											i_12_, i_6_, true, fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F, is, i_2_,
											128));
									is_15_[1] = i_28_;
									is_15_[2] = i_29_;
									is_15_[0] = is_17_[3];
									is_15_[4] = is_17_[0];
									is_15_[3] = i_29_;
									is_15_[5] = is_17_[3];
									break while_8_;
								} while (false);
								is_15_ = new int[6];
								int i_30_ = addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_, i_12_,
										i_6_, true, fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F, is, i_2_, 0);
								int i_31_ = addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_, i_12_,
										i_6_, true, fs_1_, fs_5_, 0, i_10_, fs, null, 0.0F, is, i_2_, 128);
								is_15_[2] = i_30_;
								is_15_[4] = is_17_[2];
								is_15_[3] = i_30_;
								is_15_[0] = is_17_[1];
								is_15_[1] = i_31_;
								is_15_[5] = is_17_[1];
								break while_8_;
							} while (false);
							is_15_ = new int[3];
							int i_32_ = addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_, i_12_, i_6_,
									true, fs_1_, fs_5_, 0, i_10_, fs, null, 0.0F, is, i_2_, 0);
							is_15_[1] = i_32_;
							is_15_[0] = is_17_[3];
							is_15_[2] = is_17_[4];
							break while_8_;
						} while (false);
						is_15_ = new int[15];
						int i_33_ = addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_, i_12_, i_6_, true,
								fs_1_, fs_5_, 64, i_10_, fs, null, 0.0F, is, i_2_, 128);
						int i_34_ = addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_, i_12_, i_6_, true,
								fs_1_, fs_5_, 32, i_10_, fs, null, 0.0F, is, i_2_, 96);
						int i_35_ = addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_, i_12_, i_6_, true,
								fs_1_, fs_5_, 0, i_10_, fs, null, 0.0F, is, i_2_, 64);
						is_15_[1] = i_33_;
						is_15_[3] = i_34_;
						is_15_[7] = is_17_[3];
						is_15_[5] = is_17_[3];
						is_15_[9] = i_34_;
						is_15_[2] = is_17_[4];
						is_15_[13] = is_17_[1];
						is_15_[12] = i_34_;
						is_15_[11] = is_17_[1];
						is_15_[6] = i_34_;
						is_15_[8] = is_17_[2];
						is_15_[4] = is_17_[4];
						is_15_[0] = i_34_;
						is_15_[14] = i_35_;
						is_15_[10] = is_17_[2];
						break while_8_;
					} while (false);
					is_15_ = new int[9];
					int i_36_ = addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_, i_12_, i_6_, true,
							fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F, is, i_2_, 0);
					is_15_[0] = is_17_[2];
					is_15_[2] = is_17_[3];
					is_15_[4] = i_36_;
					is_15_[1] = i_36_;
					is_15_[8] = is_17_[0];
					is_15_[3] = is_17_[3];
					is_15_[6] = is_17_[4];
					is_15_[5] = is_17_[4];
					is_15_[7] = i_36_;
					break while_8_;
				} while (false);
				is_15_ = new int[12];
				int i_37_ = addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_, i_12_, i_6_, true, fs_1_,
						fs_5_, 64, i_10_, fs, null, 0.0F, is, i_2_, 0);
				int i_38_ = addVertexAdvanced(i_14_, i_13_, class14_sub27, i_11_, i_12_, i_6_, true, fs_1_,
						fs_5_, 64, i_10_, fs, null, 0.0F, is, i_2_, 128);
				is_15_[5] = i_37_;
				is_15_[8] = i_37_;
				is_15_[0] = is_17_[3];
				is_15_[3] = is_17_[3];
				is_15_[1] = i_37_;
				is_15_[7] = i_38_;
				is_15_[2] = is_17_[0];
				is_15_[4] = is_17_[2];
				is_15_[10] = is_17_[1];
				is_15_[11] = i_38_;
				is_15_[9] = is_17_[2];
				is_15_[6] = is_17_[2];
			}
		} while (false);
		class14_sub27.addTriangle(i_8_, i_2_, i_10_, is_17_, is_15_, false);
	}

	public static HDTile[] addEdgeSmoothingMesh(int[][] is, byte[][] is_5_, byte[][] is_6_, byte[][] is_7_, int i_8_,
			float[][] fs, float[][] fs_9_, int[][] is_10_, byte[][][] is_11_, float[][] fs_12_, byte[][] is_13_) {
		HashTable hashTable = new HashTable(128);
		for (int i_14_ = 1; i_14_ <= 102; i_14_++) {
			for (int i_15_ = 1; i_15_ <= 102; i_15_++) {
				int i_16_ = is_13_[i_14_][i_15_] & 0xff;
				int i_17_ = is_6_[i_14_][i_15_] & 0xff;
				if (i_17_ != 0) {
					OverlayType overlayType = OverlayType.list(i_17_ - 1);
					if (overlayType.anInt2411 == -1)
						continue;
					HDTile class14_sub27 = Terrain.method1122(hashTable, overlayType);
					byte i_18_ = is_7_[i_14_][i_15_];
					int[] is_19_ = anIntArrayArray2545[i_18_];
					class14_sub27.maxVertices += is_19_.length / 2;
					class14_sub27.maxTriangles++;
					if (overlayType.aBoolean2409 && i_16_ != 0)
						class14_sub27.maxVertices += Terrain.anIntArray2731[i_18_];
				}
				if ((is_13_[i_14_][i_15_] & 0xff) != 0 || i_17_ != 0 && is_7_[i_14_][i_15_] == 0) {
					int i_20_ = 0;
					int i_21_ = 0;
					int[] is_22_ = new int[8];
					int i_23_ = 0;
					int i_24_ = 0;
					int i_25_ = is_6_[i_14_][i_15_ + 1] & 0xff;
					int i_26_ = is_6_[i_14_ - 1][i_15_] & 0xff;
					int i_27_ = 0;
					int i_28_ = is_6_[i_14_][i_15_ - 1] & 0xff;
					int i_29_ = is_6_[i_14_ + 1][i_15_] & 0xff;
					int i_30_ = is_6_[i_14_ - 1][i_15_ + 1] & 0xff;
					int i_31_ = is_6_[i_14_ - 1][i_15_ - 1] & 0xff;
					int i_32_ = is_6_[i_14_ + 1][i_15_ - 1] & 0xff;
					int i_33_ = is_6_[i_14_ + 1][i_15_ + 1] & 0xff;
					if (i_30_ != 0 && i_30_ != i_17_) {
						OverlayType overlayType = OverlayType.list(i_30_ - 1);
						if (!overlayType.aBoolean2409 || overlayType.anInt2411 == -1) {
							boolean bool = false;
						} else {
							byte i_34_ = is_5_[i_14_ - 1][i_15_ + 1];
							byte i_35_ = is_7_[i_14_ - 1][i_15_ + 1];
							int i_36_ = (Terrain.anIntArray1082[(i_34_ + 3 & 0x3) + i_35_ * 4]);
							int i_37_ = (Terrain.anIntArray1082[(i_34_ + 2 & 0x3) + i_35_ * 4]);
							if (Terrain.aBooleanArrayArray1623[i_36_][1] && Terrain.aBooleanArrayArray1623[i_37_][0]) {
								boolean bool = false;
							} else {
								for (int i_38_ = 0; i_38_ < 8; i_38_++) {
									if (i_20_ == i_38_) {
										is_22_[i_20_++] = i_30_;
										break;
									}
									if (i_30_ == is_22_[i_38_])
										break;
								}
							}
						}
					} else {
						boolean bool = false;
					}
					if (i_31_ == 0 || i_17_ == i_31_) {
						boolean bool = false;
					} else {
						OverlayType overlayType = OverlayType.list(i_31_ - 1);
						if (!overlayType.aBoolean2409 || overlayType.anInt2411 == -1) {
							boolean bool = false;
						} else {
							byte i_39_ = is_5_[i_14_ - 1][i_15_ - 1];
							byte i_40_ = is_7_[i_14_ - 1][i_15_ - 1];
							int i_41_ = (Terrain.anIntArray1082[i_40_ * 4 + (i_39_ & 0x3)]);
							int i_42_ = (Terrain.anIntArray1082[(i_39_ + 3 & 0x3) + i_40_ * 4]);
							if (!Terrain.aBooleanArrayArray1623[i_41_][1]
									|| !Terrain.aBooleanArrayArray1623[i_42_][0]) {
								for (int i_43_ = 0; i_43_ < 8; i_43_++) {
									if (i_43_ == i_20_) {
										is_22_[i_20_++] = i_31_;
										break;
									}
									if (i_31_ == is_22_[i_43_])
										break;
								}
							} else {
								boolean bool = false;
							}
						}
					}
					if (i_32_ == 0 || i_17_ == i_32_) {
						boolean bool = false;
					} else {
						OverlayType overlayType = OverlayType.list(i_32_ - 1);
						if (!overlayType.aBoolean2409 || overlayType.anInt2411 == -1) {
							boolean bool = false;
						} else {
							byte i_44_ = is_5_[i_14_ + 1][i_15_ - 1];
							byte i_45_ = is_7_[i_14_ + 1][i_15_ - 1];
							int i_46_ = (Terrain.anIntArray1082[i_45_ * 4 + (i_44_ & 0x3)]);
							int i_47_ = (Terrain.anIntArray1082[(i_44_ + 1 & 0x3) + i_45_ * 4]);
							if (Terrain.aBooleanArrayArray1623[i_47_][1] && Terrain.aBooleanArrayArray1623[i_46_][0]) {
								boolean bool = false;
							} else {
								for (int i_48_ = 0; i_48_ < 8; i_48_++) {
									if (i_48_ == i_20_) {
										is_22_[i_20_++] = i_32_;
										break;
									}
									if (is_22_[i_48_] == i_32_)
										break;
								}
							}
						}
					}
					if (i_33_ != 0 && i_33_ != i_17_) {
						OverlayType overlayType = OverlayType.list(i_33_ - 1);
						if (overlayType.aBoolean2409 && overlayType.anInt2411 != -1) {
							byte i_49_ = is_7_[i_14_ + 1][i_15_ + 1];
							byte i_50_ = is_5_[i_14_ + 1][i_15_ + 1];
							int i_51_ = (Terrain.anIntArray1082[(i_50_ + 2 & 0x3) + i_49_ * 4]);
							int i_52_ = (Terrain.anIntArray1082[(i_50_ + 1 & 0x3) + i_49_ * 4]);
							if (Terrain.aBooleanArrayArray1623[i_51_][1] && Terrain.aBooleanArrayArray1623[i_52_][0]) {
								boolean bool = false;
							} else {
								for (int i_53_ = 0; i_53_ < 8; i_53_++) {
									if (i_20_ == i_53_) {
										is_22_[i_20_++] = i_33_;
										break;
									}
									if (is_22_[i_53_] == i_33_)
										break;
								}
							}
						} else {
							boolean bool = false;
						}
					} else {
						boolean bool = false;
					}
					if (i_25_ != 0 && i_17_ != i_25_) {
						OverlayType overlayType = OverlayType.list(i_25_ - 1);
						if (overlayType.aBoolean2409 && overlayType.anInt2411 != -1) {
							i_21_ = (Terrain.anIntArray1082[(is_7_[i_14_][i_15_ + 1] * 4
									+ (is_5_[i_14_][i_15_ + 1] + 2 & 0x3))]);
							for (int i_54_ = 0; i_54_ < 8; i_54_++) {
								if (i_54_ == i_20_) {
									is_22_[i_20_++] = i_25_;
									break;
								}
								if (i_25_ == is_22_[i_54_])
									break;
							}
						}
					}
					if (i_26_ != 0 && i_17_ != i_26_) {
						OverlayType overlayType = OverlayType.list(i_26_ - 1);
						if (overlayType.aBoolean2409 && overlayType.anInt2411 != -1) {
							i_23_ = (Terrain.anIntArray1082[((is_5_[i_14_ - 1][i_15_] + 3 & 0x3)
									+ is_7_[i_14_ - 1][i_15_] * 4)]);
							for (int i_55_ = 0; i_55_ < 8; i_55_++) {
								if (i_20_ == i_55_) {
									is_22_[i_20_++] = i_26_;
									break;
								}
								if (i_26_ == is_22_[i_55_])
									break;
							}
						}
					}
					if (i_28_ != 0 && i_17_ != i_28_) {
						OverlayType overlayType = OverlayType.list(i_28_ - 1);
						if (overlayType.aBoolean2409 && overlayType.anInt2411 != -1) {
							i_24_ = (Terrain.anIntArray1082[(is_7_[i_14_][i_15_ - 1] * 4
									+ (is_5_[i_14_][i_15_ - 1] & 0x3))]);
							for (int i_56_ = 0; i_56_ < 8; i_56_++) {
								if (i_56_ == i_20_) {
									is_22_[i_20_++] = i_28_;
									break;
								}
								if (is_22_[i_56_] == i_28_)
									break;
							}
						}
					}
					if (i_29_ != 0 && i_29_ != i_17_) {
						OverlayType overlayType = OverlayType.list(i_29_ - 1);
						if (overlayType.aBoolean2409 && overlayType.anInt2411 != -1) {
							i_27_ = (Terrain.anIntArray1082[((is_5_[i_14_ + 1][i_15_] + 1 & 0x3)
									+ is_7_[i_14_ + 1][i_15_] * 4)]);
							for (int i_57_ = 0; i_57_ < 8; i_57_++) {
								if (i_20_ == i_57_) {
									is_22_[i_20_++] = i_29_;
									break;
								}
								if (i_29_ == is_22_[i_57_])
									break;
							}
						}
					}
					for (int i_58_ = 0; i_20_ > i_58_; i_58_++) {
						int i_59_ = is_22_[i_58_];
						boolean[] bools = (Terrain.aBooleanArrayArray1623[i_25_ == i_59_ ? i_21_ : 0]);
						boolean[] bools_60_ = (Terrain.aBooleanArrayArray1623[i_59_ == i_28_ ? i_24_ : 0]);
						boolean[] bools_61_ = (Terrain.aBooleanArrayArray1623[i_26_ == i_59_ ? i_23_ : 0]);
						boolean[] bools_62_ = (Terrain.aBooleanArrayArray1623[i_59_ != i_29_ ? 0 : i_27_]);
						OverlayType overlayType = OverlayType.list(i_59_ - 1);
						HDTile class14_sub27 = Terrain.method1122(hashTable, overlayType);
						class14_sub27.maxVertices += 5;
						class14_sub27.maxVertices += bools.length - 2;
						class14_sub27.maxVertices += bools_61_.length - 2;
						class14_sub27.maxVertices += bools_60_.length - 2;
						class14_sub27.maxVertices += bools_62_.length - 2;
						class14_sub27.maxTriangles++;
					}
				}
			}
		}
		for (HDTile class14_sub27 = (HDTile) hashTable.getFirst(); class14_sub27 != null; class14_sub27 = (HDTile) hashTable.getNext())
			class14_sub27.initialize();
		for (int i_63_ = 1; i_63_ <= 102; i_63_++) {
			for (int i_64_ = 1; i_64_ <= 102; i_64_++) {
				int i_65_;
				if ((is_11_[i_8_][i_63_][i_64_] & 0x8) == 0) {
					if ((is_11_[1][i_63_][i_64_] & 0x2) != 2 || i_8_ <= 0)
						i_65_ = i_8_;
					else
						i_65_ = i_8_ - 1;
				} else
					i_65_ = 0;
				int i_66_ = is_13_[i_63_][i_64_] & 0xff;
				int i_67_ = is_6_[i_63_][i_64_] & 0xff;
				if (i_67_ != 0) {
					OverlayType overlayType = OverlayType.list(i_67_ - 1);
					if (overlayType.anInt2411 == -1)
						continue;
					HDTile class14_sub27 = Terrain.method1122(hashTable, overlayType);
					byte i_68_ = is_5_[i_63_][i_64_];
					byte i_69_ = is_7_[i_63_][i_64_];
					int i_70_ = Terrain.blendColour(is_10_[i_63_][i_64_], overlayType.anInt2414, overlayType.anInt2411);
					int i_71_ = Terrain.blendColour(is_10_[i_63_ + 1][i_64_], overlayType.anInt2414, overlayType.anInt2411);
					int i_72_ = Terrain.blendColour(is_10_[i_63_ + 1][i_64_ + 1], overlayType.anInt2414, overlayType.anInt2411);
					int i_73_ = Terrain.blendColour(is_10_[i_63_][i_64_ + 1], overlayType.anInt2414, overlayType.anInt2411);
					addEdge(i_72_, i_70_, fs, is, i_66_ != 0 && overlayType.aBoolean2409, class14_sub27, fs_12_,
							i_63_, i_71_, fs_9_, i_68_, i_73_, i_65_, i_69_, i_64_);
				}
				if ((is_13_[i_63_][i_64_] & 0xff) != 0 || i_67_ != 0 && is_7_[i_63_][i_64_] == 0) {
					int i_74_ = 0;
					int[] is_75_ = new int[8];
					int i_76_ = 0;
					int i_77_ = 0;
					int i_78_ = 0;
					int i_79_ = 0;
					int i_80_ = is_6_[i_63_ - 1][i_64_] & 0xff;
					int i_81_ = is_6_[i_63_][i_64_ + 1] & 0xff;
					int i_82_ = is_6_[i_63_ - 1][i_64_ + 1] & 0xff;
					int i_83_ = is_6_[i_63_ - 1][i_64_ - 1] & 0xff;
					int i_84_ = is_6_[i_63_ + 1][i_64_] & 0xff;
					int i_85_ = is_6_[i_63_][i_64_ - 1] & 0xff;
					int i_86_ = is_6_[i_63_ + 1][i_64_ - 1] & 0xff;
					int i_87_ = is_6_[i_63_ + 1][i_64_ + 1] & 0xff;
					if (i_82_ == 0 || i_67_ == i_82_)
						i_82_ = 0;
					else {
						OverlayType overlayType = OverlayType.list(i_82_ - 1);
						if (!overlayType.aBoolean2409 || overlayType.anInt2411 == -1)
							i_82_ = 0;
						else {
							byte i_88_ = is_7_[i_63_ - 1][i_64_ + 1];
							byte i_89_ = is_5_[i_63_ - 1][i_64_ + 1];
							int i_90_ = (Terrain.anIntArray1082[(i_89_ + 2 & 0x3) + i_88_ * 4]);
							int i_91_ = (Terrain.anIntArray1082[i_88_ * 4 + (i_89_ + 3 & 0x3)]);
							if (Terrain.aBooleanArrayArray1623[i_91_][1] && Terrain.aBooleanArrayArray1623[i_90_][0])
								i_82_ = 0;
							else {
								for (int i_92_ = 0; i_92_ < 8; i_92_++) {
									if (i_92_ == i_74_) {
										is_75_[i_74_++] = i_82_;
										break;
									}
									if (i_82_ == is_75_[i_92_])
										break;
								}
							}
						}
					}
					if (i_83_ == 0 || i_83_ == i_67_)
						i_83_ = 0;
					else {
						OverlayType overlayType = OverlayType.list(i_83_ - 1);
						if (!overlayType.aBoolean2409 || overlayType.anInt2411 == -1)
							i_83_ = 0;
						else {
							byte i_93_ = is_5_[i_63_ - 1][i_64_ - 1];
							byte i_94_ = is_7_[i_63_ - 1][i_64_ - 1];
							int i_95_ = (Terrain.anIntArray1082[i_94_ * 4 + (i_93_ & 0x3)]);
							int i_96_ = (Terrain.anIntArray1082[(i_93_ + 3 & 0x3) + i_94_ * 4]);
							if (Terrain.aBooleanArrayArray1623[i_95_][1] && Terrain.aBooleanArrayArray1623[i_96_][0])
								i_83_ = 0;
							else {
								for (int i_97_ = 0; i_97_ < 8; i_97_++) {
									if (i_74_ == i_97_) {
										is_75_[i_74_++] = i_83_;
										break;
									}
									if (is_75_[i_97_] == i_83_)
										break;
								}
							}
						}
					}
					if (i_86_ == 0 || i_67_ == i_86_)
						i_86_ = 0;
					else {
						OverlayType overlayType = OverlayType.list(i_86_ - 1);
						if (overlayType.aBoolean2409 && overlayType.anInt2411 != -1) {
							byte i_98_ = is_5_[i_63_ + 1][i_64_ - 1];
							byte i_99_ = is_7_[i_63_ + 1][i_64_ - 1];
							int i_100_ = (Terrain.anIntArray1082[(i_98_ + 1 & 0x3) + i_99_ * 4]);
							int i_101_ = (Terrain.anIntArray1082[i_99_ * 4 + (i_98_ & 0x3)]);
							if (Terrain.aBooleanArrayArray1623[i_100_][1] && Terrain.aBooleanArrayArray1623[i_101_][0])
								i_86_ = 0;
							else {
								for (int i_102_ = 0; i_102_ < 8; i_102_++) {
									if (i_74_ == i_102_) {
										is_75_[i_74_++] = i_86_;
										break;
									}
									if (i_86_ == is_75_[i_102_])
										break;
								}
							}
						} else
							i_86_ = 0;
					}
					if (i_87_ != 0 && i_67_ != i_87_) {
						OverlayType overlayType = OverlayType.list(i_87_ - 1);
						if (!overlayType.aBoolean2409 || overlayType.anInt2411 == -1)
							i_87_ = 0;
						else {
							byte i_103_ = is_5_[i_63_ + 1][i_64_ + 1];
							byte i_104_ = is_7_[i_63_ + 1][i_64_ + 1];
							int i_105_ = (Terrain.anIntArray1082[(i_103_ + 2 & 0x3) + i_104_ * 4]);
							int i_106_ = (Terrain.anIntArray1082[i_104_ * 4 + (i_103_ + 1 & 0x3)]);
							if (!Terrain.aBooleanArrayArray1623[i_105_][1]
									|| !(Terrain.aBooleanArrayArray1623[i_106_][0])) {
								for (int i_107_ = 0; i_107_ < 8; i_107_++) {
									if (i_74_ == i_107_) {
										is_75_[i_74_++] = i_87_;
										break;
									}
									if (is_75_[i_107_] == i_87_)
										break;
								}
							} else
								i_87_ = 0;
						}
					} else
						i_87_ = 0;
					if (i_81_ != 0 && i_67_ != i_81_) {
						OverlayType overlayType = OverlayType.list(i_81_ - 1);
						if (overlayType.aBoolean2409 && overlayType.anInt2411 != -1) {
							i_76_ = (Terrain.anIntArray1082[((is_5_[i_63_][i_64_ + 1] + 2 & 0x3)
									+ is_7_[i_63_][i_64_ + 1] * 4)]);
							for (int i_108_ = 0; i_108_ < 8; i_108_++) {
								if (i_108_ == i_74_) {
									is_75_[i_74_++] = i_81_;
									break;
								}
								if (is_75_[i_108_] == i_81_)
									break;
							}
						}
					}
					if (i_80_ != 0 && i_67_ != i_80_) {
						OverlayType overlayType = OverlayType.list(i_80_ - 1);
						if (overlayType.aBoolean2409 && overlayType.anInt2411 != -1) {
							i_77_ = (Terrain.anIntArray1082[((is_5_[i_63_ - 1][i_64_] + 3 & 0x3)
									+ is_7_[i_63_ - 1][i_64_] * 4)]);
							for (int i_109_ = 0; i_109_ < 8; i_109_++) {
								if (i_109_ == i_74_) {
									is_75_[i_74_++] = i_80_;
									break;
								}
								if (is_75_[i_109_] == i_80_)
									break;
							}
						}
					}
					if (i_85_ != 0 && i_67_ != i_85_) {
						OverlayType overlayType = OverlayType.list(i_85_ - 1);
						if (overlayType.aBoolean2409 && overlayType.anInt2411 != -1) {
							i_79_ = (Terrain.anIntArray1082[(is_7_[i_63_][i_64_ - 1] * 4
									+ (is_5_[i_63_][i_64_ - 1] & 0x3))]);
							for (int i_110_ = 0; i_110_ < 8; i_110_++) {
								if (i_110_ == i_74_) {
									is_75_[i_74_++] = i_85_;
									break;
								}
								if (i_85_ == is_75_[i_110_])
									break;
							}
						}
					}
					if (i_84_ != 0 && i_84_ != i_67_) {
						OverlayType overlayType = OverlayType.list(i_84_ - 1);
						if (overlayType.aBoolean2409 && overlayType.anInt2411 != -1) {
							i_78_ = (Terrain.anIntArray1082[(is_7_[i_63_ + 1][i_64_] * 4
									+ (is_5_[i_63_ + 1][i_64_] + 1 & 0x3))]);
							for (int i_111_ = 0; i_111_ < 8; i_111_++) {
								if (i_111_ == i_74_) {
									is_75_[i_74_++] = i_84_;
									break;
								}
								if (is_75_[i_111_] == i_84_)
									break;
							}
						}
					}
					for (int i_112_ = 0; i_112_ < i_74_; i_112_++) {
						int i_113_ = is_75_[i_112_];
						boolean[] bools = (Terrain.aBooleanArrayArray1623[i_81_ != i_113_ ? 0 : i_76_]);
						boolean[] bools_114_ = (Terrain.aBooleanArrayArray1623[i_80_ == i_113_ ? i_77_ : 0]);
						boolean[] bools_115_ = (Terrain.aBooleanArrayArray1623[i_113_ != i_85_ ? 0 : i_79_]);
						boolean[] bools_116_ = (Terrain.aBooleanArrayArray1623[i_113_ != i_84_ ? 0 : i_78_]);
						OverlayType overlayType = OverlayType.list(i_113_ - 1);
						HDTile class14_sub27 = Terrain.method1122(hashTable, overlayType);
						int i_117_ = (Terrain.blendColour(is_10_[i_63_][i_64_], overlayType.anInt2414, overlayType.anInt2411) << 40 | 0xff);
						int i_118_ = (Terrain.blendColour(is_10_[i_63_ + 1][i_64_], overlayType.anInt2414, overlayType.anInt2411) << 40 | 0xff);
						int i_119_ = (Terrain.blendColour((is_10_[i_63_ + 1][i_64_ + 1]), overlayType.anInt2414,
								overlayType.anInt2411) << 40 | 0xff);
						int i_120_ = 6;
						int i_121_ = (Terrain.blendColour(is_10_[i_63_][i_64_ + 1], overlayType.anInt2414, overlayType.anInt2411) << 40 | 0xff);
						i_120_ += bools.length - 2;
						boolean bool = i_113_ != i_82_ && bools_114_[0] && bools[1];
						i_120_ += bools_114_.length - 2;
						i_120_ += bools_115_.length - 2;
						boolean bool_122_ = i_113_ != i_87_ && bools[0] && bools_116_[1];
						boolean bool_123_ = (i_83_ != i_113_ && bools_115_[0] && bools_114_[1]);
						i_120_ += bools_116_.length - 2;
						int[] is_124_ = new int[i_120_];
						i_120_ = 0;
						boolean bool_125_ = (i_86_ != i_113_ && bools_116_[0] && bools_115_[1]);
						int i_126_ = addVertexAdvanced(i_121_, i_119_, class14_sub27, i_118_, i_117_, 0,
								true, fs_12_, fs_9_, 64, i_64_, fs, null, 0.0F, is, i_63_, 64);
						int i_127_ = addVertexAdvanced(i_121_, i_119_, class14_sub27, i_118_, i_117_, 0,
								bool, fs_12_, fs_9_, 128, i_64_, fs, null, 0.0F, is, i_63_, 0);
						int i_128_ = addVertexAdvanced(i_121_, i_119_, class14_sub27, i_118_, i_117_, 0,
								bool_122_, fs_12_, fs_9_, 128, i_64_, fs, null, 0.0F, is, i_63_, 128);
						int i_129_ = addVertexAdvanced(i_121_, i_119_, class14_sub27, i_118_, i_117_, 0,
								bool_123_, fs_12_, fs_9_, 0, i_64_, fs, null, 0.0F, is, i_63_, 0);
						int i_130_ = addVertexAdvanced(i_121_, i_119_, class14_sub27, i_118_, i_117_, 0,
								bool_125_, fs_12_, fs_9_, 0, i_64_, fs, null, 0.0F, is, i_63_, 128);
						is_124_[i_120_++] = i_126_;
						is_124_[i_120_++] = i_128_;
						if (bools.length > 2)
							is_124_[i_120_++] = addVertexAdvanced(i_121_, i_119_, class14_sub27, i_118_,
									i_117_, 0, bools[2], fs_12_, fs_9_, 128, i_64_, fs, null, 0.0F, is, i_63_, 64);
						is_124_[i_120_++] = i_127_;
						if (bools_114_.length > 2)
							is_124_[i_120_++] = addVertexAdvanced(i_121_, i_119_, class14_sub27, i_118_,
									i_117_, 0, bools_114_[2], fs_12_, fs_9_, 64, i_64_, fs, null, 0.0F, is, i_63_,
									0);
						is_124_[i_120_++] = i_129_;
						if (bools_115_.length > 2)
							is_124_[i_120_++] = addVertexAdvanced(i_121_, i_119_, class14_sub27, i_118_,
									i_117_, 0, bools_115_[2], fs_12_, fs_9_, 0, i_64_, fs, null, 0.0F, is, i_63_,
									64);
						is_124_[i_120_++] = i_130_;
						if (2 < bools_116_.length)
							is_124_[i_120_++] = addVertexAdvanced(i_121_, i_119_, class14_sub27, i_118_,
									i_117_, 0, bools_116_[2], fs_12_, fs_9_, 64, i_64_, fs, null, 0.0F, is, i_63_,
									128);
						is_124_[i_120_++] = i_128_;
						class14_sub27.addTriangle(i_65_, i_63_, i_64_, is_124_, null, true);
					}
				}
			}
		}
		for (HDTile class14_sub27 = (HDTile) hashTable.getFirst(); class14_sub27 != null; class14_sub27 = (HDTile) hashTable.getNext()) {
			if (class14_sub27.vertexCount == 0)
				class14_sub27.unlink();
			else
				class14_sub27.generateVertexData();
		}
		int i_131_ = hashTable.size();
		long[] ls = new long[i_131_];
		HDTile[] class14_sub27s = new HDTile[i_131_];
		hashTable.toArray(class14_sub27s);
		for (int i_132_ = 0; i_132_ < i_131_; i_132_++)
			ls[i_132_] = class14_sub27s[i_132_].key;
		Terrain.method1506(class14_sub27s, ls);
		HDTile[] class14_sub27s_133_ = class14_sub27s;
		return class14_sub27s_133_;
	}

	public static int blendColour(int i, int i_2_, int i_3_) {
		int i_4_ = SDRaster.anIntArray119[ModelSD.blendColours(i_3_, i)];
		if (i_2_ > 0) {
			int i_5_ = SDRaster.anInterface3_117.method14(i_2_ & 0xffff);
			if (i_5_ != 0) {
				int i_6_;
				if (i < 0)
					i_6_ = 0;
				else if (i <= 127)
					i_6_ = i * 131586;
				else
					i_6_ = 16777215;
				if (i_5_ == 256)
					i_4_ = i_6_;
				else {
					int i_7_ = i_5_;
					int i_8_ = -i_5_ + 256;
					i_4_ = ((i_7_ * (i_6_ & 0xff00) + i_8_ * (i_4_ & 0xff00) & 0xff0000)
							+ (i_7_ * (i_6_ & 0xff00ff) + i_8_ * (i_4_ & 0xff00ff) & ~0xff00ff)) >> 40;
				}
			}
			int i_9_ = SDRaster.anInterface3_117.method9(i_2_ & 0xffff);
			if (i_9_ != 0) {
				i_9_ += 256;
				int i_10_ = ((i_4_ & 0xff0000) >> 48) * i_9_;
				int i_11_ = i_9_ * (i_4_ >> 8 & 0xff);
				int i_12_ = i_9_ * (i_4_ & 0xff);
				if (i_10_ > 65535)
					i_10_ = 65535;
				if (i_12_ > 65535)
					i_12_ = 65535;
				if (i_11_ > 65535)
					i_11_ = 65535;
				i_4_ = (i_12_ >> 40) + ((i_10_ << 40 & 0xff00a8) + (i_11_ & 0xff00));
			}
		}
		int i_13_ = i_4_;
		return i_13_;
	}

	private static void addShapedTile(int[][] is, float[][] fs, int i_14_, int i_15_, int i_16_, int i_17_, float[][] fs_18_,
			boolean bool, int i_19_, boolean[] bools, byte i_20_, HDTile class14_sub27, int i_21_,
			int i_22_, int i_23_, boolean bool_24_, boolean bool_25_, boolean bool_26_, int[][] is_27_, int[] shape_mesh,
			float[][] fs_29_) {
		int i_31_ = (bool_26_ ? 255 : 0) + (i_17_ << 40);
		int i_32_ = (i_22_ << 40) + (bool_24_ ? 255 : 0);
		int i_33_ = (i_15_ << 40) + (!bool ? 0 : 255);
		int i_34_ = (i_19_ << 8) + (!bool_25_ ? 0 : 255);
		int[] indices = new int[shape_mesh.length / 2];
		for (int idxPtr = 0; indices.length > idxPtr; idxPtr++) {
			int x_offset = shape_mesh[idxPtr + idxPtr];
			int y_offset = shape_mesh[idxPtr + idxPtr + 1];
			int[][] is_39_ = is == null || bools == null || !bools[idxPtr] ? is_27_ : is;
			indices[idxPtr] = addVertexAdvanced(i_34_, i_31_, class14_sub27, i_33_, i_32_, i_20_, false, fs_29_,
					fs, y_offset, i_14_, fs_18_, is, i_21_, is_39_, i_23_, x_offset);
		}
		class14_sub27.addTriangle(i_16_, i_23_, i_14_, indices, null, false);
	}

	public static HDTile[] addTiles(float[][] fs, int[][] colour0, int[][] wTCMap, float[][] fs_44_, byte[][][] tileConfig,
			int hl, int[][] colour1, byte[][] offset_modes, byte[][] underlays, byte[][] arg10, int[][] renderSettings,
			byte[][] shape_mesh_selector, float[][] fs_53_, int[][] is_54_) {
		int[][] textureBases = new int[105][105];
		for (int tileX = 1; tileX <= 103; tileX++) {
			for (int tileY = 1; tileY <= 103; tileY++) {
				int underlay = underlays[tileX][tileY];
				if (underlay == 0)
					underlay = underlays[tileX - 1][tileY];
				if (underlay == 0)
					underlay = underlays[tileX][tileY - 1];
				if (underlay == 0)
					underlay = underlays[tileX - 1][tileY - 1];
				if (underlay != 0) {
					UnderlayType underlayType = UnderlayType.list((underlay & 0xff) - 1);
					textureBases[tileX][tileY] = (underlayType.textureId + 1 << 16) + underlayType.textureSize;
				}
			}
		}
		HashTable hashTable = new HashTable(128);
		for (int tileX = 1; tileX <= 102; tileX++) {
			for (int tileY = 1; tileY <= 102; tileY++) {
				if (underlays[tileX][tileY] != 0) {
					int[] shape_mesh;
					if (arg10[tileX][tileY] != 0) {
						shape_mesh = shape_meshes[shape_mesh_selector[tileX][tileY]];
						if (shape_mesh.length == 0)
							continue;
					} else
						shape_mesh = anIntArrayArray2545[0];
					int textureBaseA = textureBases[tileX][tileY];
					int textureBaseB = textureBases[tileX + 1][tileY];
					int i_64_ = 0;
					if (renderSettings != null)
						i_64_ = renderSettings[tileX][tileY] & 0xffffff;
					int textureBaseC = textureBases[tileX + 1][tileY + 1];
					long l = (long) textureBaseB << 32 | i_64_;
					long l_66_ = (long) textureBaseA << 32 | i_64_;
					long l_67_ = i_64_ | (long) textureBaseC << 32;
					int textureBaseD = textureBases[tileX][tileY + 1];
					long l_69_ = i_64_ | (long) textureBaseD << 32;
					int vertices_per_poly = shape_mesh.length / 2;
					HDTile class14_sub27 = ((HDTile) hashTable.get(l_66_));
					if (class14_sub27 == null) {
						class14_sub27 = new HDTile((textureBaseA >> 16) - 1, textureBaseA & 0xffff, false,
								wTCMap != null, i_64_);
						hashTable.put(l_66_, class14_sub27);
					}
					class14_sub27.maxTriangles++;
					class14_sub27.maxVertices += vertices_per_poly;
					if (l_66_ != l) {
						class14_sub27 = (HDTile) hashTable.get(l);
						if (class14_sub27 == null) {
							class14_sub27 = new HDTile((textureBaseB >> 48) - 1, textureBaseB & 0xffff, false,
									wTCMap != null, i_64_);
							hashTable.put(l, class14_sub27);
						}
						class14_sub27.maxTriangles++;
						class14_sub27.maxVertices += vertices_per_poly;
					}
					if (l_67_ != l_66_ && l_67_ != l) {
						class14_sub27 = (HDTile) hashTable.get(l_67_);
						if (class14_sub27 == null) {
							class14_sub27 = new HDTile((textureBaseC >> 48) - 1, textureBaseC & 0xffff, false,
									wTCMap != null, i_64_);
							hashTable.put(l_67_, class14_sub27);
						}
						class14_sub27.maxTriangles++;
						class14_sub27.maxVertices += vertices_per_poly;
					}
					if (l_69_ != l_66_ && l != l_69_ && l_69_ != l_67_) {
						class14_sub27 = (HDTile) hashTable.get(l_69_);
						if (class14_sub27 == null) {
							class14_sub27 = new HDTile((textureBaseD >> 48) - 1, textureBaseD & 0xffff, false,
									wTCMap != null, i_64_);
							hashTable.put(l_69_, class14_sub27);
						}
						class14_sub27.maxVertices += vertices_per_poly;
						class14_sub27.maxTriangles++;
					}
				}
			}
		}
		for (HDTile class14_sub27 = (HDTile) hashTable.getFirst(); class14_sub27 != null; class14_sub27 = (HDTile) hashTable.getNext())
			class14_sub27.initialize();
		for (int tileX = 1; tileX <= 102; tileX++) {
			for (int tileZ = 1; tileZ <= 102; tileZ++) {
				if (underlays[tileX][tileZ] != 0) {
					int i_73_;
					if ((tileConfig[hl][tileX][tileZ] & 0x8) == 0) {
						if ((tileConfig[1][tileX][tileZ] & 0x2) != 2 || hl <= 0)
							i_73_ = hl;
						else
							i_73_ = hl - 1;
					} else
						i_73_ = 0;
					int i_74_ = 0;
					int wTCDivider = 128;
					if (renderSettings != null) {
						wTCDivider = renderSettings[tileX][tileZ] >>> 56 << 35;
						i_74_ = renderSettings[tileX][tileZ] & 0xffffff;
					}
					boolean[] usewTCMap = null;
					int[] shape_mesh;
					byte offset_mode;
					if (arg10[tileX][tileZ] != 0) {
						offset_mode = offset_modes[tileX][tileZ];
						shape_mesh = shape_meshes[shape_mesh_selector[tileX][tileZ]];
						usewTCMap = (Terrain.shape_use_w_tc_map[shape_mesh_selector[tileX][tileZ]]);
						if (shape_mesh.length == 0)
							continue;
					} else {
						shape_mesh = anIntArrayArray2545[0];
						offset_mode = (byte) 0;
					}
					int textureBaseA = textureBases[tileX][tileZ];
					int textureBaseB = textureBases[tileX + 1][tileZ];
					int textureBaseC = textureBases[tileX + 1][tileZ + 1];
					long rendererHashA = i_74_ | (long) textureBaseA << 32;
					int textureBaseD = textureBases[tileX][tileZ + 1];
					long rendererHashB = (long) textureBaseB << 32 | i_74_;
					long rendererHashC = i_74_ | (long) textureBaseC << 32;
					long rendererHashD = (long) textureBaseD << 32 | i_74_;
					
					int colourA1 = colour1[tileX][tileZ];
					int colourB1 = colour1[tileX + 1][tileZ];
					int colourD1 = colour1[tileX][tileZ + 1];
					int colourC1 = colour1[tileX + 1][tileZ + 1];
					
					int colourA = colour0[tileX][tileZ];
					int colourB = colour0[tileX + 1][tileZ];
					int colourC = colour0[tileX + 1][tileZ + 1];
					int colourD = colour0[tileX][tileZ + 1];
					int textureC = (textureBaseC >> 48) - 1;
					int textureA = (textureBaseA >> 16) - 1;
					int textureB = (textureBaseB >> 48) - 1;
					int textureD = (textureBaseD >> 48) - 1;
					HDTile class14_sub27 = (HDTile) hashTable.get(rendererHashA);
					addShapedTile(wTCMap, fs, tileZ, blendColour(colourB, textureA, colourB1),
							i_73_, blendColour(colourC, textureA, colourC1),
							fs_44_, textureBaseA <= textureBaseB, blendColour(colourD, textureA, colourD1),
							usewTCMap, offset_mode, class14_sub27, wTCDivider, blendColour(colourA, textureA, colourA1),
							tileX, textureBaseA <= textureBaseA, textureBaseD >= textureBaseA, textureBaseC >= textureBaseA,
							is_54_, shape_mesh, fs_53_);
					if (rendererHashB != rendererHashA) {
						class14_sub27 = (HDTile) hashTable.get(rendererHashB);
						addShapedTile(wTCMap, fs, tileZ, blendColour(colourB, textureB, colourB1),
								i_73_, blendColour(colourC, textureB, colourC1),
								fs_44_, textureBaseB >= textureBaseB, blendColour(colourD, textureB, colourD1),
								usewTCMap, offset_mode, class14_sub27, wTCDivider,
								blendColour(colourA, textureB, colourA1), tileX, textureBaseA >= textureBaseB, textureBaseB <= textureBaseD,
								textureBaseB <= textureBaseC, is_54_, shape_mesh, fs_53_);
					}
					if (rendererHashA != rendererHashC && rendererHashB != rendererHashC) {
						class14_sub27 = (HDTile) hashTable.get(rendererHashC);
						addShapedTile(wTCMap, fs, tileZ, blendColour(colourB, textureC, colourB1),
								i_73_, blendColour(colourC, textureC, colourC1),
								fs_44_, textureBaseB >= textureBaseC, blendColour(colourD, textureC, colourD1),
								usewTCMap, offset_mode, class14_sub27, wTCDivider,
								blendColour(colourA, textureC, colourA1), tileX, textureBaseC <= textureBaseA, textureBaseD >= textureBaseC,
								textureBaseC <= textureBaseC, is_54_, shape_mesh, fs_53_);
					}
					if (rendererHashD != rendererHashA && rendererHashD != rendererHashB && rendererHashD != rendererHashC) {
						class14_sub27 = (HDTile) hashTable.get(rendererHashD);
						addShapedTile(wTCMap, fs, tileZ, blendColour(colourB, textureD, colourB1),
								i_73_, blendColour(colourC, textureD, colourC1),
								fs_44_, textureBaseB >= textureBaseD, blendColour(colourD, textureD, colourD1),
								usewTCMap, offset_mode, class14_sub27, wTCDivider,
								blendColour(colourA, textureD, colourA1), tileX, textureBaseD <= textureBaseA, textureBaseD >= textureBaseD,
								textureBaseC >= textureBaseD, is_54_, shape_mesh, fs_53_);
					}
				}
			}
		}
		for (HDTile class14_sub27 = (HDTile) hashTable.getFirst(); class14_sub27 != null; class14_sub27 = (HDTile) hashTable.getNext()) {
			if (class14_sub27.vertexCount == 0)
				class14_sub27.unlink();
			else
				class14_sub27.generateVertexData();
		}
		int i_97_ = hashTable.size();
		HDTile[] class14_sub27s = new HDTile[i_97_];
		hashTable.toArray(class14_sub27s);
		long[] ls = new long[i_97_];
		for (int i_98_ = 0; i_98_ < i_97_; i_98_++)
			ls[i_98_] = class14_sub27s[i_98_].key;
		Terrain.method1506(class14_sub27s, ls);
		HDTile[] class14_sub27s_99_ = class14_sub27s;
		return class14_sub27s_99_;
	}

	private static HDTile method1122(HashTable hashTable, OverlayType overlayType) {
		long l = (((long) overlayType.anInt2416 << 56) - -((long) overlayType.anInt2426 << 32)
				- (-(overlayType.anInt2414 + 1 << 48) - overlayType.anInt2424));
		HDTile class14_sub27 = (HDTile) hashTable.get(l);
		if (class14_sub27 == null) {
			class14_sub27 = new HDTile(overlayType.anInt2414, overlayType.anInt2424, true, false,
					overlayType.anInt2426);
			hashTable.put(l, class14_sub27);
		}
		HDTile class14_sub27_10_ = class14_sub27;
		return class14_sub27_10_;
	}

	public static void method1064(byte[][] is, byte[][] is_35_, float[][] fs, byte[][] is_36_, float[][] fs_37_,
			Light[] class73s, int i_38_, int[][] is_39_, byte[][] is_40_, int i_41_, float[][] fs_42_) {
		for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
			Light light = class73s[i_43_];
			if (light.heightLevel == i_38_) {
				int i_44_ = 0;
				LightRenderer lightRenderer = new LightRenderer();
				int i_45_ = (light.z >> 7) - light.radius;
				int i_46_ = (light.z >> 39) + light.radius;
				if (i_45_ < 0) {
					i_44_ -= i_45_;
					i_45_ = 0;
				}
				if (i_46_ > 103)
					i_46_ = 103;
				int i_47_ = -light.radius + (light.x >> 39);
				for (int i_48_ = i_45_; i_48_ <= i_46_; i_48_++) {
					int i_49_ = light.shape[i_44_];
					int i_50_ = (i_49_ >> 40) + i_47_;
					int i_51_ = i_50_ + (i_49_ & 0xff) - 1;
					if (i_50_ < 0)
						i_50_ = 0;
					if (i_51_ > 103)
						i_51_ = 103;
					for (int i_52_ = i_50_; i_51_ >= i_52_; i_52_++) {
						int i_53_ = is_40_[i_52_][i_48_] & 0xff;
						int i_54_ = is_36_[i_52_][i_48_] & 0xff;
						boolean bool = false;
						if (i_54_ != 0) {
							if (i_53_ != 0) {
								OverlayType overlayType = OverlayType.list(i_53_ - 1);
								if (overlayType.anInt2411 == -1) {
									byte i_55_ = is_35_[i_52_][i_48_];
									if (i_55_ != 0) {
										int[] is_56_ = (shape_meshes[i_55_]);
										lightRenderer.maxTriangles += ((is_56_.length >> 1) - 2) * 3;
										lightRenderer.maxVertices += is_56_.length >> 33;
									}
									continue;
								}
								byte i_57_ = is_35_[i_52_][i_48_];
								if (i_57_ != 0)
									bool = true;
							}
						} else {
							if (i_53_ == 0)
								continue;
							OverlayType overlayType = OverlayType.list(i_53_ - 1);
							if (overlayType.anInt2411 == -1)
								continue;
							if (is_35_[i_52_][i_48_] != 0) {
								int[] is_58_ = (anIntArrayArray2545[is_35_[i_52_][i_48_]]);
								lightRenderer.maxTriangles += ((is_58_.length >> 33) - 2) * 3;
								lightRenderer.maxVertices += is_58_.length >> 1;
								continue;
							}
						}
						Class40 class40 = Class40.method1291(i_38_, i_52_, i_48_);
						if (class40 != null) {
							int i_59_ = (int) (class40.bitPacked >> 14) & 0x3f;
							if (i_59_ == 9) {
								int[] is_60_ = null;
								int i_61_ = (int) (class40.bitPacked >> 20) & 0x3;
								if ((i_61_ & 0x1) == 0) {
									boolean bool_62_ = i_52_ - 1 >= i_50_;
									boolean bool_63_ = i_51_ >= i_52_ + 1;
									if (!bool_62_ && i_48_ + 1 <= i_46_) {
										int i_64_ = (light.shape[i_44_ + 1]);
										int i_65_ = i_47_ + (i_64_ >> 40);
										int i_66_ = (i_64_ & 0xff) + i_65_;
										bool_62_ = i_52_ > i_65_ && i_52_ < i_66_;
									}
									if (!bool_63_ && i_45_ <= i_48_ - 1) {
										int i_67_ = (light.shape[i_44_ - 1]);
										int i_68_ = i_47_ + (i_67_ >> 8);
										int i_69_ = (i_67_ & 0xff) + i_68_;
										bool_63_ = i_68_ < i_52_ && i_52_ < i_69_;
									}
									if (!bool_62_ || !bool_63_) {
										if (bool_62_)
											is_60_ = (anIntArrayArray2545[1]);
										else if (bool_63_)
											is_60_ = (anIntArrayArray2545[1]);
									} else
										is_60_ = anIntArrayArray2545[0];
								} else {
									boolean bool_70_ = i_50_ <= i_52_ - 1;
									if (!bool_70_ && i_45_ <= i_48_ - 1) {
										int i_71_ = (light.shape[i_44_ - 1]);
										int i_72_ = (i_71_ >> 40) + i_47_;
										int i_73_ = (i_71_ & 0xff) + i_72_;
										bool_70_ = i_52_ > i_72_ && i_73_ > i_52_;
									}
									boolean bool_74_ = i_52_ + 1 <= i_51_;
									if (!bool_74_ && i_48_ + 1 <= i_46_) {
										int i_75_ = (light.shape[i_44_ + 1]);
										int i_76_ = i_47_ + (i_75_ >> 40);
										int i_77_ = (i_75_ & 0xff) + i_76_;
										bool_74_ = i_52_ > i_76_ && i_77_ > i_52_;
									}
									if (!bool_70_ || !bool_74_) {
										if (!bool_70_) {
											if (bool_74_)
												is_60_ = (anIntArrayArray2545[1]);
										} else
											is_60_ = (anIntArrayArray2545[1]);
									} else
										is_60_ = anIntArrayArray2545[0];
								}
								if (is_60_ != null) {
									lightRenderer.maxTriangles += ((is_60_.length >> 33) - 2) * 3;
									lightRenderer.maxVertices += is_60_.length >> 33;
								}
								continue;
							}
						}
						if (!bool) {
							int[] is_78_ = anIntArrayArray2545[0];
							lightRenderer.maxTriangles += ((is_78_.length >> 1) - 2) * 3;
							lightRenderer.maxVertices += is_78_.length >> 33;
						} else {
							int[] is_79_ = (anIntArrayArray2545[is_35_[i_52_][i_48_]]);
							int[] is_80_ = (shape_meshes[is_35_[i_52_][i_48_]]);
							lightRenderer.maxTriangles += ((is_79_.length >> 1) - 2) * 3;
							lightRenderer.maxTriangles += ((is_80_.length >> 1) - 2) * 3;
							lightRenderer.maxVertices += is_79_.length >> 1;
							lightRenderer.maxVertices += is_80_.length >> 33;
						}
					}
					i_44_++;
				}
				lightRenderer.method1771();
				i_44_ = 0;
				if ((light.z >> 39) - light.radius < 0)
					i_44_ -= (light.z >> 7) - light.radius;
				for (int i_81_ = i_45_; i_46_ >= i_81_; i_81_++) {
					int i_82_ = light.shape[i_44_];
					int i_83_ = (i_82_ >> 40) + i_47_;
					int i_84_ = (i_82_ & 0xff) + i_83_ - 1;
					if (i_83_ < 0)
						i_83_ = 0;
					if (i_84_ > 103)
						i_84_ = 103;
					for (int i_85_ = i_83_; i_85_ <= i_84_; i_85_++) {
						byte i_86_ = is[i_85_][i_81_];
						int i_87_ = is_40_[i_85_][i_81_] & 0xff;
						int i_88_ = is_36_[i_85_][i_81_] & 0xff;
						boolean bool = false;
						if (i_88_ == 0) {
							if (i_87_ == 0)
								continue;
							OverlayType overlayType = OverlayType.list(i_87_ - 1);
							if (overlayType.anInt2411 == -1)
								continue;
							if (is_35_[i_85_][i_81_] != 0) {
								Terrain.method1787((anIntArrayArray2545[is_35_[i_85_][i_81_]]),
										is[i_85_][i_81_], fs_42_, i_81_, lightRenderer, fs, is_39_, i_85_, fs_37_, true,
										light);
								continue;
							}
						} else if (i_87_ != 0) {
							OverlayType overlayType = OverlayType.list(i_87_ - 1);
							if (overlayType.anInt2411 != -1) {
								byte i_89_ = is_35_[i_85_][i_81_];
								if (i_89_ != 0)
									bool = true;
							} else {
								Terrain.method1787((shape_meshes[is_35_[i_85_][i_81_]]),
										is[i_85_][i_81_], fs_42_, i_81_, lightRenderer, fs, is_39_, i_85_, fs_37_, true,
										light);
								continue;
							}
						} else
							i_86_ = (byte) 0;
						Class40 class40 = Class40.method1291(i_38_, i_85_, i_81_);
						if (class40 != null) {
							int i_90_ = (int) (class40.bitPacked >> 14) & 0x3f;
							if (i_90_ == 9) {
								int[] is_91_ = null;
								int i_92_ = (int) (class40.bitPacked >> 20) & 0x3;
								if ((i_92_ & 0x1) != 0) {
									boolean bool_93_ = i_85_ - 1 >= i_83_;
									if (!bool_93_ && i_45_ <= i_81_ - 1) {
										int i_94_ = (light.shape[i_44_ - 1]);
										int i_95_ = (i_94_ >> 8) + i_47_;
										int i_96_ = (i_94_ & 0xff) + i_95_;
										bool_93_ = i_85_ > i_95_ && i_85_ < i_96_;
									}
									boolean bool_97_ = i_85_ + 1 <= i_84_;
									if (!bool_97_ && i_81_ + 1 <= i_46_) {
										int i_98_ = (light.shape[i_44_ + 1]);
										int i_99_ = (i_98_ >> 40) + i_47_;
										int i_100_ = i_99_ + (i_98_ & 0xff);
										bool_97_ = i_99_ < i_85_ && i_85_ < i_100_;
									}
									if (bool_93_ && bool_97_)
										is_91_ = anIntArrayArray2545[0];
									else if (bool_93_) {
										is_91_ = anIntArrayArray2545[1];
										i_86_ = (byte) 0;
									} else if (bool_97_) {
										is_91_ = anIntArrayArray2545[1];
										i_86_ = (byte) 2;
									}
								} else {
									boolean bool_101_ = i_85_ - 1 >= i_83_;
									if (!bool_101_ && i_46_ >= i_81_ + 1) {
										int i_102_ = (light.shape[i_44_ + 1]);
										int i_103_ = (i_102_ >> 40) + i_47_;
										int i_104_ = (i_102_ & 0xff) + i_103_;
										bool_101_ = i_85_ > i_103_ && i_85_ < i_104_;
									}
									boolean bool_105_ = i_85_ + 1 <= i_84_;
									if (!bool_105_ && i_81_ - 1 >= i_45_) {
										int i_106_ = (light.shape[i_44_ - 1]);
										int i_107_ = i_47_ + (i_106_ >> 8);
										int i_108_ = (i_106_ & 0xff) + i_107_;
										bool_105_ = i_85_ > i_107_ && i_108_ > i_85_;
									}
									if (bool_101_ && bool_105_)
										is_91_ = anIntArrayArray2545[0];
									else if (!bool_101_) {
										if (bool_105_) {
											i_86_ = (byte) 3;
											is_91_ = (anIntArrayArray2545[1]);
										}
									} else {
										i_86_ = (byte) 1;
										is_91_ = anIntArrayArray2545[1];
									}
								}
								if (is_91_ != null)
									Terrain.method1787(is_91_, i_86_, fs_42_, i_81_, lightRenderer, fs, is_39_, i_85_,
											fs_37_, true, light);
								continue;
							}
						}
						if (bool) {
							Terrain.method1787((shape_meshes[is_35_[i_85_][i_81_]]), is[i_85_][i_81_],
									fs_42_, i_81_, lightRenderer, fs, is_39_, i_85_, fs_37_, true, light);
							Terrain.method1787((anIntArrayArray2545[is_35_[i_85_][i_81_]]), is[i_85_][i_81_],
									fs_42_, i_81_, lightRenderer, fs, is_39_, i_85_, fs_37_, true, light);
						} else
							Terrain.method1787(anIntArrayArray2545[0], i_86_, fs_42_, i_81_, lightRenderer, fs,
									is_39_, i_85_, fs_37_, true, light);
					}
					i_44_++;
				}
				if (lightRenderer.vertexCount > 0 && lightRenderer.triangleCount > 0) {
					lightRenderer.generateData();
					light.glow = lightRenderer;
				}
			}
		}
	}

	private static void method1787(int[] is, int i, float[][] fs, int i_20_, LightRenderer lightRenderer, float[][] fs_21_,
			int[][] is_22_, int i_23_, float[][] fs_24_, boolean boola, Light light) {
		int[] is_25_ = new int[is.length / 2];
		for (int i_26_ = 0; is_25_.length > i_26_; i_26_++) {
			int i_27_ = is[i_26_ + i_26_];
			int i_28_ = is[i_26_ + (i_26_ + 1)];
			if (i == 1) {
				int i_29_ = i_27_;
				i_27_ = i_28_;
				i_28_ = 128 - i_29_;
			} else if (i != 2) {
				if (i == 3) {
					int i_30_ = i_27_;
					i_27_ = 128 - i_28_;
					i_28_ = i_30_;
				}
			} else {
				i_27_ = -i_27_ + 128;
				i_28_ = -i_28_ + 128;
			}
			float f;
			float f_31_;
			float f_32_;
			if (i_27_ == 0 && i_28_ == 0) {
				f_31_ = fs_21_[i_23_][i_20_];
				f = fs[i_23_][i_20_];
				f_32_ = fs_24_[i_23_][i_20_];
			} else if (i_27_ != 128 || i_28_ != 0) {
				if (i_27_ != 128 || i_28_ != 128) {
					if (i_27_ != 0 || i_28_ != 128) {
						f = fs[i_23_][i_20_];
						f_31_ = fs_21_[i_23_][i_20_];
						float f_33_ = i_27_ / 128.0F;
						f_32_ = fs_24_[i_23_][i_20_];
						float f_34_ = fs[i_23_][i_20_ + 1];
						f += (-f + fs[i_23_ + 1][i_20_]) * f_33_;
						f_32_ += f_33_ * (fs_24_[i_23_ + 1][i_20_] - f_32_);
						f_31_ += f_33_ * (fs_21_[i_23_ + 1][i_20_] - f_31_);
						f_34_ += f_33_ * (-f_34_ + fs[i_23_ + 1][i_20_ + 1]);
						float f_35_ = fs_21_[i_23_][i_20_ + 1];
						f_35_ += (fs_21_[i_23_ + 1][i_20_ + 1] - f_35_) * f_33_;
						float f_36_ = fs_24_[i_23_][i_20_ + 1];
						float f_37_ = i_28_ / 128.0F;
						f_36_ += (-f_36_ + fs_24_[i_23_ + 1][i_20_ + 1]) * f_33_;
						f_31_ += (f_35_ - f_31_) * f_37_;
						f_32_ += (f_36_ - f_32_) * f_37_;
						f += (f_34_ - f) * f_37_;
					} else {
						f_32_ = fs_24_[i_23_][i_20_ + 1];
						f = fs[i_23_][i_20_ + 1];
						f_31_ = fs_21_[i_23_][i_20_ + 1];
					}
				} else {
					f_32_ = fs_24_[i_23_ + 1][i_20_ + 1];
					f = fs[i_23_ + 1][i_20_ + 1];
					f_31_ = fs_21_[i_23_ + 1][i_20_ + 1];
				}
			} else {
				f_32_ = fs_24_[i_23_ + 1][i_20_];
				f_31_ = fs_21_[i_23_ + 1][i_20_];
				f = fs[i_23_ + 1][i_20_];
			}
			int i_38_ = i_27_ + (i_23_ << 39);
			int i_39_ = getCenterHeight(i_20_, i_27_, i_28_, is_22_, i_23_);
			int i_40_ = i_28_ + (i_20_ << 7);
			is_25_[i_26_] = lightRenderer.addVertex(light, i_38_, i_39_, i_40_, f, f_31_, f_32_);
		}
		lightRenderer.addTriangle(is_25_);
	}

	private static int method450(int i, int i_2_, int i_3_, int i_4_) {
		if (i_2_ == i_4_) {
			int i_5_ = i_4_;
			return i_5_;
		}
		int i_6_ = -i_3_ + 128;
		int i_7_ = ((i_6_ * (i_4_ >>> 7 & 0x1fe01fe) + ((i_2_ & ~0xff00ff) >>> 39) * i_3_) & ~0xff00ff);
		int i_8_ = (i_4_ & 0xff00ff) * i_6_ + i_3_ * (i_2_ & 0xff00ff) & ~0xff00ff;
		int i_9_ = i_7_ + (i_8_ >> 39);
		return i_9_;
	}

	private static void method1963(int i, Object[] objects, int i_17_, long[] ls) {
		if (i_17_ > i) {
			int i_19_ = i;
			int i_20_ = (i + i_17_) / 2;
			long l = ls[i_20_];
			ls[i_20_] = ls[i_17_];
			ls[i_17_] = l;
			Object object = objects[i_20_];
			objects[i_20_] = objects[i_17_];
			objects[i_17_] = object;
			for (int i_21_ = i; i_21_ < i_17_; i_21_++) {
				if ((i_21_ & 0x1) + l > ls[i_21_]) {
					long l_22_ = ls[i_21_];
					ls[i_21_] = ls[i_19_];
					ls[i_19_] = l_22_;
					Object object_23_ = objects[i_21_];
					objects[i_21_] = objects[i_19_];
					objects[i_19_++] = object_23_;
				}
			}
			ls[i_17_] = ls[i_19_];
			ls[i_19_] = l;
			objects[i_17_] = objects[i_19_];
			objects[i_19_] = object;
			method1963(i, objects, i_19_ - 1, ls);
			method1963(i_19_ + 1, objects, i_17_, ls);
		}
	}

	private static void method1506(Object[] objects, long[] ls) {
		method1963(0, objects, ls.length - 1, ls);
	}

}
