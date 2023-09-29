export interface Base64Plugin {
  getBase64(options: { path: string }): Promise<{ base64: string }>;
}
